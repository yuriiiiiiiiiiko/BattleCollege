package com.example.yuzukifukushima.battlecollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Start extends AppCompatActivity implements OnClickListener{

    private Button button_segue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button_segue=(Button)findViewById(R.id.button2);
        button_segue.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v==button_segue){
            Intent intent = new Intent(this, Room.class);
            startActivityForResult(intent,0);
        }
    }
}

