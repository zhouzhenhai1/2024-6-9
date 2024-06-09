package com.zzh.ssm.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_dormitory")
@Data
public class Dormitory {
    private String building;
    private Integer sex;
}
