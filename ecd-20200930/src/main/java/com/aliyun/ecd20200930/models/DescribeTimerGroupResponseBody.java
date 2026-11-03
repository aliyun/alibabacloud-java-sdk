// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTimerGroupResponseBody extends TeaModel {
    /**
     * <p>The configuration group information.</p>
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
         * <p>Specifies the time to execute the scheduled task. After this parameter is specified, the scheduled task is executed at the specified time.</p>
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
         * <p>The cron expression for ending the execution of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 18 ? * 1-5</p>
         */
        @NameInMap("EndCronExpression")
        public String endCronExpression;

        /**
         * <p>Specifies whether to forcibly execute the task. A value of true indicates that the scheduled task is forcibly executed, ignoring the desktop and connection status checks.</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>Specifies the ID of the image to be replaced. This parameter is used for scheduled image replacement tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5b0vjqbiqu010XXXXXX</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The time interval, in minutes.</p>
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
         * <p>Specifies the duration of inactivity before the screen is locked, in minutes. This parameter is used for the no-operation lock screen feature and is supported only by AD cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("LockScreenTime")
        public Integer lockScreenTime;

        /**
         * <p>The advance notification time before the scheduled task is executed, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The operation type of the scheduled task. Currently, only disconnection scheduled tasks are supported.</p>
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
         * <p>The process whitelist for the intelligent evaluation of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
         */
        @NameInMap("ProcessWhitelist")
        public java.util.List<String> processWhitelist;

        /**
         * <p>The reset type, which determines whether to reset and the scope of cloud disks to be reset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The cron expression for starting the execution of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 8 ? * 1-5</p>
         */
        @NameInMap("StartCronExpression")
        public String startCronExpression;

        /**
         * <p>The execution sequence number of the timer.</p>
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
         * <p>The advance notification time before execution verification, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VerificationNotificationTime")
        public Integer verificationNotificationTime;

        /**
         * <p>The verification wait duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
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
         * <p>Specifies whether end users are allowed to configure scheduled tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the task. A value of true indicates that the scheduled task is forcibly executed, ignoring the desktop and connection status checks.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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

        /**
         * <p>The advance notification time before the scheduled task is executed, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("NotificationTime")
        public Integer notificationTime;

        /**
         * <p>The type of the disconnection scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Shutdown</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The process whitelist for the intelligent evaluation of no-operation scheduled tasks. If a specified process is running, the no-operation scheduled task is not triggered.</p>
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

        /**
         * <p>The list of segment timer configurations.</p>
         */
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
         * <p>The trigger configuration type for no-operation scheduled tasks.</p>
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
         * <p>The number of resources bound to the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        /**
         * <p>The information about the number of resources bound to the configuration.</p>
         */
        @NameInMap("BindCountMap")
        public java.util.Map<String, Integer> bindCountMap;

        /**
         * <p>The configuration information of scheduled tasks.</p>
         */
        @NameInMap("ConfigTimers")
        public java.util.List<DescribeTimerGroupResponseBodyDataConfigTimers> configTimers;

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
         * 
         * <strong>example:</strong>
         * <p>cg-75aazkg2tnqb2*****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Used for frontend display. The description of the system scheduled task uses a code.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE_DESC</p>
         */
        @NameInMap("InnerTimerDesc")
        public String innerTimerDesc;

        /**
         * <p>Used for frontend display. The name mapping of the system scheduled task uses a code.</p>
         * 
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE</p>
         */
        @NameInMap("InnerTimerName")
        public String innerTimerName;

        /**
         * <p>Used for system scheduled task checks. The current scheduled task cannot be bound or unbound.</p>
         */
        @NameInMap("IsBind")
        public Boolean isBind;

        /**
         * <p>Used for system scheduled task checks. The current scheduled task cannot be modified.</p>
         */
        @NameInMap("IsUpdate")
        public Boolean isUpdate;

        /**
         * <p>The name of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduled task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The product type used by the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The status of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The configuration group type.</p>
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
