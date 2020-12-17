// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MaintenanceWindow extends TeaModel {
    // 是否开启维护窗口。默认值false。
    @NameInMap("enable")
    public Boolean enable;

    // 维护起始时间。Golang标准时间格式"15:04:05Z"。
    @NameInMap("maintenance_time")
    public String maintenanceTime;

    // 维护时长。取值范围1～24，单位为小时。 默认值：3h。
    @NameInMap("duration")
    public String duration;

    // 维护周期。取值范围为:Monday~Sunday，多个值用逗号分隔。 默认值：Thursday。
    @NameInMap("weekly_period")
    public String weeklyPeriod;

    public static MaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
        MaintenanceWindow self = new MaintenanceWindow();
        return TeaModel.build(map, self);
    }

    public MaintenanceWindow setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public MaintenanceWindow setMaintenanceTime(String maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
        return this;
    }
    public String getMaintenanceTime() {
        return this.maintenanceTime;
    }

    public MaintenanceWindow setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public MaintenanceWindow setWeeklyPeriod(String weeklyPeriod) {
        this.weeklyPeriod = weeklyPeriod;
        return this;
    }
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

}
