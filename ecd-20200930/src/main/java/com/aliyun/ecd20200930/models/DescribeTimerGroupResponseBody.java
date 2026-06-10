// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTimerGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the timer group.</p>
     */
    @NameInMap("Data")
    public DescribeTimerGroupResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTimerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimerGroupResponseBody self = new DescribeTimerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTimerGroupResponseBody setData(DescribeTimerGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTimerGroupResponseBodyData getData() {
        return this.data;
    }

    public DescribeTimerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers extends TeaModel {
        /**
         * <p>The time to execute the scheduled task, specified as a Unix timestamp in milliseconds.</p>
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
         * <p>The image ID for a scheduled image-change task.</p>
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
         * <p>The duration of user inactivity, in seconds, before the screen locks. This feature applies only to cloud computers joined to an Active Directory (AD) domain.</p>
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

        public static DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers self = new DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers();
            return TeaModel.build(map, self);
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setAppointmentTimer(Long appointmentTimer) {
            this.appointmentTimer = appointmentTimer;
            return this;
        }
        public Long getAppointmentTimer() {
            return this.appointmentTimer;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setCreateSnapshot(Boolean createSnapshot) {
            this.createSnapshot = createSnapshot;
            return this;
        }
        public Boolean getCreateSnapshot() {
            return this.createSnapshot;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setEndCronExpression(String endCronExpression) {
            this.endCronExpression = endCronExpression;
            return this;
        }
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setIpSegments(java.util.List<String> ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public java.util.List<String> getIpSegments() {
            return this.ipSegments;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setLockScreenTime(Integer lockScreenTime) {
            this.lockScreenTime = lockScreenTime;
            return this;
        }
        public Integer getLockScreenTime() {
            return this.lockScreenTime;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setPatchId(String patchId) {
            this.patchId = patchId;
            return this;
        }
        public String getPatchId() {
            return this.patchId;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setStartCronExpression(String startCronExpression) {
            this.startCronExpression = startCronExpression;
            return this;
        }
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setTimerOrder(Integer timerOrder) {
            this.timerOrder = timerOrder;
            return this;
        }
        public Integer getTimerOrder() {
            return this.timerOrder;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setVerificationNotificationTime(Integer verificationNotificationTime) {
            this.verificationNotificationTime = verificationNotificationTime;
            return this;
        }
        public Integer getVerificationNotificationTime() {
            return this.verificationNotificationTime;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers setVerificationTime(Integer verificationTime) {
            this.verificationTime = verificationTime;
            return this;
        }
        public Integer getVerificationTime() {
            return this.verificationTime;
        }

    }

    public static class DescribeTimerGroupResponseBodyDataConfigTimers extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to force the execution of the scheduled task. If set to <code>true</code>, the task runs regardless of the cloud computer\&quot;s status or connection state.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation to perform when <code>TimerType</code> is set to <code>NoConnect</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist for smart detection. A scheduled task based on user inactivity does not run if a whitelisted process is running.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset type for the scheduled reset task.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        @NameInMap("SegmentTimers")
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers> segmentTimers;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        /**
         * <p>The detection method for user inactivity.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static DescribeTimerGroupResponseBodyDataConfigTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimerGroupResponseBodyDataConfigTimers self = new DescribeTimerGroupResponseBodyDataConfigTimers();
            return TeaModel.build(map, self);
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setNotificationTime(Integer notificationTime) {
            this.notificationTime = notificationTime;
            return this;
        }
        public Integer getNotificationTime() {
            return this.notificationTime;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setProcessWhitelist(java.util.List<String> processWhitelist) {
            this.processWhitelist = processWhitelist;
            return this;
        }
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setSegmentTimers(java.util.List<DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers> segmentTimers) {
            this.segmentTimers = segmentTimers;
            return this;
        }
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimersSegmentTimers> getSegmentTimers() {
            return this.segmentTimers;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

        public DescribeTimerGroupResponseBodyDataConfigTimers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class DescribeTimerGroupResponseBodyData extends TeaModel {
        /**
         * <p>The number of resources associated with the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        /**
         * <p>A map of associated resource counts, categorized by resource type.</p>
         */
        @NameInMap("BindCountMap")
        public java.util.Map<String, Integer> bindCountMap;

        /**
         * <p>The configurations of the scheduled tasks.</p>
         */
        @NameInMap("ConfigTimers")
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> configTimers;

        /**
         * <p>The description of the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduled task</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-75aazkg2tnqb2*****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>An internal code used by the frontend to display the description of a system-scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE_DESC</p>
         */
        @NameInMap("InnerTimerDesc")
        public String innerTimerDesc;

        /**
         * <p>An internal code used by the frontend to display the name of a system-scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE</p>
         */
        @NameInMap("InnerTimerName")
        public String innerTimerName;

        /**
         * <p>Indicates that resources cannot be bound to or unbound from this timer group.</p>
         */
        @NameInMap("IsBind")
        public Boolean isBind;

        /**
         * <p>Indicates that this timer group cannot be modified.</p>
         */
        @NameInMap("IsUpdate")
        public Boolean isUpdate;

        /**
         * <p>The name of the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduled task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The product type that the timer group supports.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The status of the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the timer group.</p>
         * 
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeTimerGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimerGroupResponseBodyData self = new DescribeTimerGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTimerGroupResponseBodyData setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Integer getBindCount() {
            return this.bindCount;
        }

        public DescribeTimerGroupResponseBodyData setBindCountMap(java.util.Map<String, Integer> bindCountMap) {
            this.bindCountMap = bindCountMap;
            return this;
        }
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        public DescribeTimerGroupResponseBodyData setConfigTimers(java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> configTimers) {
            this.configTimers = configTimers;
            return this;
        }
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> getConfigTimers() {
            return this.configTimers;
        }

        public DescribeTimerGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTimerGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeTimerGroupResponseBodyData setInnerTimerDesc(String innerTimerDesc) {
            this.innerTimerDesc = innerTimerDesc;
            return this;
        }
        public String getInnerTimerDesc() {
            return this.innerTimerDesc;
        }

        public DescribeTimerGroupResponseBodyData setInnerTimerName(String innerTimerName) {
            this.innerTimerName = innerTimerName;
            return this;
        }
        public String getInnerTimerName() {
            return this.innerTimerName;
        }

        public DescribeTimerGroupResponseBodyData setIsBind(Boolean isBind) {
            this.isBind = isBind;
            return this;
        }
        public Boolean getIsBind() {
            return this.isBind;
        }

        public DescribeTimerGroupResponseBodyData setIsUpdate(Boolean isUpdate) {
            this.isUpdate = isUpdate;
            return this;
        }
        public Boolean getIsUpdate() {
            return this.isUpdate;
        }

        public DescribeTimerGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTimerGroupResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeTimerGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTimerGroupResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
