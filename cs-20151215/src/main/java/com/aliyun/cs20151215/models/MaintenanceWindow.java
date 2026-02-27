// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MaintenanceWindow extends TeaModel {
    /**
     * <p>The duration of the cluster maintenance window. </p>
     * <p>Valid values: 1 to 24. </p>
     * <p>Unit: hours.</p>
     * <p>Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3h</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <p>Specifies whether to enable the cluster maintenance window. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the cluster maintenance window.</li>
     * <li><code>false</code>: disables the cluster maintenance window.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The start time of the cluster maintenance window. The value follows a standard time format in Golang. Example: 15:04:05Z.</p>
     * 
     * <strong>example:</strong>
     * <p>03:00:00Z</p>
     */
    @NameInMap("maintenance_time")
    public String maintenanceTime;

    /**
     * <p>Defines a maintenance window recurrence rule by using the RFC5545 recurrence rule. Currently, only FREQ=WEEKLY is supported, and you cannot specify COUNT or UNTIL.</p>
     * 
     * <strong>example:</strong>
     * <p>FREQ=WEEKLY;INTERVAL=4;BYDAY=MO,TU</p>
     */
    @NameInMap("recurrence")
    public String recurrence;

    /**
     * <p>The day of the week when maintenance is performed. Separate multiple days with commas (,). </p>
     * <p>Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
     * <p>Default value: <code>Thursday</code>.</p>
     * 
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
