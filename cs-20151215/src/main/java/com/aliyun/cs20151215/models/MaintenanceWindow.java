// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class MaintenanceWindow extends TeaModel {
    /**
     * <p>The maintenance duration. Valid values: 1 to 24. Unit: hours.</p>
     * <p>Default value: 3h.</p>
     * 
     * <strong>example:</strong>
     * <p>3h</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <p>Specifies whether to enable the maintenance window. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enables the maintenance window.</li>
     * <li><code>false</code>: Does not enable the maintenance window.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The list of exclusions for the maintenance window. A maximum of 10 exclusions are supported. Exclusions take precedence over the maintenance window. If an active exclusion covers an O&amp;M type, the O&amp;M operation is not performed even if the current time is within the maintenance window. If multiple exclusions are active at the same time, the union of the exclusions is applied. The total number of NoOperations and NoUpgrades exclusions cannot exceed 3. Only one-time periods are supported. Periodic configurations are not supported.</p>
     */
    @NameInMap("exclusions")
    public java.util.List<MaintenanceWindowExclusions> exclusions;

    /**
     * <p>The start time of the maintenance window. The time must be in the RFC 3339 standard format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-15T12:31:00.000+08:00</p>
     */
    @NameInMap("maintenance_time")
    public String maintenanceTime;

    /**
     * <p>The recurrence rule for the maintenance window, defined by using the RFC 5545 Recurrence Rule syntax. Only FREQ=WEEKLY is supported. COUNT and UNTIL are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>FREQ=WEEKLY;INTERVAL=4;BYDAY=MO,TU</p>
     */
    @NameInMap("recurrence")
    public String recurrence;

    /**
     * <p>The weekly maintenance period. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
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

    public MaintenanceWindow setExclusions(java.util.List<MaintenanceWindowExclusions> exclusions) {
        this.exclusions = exclusions;
        return this;
    }
    public java.util.List<MaintenanceWindowExclusions> getExclusions() {
        return this.exclusions;
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

    public static class MaintenanceWindowExclusions extends TeaModel {
        /**
         * <p>The description of the exclusion. The description can be up to 128 characters in length and does not support 4-byte characters such as emojis.</p>
         * 
         * <strong>example:</strong>
         * <p>No changes are allowed during the change freeze period</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The end time of the exclusion. The time must be in the RFC 3339 standard format, later than the start_time, and later than the current time. Maximum duration for a single exclusion: 30 days for NoOperations, NoUpgrades, and NoCVEPatch, and 180 days for NoMinorUpgrades.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-15T00:00:00+08:00</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <p>The name of the exclusion. The name must be 1 to 63 characters in length and can contain digits, underscores (_), and hyphens (-). It must start with an uppercase or lowercase letter, a Chinese character, or a digit. The name must be unique within the same maintenance window. If you do not specify this parameter, a default name in the format of exclusion-{random string} is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>exclusion-holiday</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The scope of the exclusion, which specifies the proactive O&amp;M types that are prohibited during this time period. Valid values (case-sensitive):</p>
         * <ul>
         * <li>NoOperations: Prohibits all proactive O&amp;M operations, including cluster upgrades, component upgrades, CVE patching, and OS image updates.</li>
         * <li>NoUpgrades: Prohibits cluster upgrades and component upgrades, but still allows CVE patching and responses to scheduled ECS events.</li>
         * <li>NoMinorUpgrades: Prohibits only minor version upgrades for clusters, but still allows patch upgrades, component upgrades, and CVE patching.</li>
         * <li>NoCVEPatch: Prohibits automatic CVE patching.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoOperations</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The start time of the exclusion. The time must be in the RFC 3339 standard format and use the same time zone offset as the end_time and maintenance_time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T00:00:00+08:00</p>
         */
        @NameInMap("start_time")
        public String startTime;

        public static MaintenanceWindowExclusions build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceWindowExclusions self = new MaintenanceWindowExclusions();
            return TeaModel.build(map, self);
        }

        public MaintenanceWindowExclusions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MaintenanceWindowExclusions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public MaintenanceWindowExclusions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MaintenanceWindowExclusions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public MaintenanceWindowExclusions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
