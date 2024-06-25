// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MaintenanceWindow extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3h</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>03:00:00Z</p>
     */
    @NameInMap("maintenance_time")
    public String maintenanceTime;

    /**
     * <strong>example:</strong>
     * <p>FREQ=WEEKLY;INTERVAL=4;BYDAY=MO,TU</p>
     */
    @NameInMap("recurrence")
    public String recurrence;

    /**
     * <strong>example:</strong>
     * <p>Monday,Thursday</p>
     */
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

    public MaintenanceWindow setRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public String getRecurrence() {
        return this.recurrence;
    }

    public MaintenanceWindow setWeeklyPeriod(String weeklyPeriod) {
        this.weeklyPeriod = weeklyPeriod;
        return this;
    }
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

}
