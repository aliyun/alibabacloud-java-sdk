// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateConfigGroupRequest extends TeaModel {
    /**
     * <p>The configuration information of scheduled tasks. This parameter is a list.</p>
     */
    @NameInMap("ConfigTimers")
    public java.util.List<CreateConfigGroupRequestConfigTimers> configTimers;

    /**
     * <p>The description of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the scheduled task</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ScheduledTaskGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The product type used by the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_DESKTOP</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID. This feature is not region-specific. Set this parameter to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Timer</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigGroupRequest self = new CreateConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigGroupRequest setConfigTimers(java.util.List<CreateConfigGroupRequestConfigTimers> configTimers) {
        this.configTimers = configTimers;
        return this;
    }
    public java.util.List<CreateConfigGroupRequestConfigTimers> getConfigTimers() {
        return this.configTimers;
    }

    public CreateConfigGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConfigGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConfigGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateConfigGroupRequestConfigTimersSegmentTimers extends TeaModel {
        /**
         * <p>The appointment timer used for executing scheduled tasks at specified time points.</p>
         * 
         * <strong>example:</strong>
         * <p>1764660600967</p>
         */
        @NameInMap("AppointmentTimer")
        public Long appointmentTimer;

        /**
         * <p>Specifies whether to create a snapshot.</p>
         */
        @NameInMap("CreateSnapshot")
        public Boolean createSnapshot;

        /**
         * <p>The cron expression for the end of the scheduled task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 18 ? * 1-5</p>
         */
        @NameInMap("EndCronExpression")
        public String endCronExpression;

        /**
         * <p>Specifies whether to forcefully execute the task. If set to true, the scheduled task is forcefully executed regardless of the desktop and connection status.</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The time interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The list of effective IP CIDR blocks.</p>
         */
        @NameInMap("IpSegments")
        public java.util.List<String> ipSegments;

        /**
         * <p>The duration of inactivity before the screen is locked, used by the no-operation lock screen feature. Unit: minutes. Only AD cloud desktops are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LockScreenTime")
        public Integer lockScreenTime;

        /**
         * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation type of the scheduled task. Currently, only disconnect scheduled tasks support this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The patch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>KB5082063</p>
         */
        @NameInMap("PatchId")
        public String patchId;

        /**
         * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset type, which determines whether to reset and the scope of cloud disks to reset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The cron expression for the start of the scheduled task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 8 ? * 1-5</p>
         */
        @NameInMap("StartCronExpression")
        public String startCronExpression;

        /**
         * <p>The execution order number of the timer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimerOrder")
        public Integer timerOrder;

        /**
         * <p>The time zone used by the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The trigger configuration type for no-operation scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The advance notification time before verification is executed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VerificationNotificationTime")
        public Integer verificationNotificationTime;

        /**
         * <p>The verification wait duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("VerificationTime")
        public Integer verificationTime;

        public static CreateConfigGroupRequestConfigTimersSegmentTimers build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigGroupRequestConfigTimersSegmentTimers self = new CreateConfigGroupRequestConfigTimersSegmentTimers();
            return TeaModel.build(map, self);
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setAppointmentTimer(Long appointmentTimer) {
            this.appointmentTimer = appointmentTimer;
            return this;
        }
        public Long getAppointmentTimer() {
            return this.appointmentTimer;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setCreateSnapshot(Boolean createSnapshot) {
            this.createSnapshot = createSnapshot;
            return this;
        }
        public Boolean getCreateSnapshot() {
            return this.createSnapshot;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setIpSegments(java.util.List<String> ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public java.util.List<String> getIpSegments() {
            return this.ipSegments;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setLockScreenTime(Integer lockScreenTime) {
            this.lockScreenTime = lockScreenTime;
            return this;
        }
        public Integer getLockScreenTime() {
            return this.lockScreenTime;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setPatchId(String patchId) {
            this.patchId = patchId;
            return this;
        }
        public String getPatchId() {
            return this.patchId;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setTimerOrder(Integer timerOrder) {
            this.timerOrder = timerOrder;
            return this;
        }
        public Integer getTimerOrder() {
            return this.timerOrder;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setVerificationNotificationTime(Integer verificationNotificationTime) {
            this.verificationNotificationTime = verificationNotificationTime;
            return this;
        }
        public Integer getVerificationNotificationTime() {
            return this.verificationNotificationTime;
        }

        public CreateConfigGroupRequestConfigTimersSegmentTimers setVerificationTime(Integer verificationTime) {
            this.verificationTime = verificationTime;
            return this;
        }
        public Integer getVerificationTime() {
            return this.verificationTime;
        }

    }

    public static class CreateConfigGroupRequestConfigTimers extends TeaModel {
        /**
         * <p>Specifies whether to allow end users to configure scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression of the scheduled task.</p>
         * <blockquote>
         * <p>Notice: Specify the time in UTC. For example, to schedule a task at 00:00 (UTC+8) every day, use 0 0 16 ? * 1,2,3,4,5,6,7.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcefully execute the task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The time interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The advance notification time before the scheduled task is executed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation type of the scheduled task. Currently, only disconnect scheduled tasks support this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist for intelligent detection of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset type of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The list of segment timer configurations.</p>
         */
        @NameInMap("SegmentTimers")
        public java.util.List<CreateConfigGroupRequestConfigTimersSegmentTimers> segmentTimers;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIMER_BOOT</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        /**
         * <p>The trigger configuration type for no-operation scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static CreateConfigGroupRequestConfigTimers build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigGroupRequestConfigTimers self = new CreateConfigGroupRequestConfigTimers();
            return TeaModel.build(map, self);
        }

        public CreateConfigGroupRequestConfigTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public CreateConfigGroupRequestConfigTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public CreateConfigGroupRequestConfigTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public CreateConfigGroupRequestConfigTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateConfigGroupRequestConfigTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public CreateConfigGroupRequestConfigTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public CreateConfigGroupRequestConfigTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public CreateConfigGroupRequestConfigTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public CreateConfigGroupRequestConfigTimers setSegmentTimers(java.util.List<CreateConfigGroupRequestConfigTimersSegmentTimers> segmentTimers) {
            this.segmentTimers = segmentTimers;
            return this;
        }
        public java.util.List<CreateConfigGroupRequestConfigTimersSegmentTimers> getSegmentTimers() {
            return this.segmentTimers;
        }

        public CreateConfigGroupRequestConfigTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

        public CreateConfigGroupRequestConfigTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
