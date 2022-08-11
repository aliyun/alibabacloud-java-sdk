// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MaintenanceWindow extends TeaModel {
    @NameInMap("duration")
    public String duration;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("maintenance_time")
    public String maintenanceTime;

    @NameInMap("weekly_period")
    public String weeklyPeriod;

    public static MaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
        MaintenanceWindow self = new MaintenanceWindow();
        return TeaModel.build(map, self);
    }

    public MaintenanceWindow setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
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

    public MaintenanceWindow setWeeklyPeriod(String weeklyPeriod) {
        this.weeklyPeriod = weeklyPeriod;
        return this;
    }
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

}
