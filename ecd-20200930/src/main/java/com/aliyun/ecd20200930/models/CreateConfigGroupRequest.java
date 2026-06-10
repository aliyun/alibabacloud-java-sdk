// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateConfigGroupRequest extends TeaModel {
    /**
     * <p>An array of scheduled task configurations.</p>
     */
    @NameInMap("ConfigTimers")
    public java.util.List<CreateConfigGroupRequestConfigTimers> configTimers;

    /**
     * <p>The description of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled task description content</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the configuration group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled task group</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The product to which the configuration group applies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_DESKTOP</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID. This feature is not region-specific. You must set this parameter to cn-shanghai.</p>
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
         * <p>The execution time for a one-time scheduled task, specified as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1764660600967</p>
         */
        @NameInMap("AppointmentTimer")
        public Long appointmentTimer;

        @NameInMap("CreateSnapshot")
        public Boolean createSnapshot;

        @NameInMap("EndCronExpression")
        public String endCronExpression;

        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The image ID for a scheduled task that changes the image of a cloud desktop.</p>
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
         * <p>The amount of inactive time, in seconds, before the screen automatically locks. This parameter applies only to Active Directory desktops.</p>
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

        /**
         * <strong>example:</strong>
         * <p>KB5082063</p>
         */
        @NameInMap("PatchId")
        public String patchId;

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
         * <p>Whether to allow end users to configure the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression for the scheduled task.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The cron expression is based on UTC. For example, to run a task at 00:00 China Standard Time (UTC+8) every day, set this parameter to <code>0 0 16 ? * 1,2,3,4,5,6,7</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Whether to forcefully execute the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The time interval, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation to perform for the scheduled task. This parameter is valid only when <code>TimerType</code> is set to <code>NoConnect</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist for smart detection. If a process from this whitelist is running, the inactivity-based scheduled task does not run.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset type for the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

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
         * <p>The trigger condition for inactivity-based scheduled tasks.</p>
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
