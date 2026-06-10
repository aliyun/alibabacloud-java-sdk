// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyTimerGroupRequest extends TeaModel {
    /**
     * <p>The scheduled task configurations.</p>
     */
    @NameInMap("ConfigTimers")
    public java.util.List<ModifyTimerGroupRequestConfigTimers> configTimers;

    /**
     * <p>The description of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. This feature is not tied to a specific region, but you must set this parameter to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyTimerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTimerGroupRequest self = new ModifyTimerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTimerGroupRequest setConfigTimers(java.util.List<ModifyTimerGroupRequestConfigTimers> configTimers) {
        this.configTimers = configTimers;
        return this;
    }
    public java.util.List<ModifyTimerGroupRequestConfigTimers> getConfigTimers() {
        return this.configTimers;
    }

    public ModifyTimerGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTimerGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyTimerGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyTimerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyTimerGroupRequestConfigTimersSegmentTimers extends TeaModel {
        /**
         * <p>Timestamp for scheduled task execution. The task runs at the specified time.</p>
         * 
         * <strong>example:</strong>
         * <p>1764660600967</p>
         */
        @NameInMap("AppointmentTimer")
        public Long appointmentTimer;

        @NameInMap("EndCronExpression")
        public String endCronExpression;

        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>Image ID for image-change scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5b0vjqbiqu010XXXXXX</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("IpSegments")
        public java.util.List<String> ipSegments;

        /**
         * <p>Lock screen time for inactivity-based lock screen. Not supported for non-AD desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("LockScreenTime")
        public Integer lockScreenTime;

        @NameInMap("NotificationTime")
        public Integer notificationTime;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        @NameInMap("ResetType")
        public String resetType;

        @NameInMap("StartCronExpression")
        public String startCronExpression;

        @NameInMap("TimerOrder")
        public Integer timerOrder;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("VerificationNotificationTime")
        public Integer verificationNotificationTime;

        @NameInMap("VerificationTime")
        public Integer verificationTime;

        public static ModifyTimerGroupRequestConfigTimersSegmentTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyTimerGroupRequestConfigTimersSegmentTimers self = new ModifyTimerGroupRequestConfigTimersSegmentTimers();
            return TeaModel.build(map, self);
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setAppointmentTimer(Long appointmentTimer) {
            this.appointmentTimer = appointmentTimer;
            return this;
        }
        public Long getAppointmentTimer() {
            return this.appointmentTimer;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setIpSegments(java.util.List<String> ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public java.util.List<String> getIpSegments() {
            return this.ipSegments;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setLockScreenTime(Integer lockScreenTime) {
            this.lockScreenTime = lockScreenTime;
            return this;
        }
        public Integer getLockScreenTime() {
            return this.lockScreenTime;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setTimerOrder(Integer timerOrder) {
            this.timerOrder = timerOrder;
            return this;
        }
        public Integer getTimerOrder() {
            return this.timerOrder;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setVerificationNotificationTime(Integer verificationNotificationTime) {
            this.verificationNotificationTime = verificationNotificationTime;
            return this;
        }
        public Integer getVerificationNotificationTime() {
            return this.verificationNotificationTime;
        }

        public ModifyTimerGroupRequestConfigTimersSegmentTimers setVerificationTime(Integer verificationTime) {
            this.verificationTime = verificationTime;
            return this;
        }
        public Integer getVerificationTime() {
            return this.verificationTime;
        }

    }

    public static class ModifyTimerGroupRequestConfigTimers extends TeaModel {
        /**
         * <p>Specifies whether to allow end users to configure scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The Cron expression for the scheduled task.</p>
         * <blockquote>
         * <p>The Cron expression must be in UTC. For example, to schedule a task for 00:00 daily in China Standard Time (UTC+8), set this parameter to <code>0 0 16 ? * 1,2,3,4,5,6,7</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to force execution. If this parameter is set to <code>true</code>, the scheduled task runs regardless of the desktop and connection status.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation to perform. This parameter applies only if <code>TimerType</code> is set to <code>NoConnect</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist for advanced inactivity detection. The scheduled task is not triggered if a process from this list is running.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>Specifies which disks to reset.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        @NameInMap("SegmentTimers")
        public java.util.List<ModifyTimerGroupRequestConfigTimersSegmentTimers> segmentTimers;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        /**
         * <p>The method for detecting inactivity.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ModifyTimerGroupRequestConfigTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyTimerGroupRequestConfigTimers self = new ModifyTimerGroupRequestConfigTimers();
            return TeaModel.build(map, self);
        }

        public ModifyTimerGroupRequestConfigTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public ModifyTimerGroupRequestConfigTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyTimerGroupRequestConfigTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public ModifyTimerGroupRequestConfigTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyTimerGroupRequestConfigTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public ModifyTimerGroupRequestConfigTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyTimerGroupRequestConfigTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public ModifyTimerGroupRequestConfigTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public ModifyTimerGroupRequestConfigTimers setSegmentTimers(java.util.List<ModifyTimerGroupRequestConfigTimersSegmentTimers> segmentTimers) {
            this.segmentTimers = segmentTimers;
            return this;
        }
        public java.util.List<ModifyTimerGroupRequestConfigTimersSegmentTimers> getSegmentTimers() {
            return this.segmentTimers;
        }

        public ModifyTimerGroupRequestConfigTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

        public ModifyTimerGroupRequestConfigTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
