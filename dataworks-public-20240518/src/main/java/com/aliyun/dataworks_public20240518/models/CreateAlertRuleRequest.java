// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAlertRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether the rule is enabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for the alert notification.</p>
     */
    @NameInMap("Notification")
    public CreateAlertRuleRequestNotification notification;

    /**
     * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>279114181****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The alert triggering condition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerCondition")
    public CreateAlertRuleRequestTriggerCondition triggerCondition;

    public static CreateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRuleRequest self = new CreateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAlertRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertRuleRequest setNotification(CreateAlertRuleRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public CreateAlertRuleRequestNotification getNotification() {
        return this.notification;
    }

    public CreateAlertRuleRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateAlertRuleRequest setTriggerCondition(CreateAlertRuleRequestTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }
    public CreateAlertRuleRequestTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    public static class CreateAlertRuleRequestNotificationReceivers extends TeaModel {
        /**
         * <p>The additional configuration of the alert recipient. If the ReceiverType parameter is set to DingdingUrl, you can set this parameter to {&quot;atAll&quot;:true} to remind all members in a DingTalk group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The type of the alert recipient. Valid valves:</p>
         * <ul>
         * <li><p>AliUid: Alibaba Cloud account ID.</p>
         * </li>
         * <li><p>Shift Schedules: the personnel in a shift schedule.</p>
         * </li>
         * <li><p>TaskOwner: the task owner. The task owner can receive custom alerts and event alerts.</p>
         * </li>
         * <li><p>Owner: the baseline owner. The baseline owner can receive baseline alerts.</p>
         * </li>
         * <li><p>WebhookUrl: URL of a custom webhook.</p>
         * </li>
         * <li><p>DingdingUrl: DingTalk webhook URL.</p>
         * </li>
         * <li><p>FeishuUrl: Lark webhook URL.</p>
         * </li>
         * <li><p>WeixinUrl: WeCom webhook URL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The ID of the alert recipient.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static CreateAlertRuleRequestNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestNotificationReceivers self = new CreateAlertRuleRequestNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CreateAlertRuleRequestNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public CreateAlertRuleRequestNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class CreateAlertRuleRequestNotification extends TeaModel {
        /**
         * <p>The alert notification channels.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The interval at which an alert notification is sent. Unit: minutes. Valid values: [5,10000].</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IntervalInMinutes")
        public Integer intervalInMinutes;

        /**
         * <p>The maximum number of times an alert notification can be sent within a calendar day. Valid values: [1, 10000].</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Maximum")
        public Integer maximum;

        /**
         * <p>The alert recipients.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<CreateAlertRuleRequestNotificationReceivers> receivers;

        /**
         * <p>The end time for silence. The time is in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The start time for silence. The time is in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        public static CreateAlertRuleRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestNotification self = new CreateAlertRuleRequestNotification();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public CreateAlertRuleRequestNotification setIntervalInMinutes(Integer intervalInMinutes) {
            this.intervalInMinutes = intervalInMinutes;
            return this;
        }
        public Integer getIntervalInMinutes() {
            return this.intervalInMinutes;
        }

        public CreateAlertRuleRequestNotification setMaximum(Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Integer getMaximum() {
            return this.maximum;
        }

        public CreateAlertRuleRequestNotification setReceivers(java.util.List<CreateAlertRuleRequestNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<CreateAlertRuleRequestNotificationReceivers> getReceivers() {
            return this.receivers;
        }

        public CreateAlertRuleRequestNotification setSilenceEndTime(String silenceEndTime) {
            this.silenceEndTime = silenceEndTime;
            return this;
        }
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        public CreateAlertRuleRequestNotification setSilenceStartTime(String silenceStartTime) {
            this.silenceStartTime = silenceStartTime;
            return this;
        }
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime extends TeaModel {
        /**
         * <p>The ID of the scheduling cycle of the instance. Valid values: [1,288].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
         * <p>The latest completion time of the instance within the scheduling cycle. The time is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("Time")
        public String time;

        public static CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime self = new CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime setCycleId(Integer cycleId) {
            this.cycleId = cycleId;
            return this;
        }
        public Integer getCycleId() {
            return this.cycleId;
        }

        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished extends TeaModel {
        /**
         * <p>The configurations of the scheduling cycle and timeout period of the instance.</p>
         */
        @NameInMap("CycleAndTime")
        public java.util.List<CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime;

        public static CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished self = new CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished setCycleAndTime(java.util.List<CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime) {
            this.cycleAndTime = cycleAndTime;
            return this;
        }
        public java.util.List<CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionError extends TeaModel {
        /**
         * <p>Specifies whether to trigger an alert if a batch synchronization task is automatically rerun upon a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRerunAlertEnabled")
        public Boolean autoRerunAlertEnabled;

        /**
         * <p>The IDs of the real-time computing tasks. This parameter is required when you monitor real-time computing tasks.</p>
         */
        @NameInMap("StreamTaskIds")
        public java.util.List<Long> streamTaskIds;

        public static CreateAlertRuleRequestTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionError self = new CreateAlertRuleRequestTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionError setAutoRerunAlertEnabled(Boolean autoRerunAlertEnabled) {
            this.autoRerunAlertEnabled = autoRerunAlertEnabled;
            return this;
        }
        public Boolean getAutoRerunAlertEnabled() {
            return this.autoRerunAlertEnabled;
        }

        public CreateAlertRuleRequestTriggerConditionExtensionError setStreamTaskIds(java.util.List<Long> streamTaskIds) {
            this.streamTaskIds = streamTaskIds;
            return this;
        }
        public java.util.List<Long> getStreamTaskIds() {
            return this.streamTaskIds;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount extends TeaModel {
        /**
         * <p>The maximum number of instances on which an error occurs. Valid values: [1,10000].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount self = new CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage extends TeaModel {
        /**
         * <p>The maximum percentage of instances on which an error occurs in the workspace to the total number of instances. Valid values: [1-100].</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage self = new CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate extends TeaModel {
        /**
         * <p>The maximum percentage of fluctuation in the number of auto triggered node instances that are generated in your workspace. Valid values: [1-100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The way in which the number of auto triggered node instances that are generated in your workspace fluctuates. Valid values:</p>
         * <ul>
         * <li><p>abs: the absolute value. The number of instances increases or decreases.</p>
         * </li>
         * <li><p>increase: The number of instances increases.</p>
         * </li>
         * <li><p>decrease: The number of instances decreases.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        public static CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate self = new CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionTimeout extends TeaModel {
        /**
         * <p>The timeout period. Unit: minutes. Valid values: [1, 21600].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static CreateAlertRuleRequestTriggerConditionExtensionTimeout build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionTimeout self = new CreateAlertRuleRequestTriggerConditionExtensionTimeout();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionTimeout setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtensionUnFinished extends TeaModel {
        /**
         * <p>The latest completion time of the instance. The period is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>30:00</p>
         */
        @NameInMap("UnFinishedTime")
        public String unFinishedTime;

        public static CreateAlertRuleRequestTriggerConditionExtensionUnFinished build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionUnFinished self = new CreateAlertRuleRequestTriggerConditionExtensionUnFinished();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionUnFinished setUnFinishedTime(String unFinishedTime) {
            this.unFinishedTime = unFinishedTime;
            return this;
        }
        public String getUnFinishedTime() {
            return this.unFinishedTime;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionExtension extends TeaModel {
        /**
         * <p>The configuration for an alert of the CycleUnfinished type.</p>
         */
        @NameInMap("CycleUnfinished")
        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        /**
         * <p>The configuration for an alert of the Error type.</p>
         */
        @NameInMap("Error")
        public CreateAlertRuleRequestTriggerConditionExtensionError error;

        /**
         * <p>The configuration for an alert of the InstanceErrorCount type.</p>
         */
        @NameInMap("InstanceErrorCount")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        /**
         * <p>The configuration for an alert of the InstanceErrorPercentage type.</p>
         */
        @NameInMap("InstanceErrorPercentage")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        /**
         * <p>The configuration for an alert of the InstanceTransferFluctuate type.</p>
         */
        @NameInMap("InstanceTransferFluctuate")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        /**
         * <p>The configuration for an alert of the Timeout type.</p>
         */
        @NameInMap("Timeout")
        public CreateAlertRuleRequestTriggerConditionExtensionTimeout timeout;

        /**
         * <p>The configuration for an alert of the UnFinished type.</p>
         */
        @NameInMap("UnFinished")
        public CreateAlertRuleRequestTriggerConditionExtensionUnFinished unFinished;

        public static CreateAlertRuleRequestTriggerConditionExtension build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtension self = new CreateAlertRuleRequestTriggerConditionExtension();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtension setCycleUnfinished(CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished) {
            this.cycleUnfinished = cycleUnfinished;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished getCycleUnfinished() {
            return this.cycleUnfinished;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setError(CreateAlertRuleRequestTriggerConditionExtensionError error) {
            this.error = error;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionError getError() {
            return this.error;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setInstanceErrorCount(CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount) {
            this.instanceErrorCount = instanceErrorCount;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount getInstanceErrorCount() {
            return this.instanceErrorCount;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setInstanceErrorPercentage(CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage) {
            this.instanceErrorPercentage = instanceErrorPercentage;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage getInstanceErrorPercentage() {
            return this.instanceErrorPercentage;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setInstanceTransferFluctuate(CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate) {
            this.instanceTransferFluctuate = instanceTransferFluctuate;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate getInstanceTransferFluctuate() {
            return this.instanceTransferFluctuate;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setTimeout(CreateAlertRuleRequestTriggerConditionExtensionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionTimeout getTimeout() {
            return this.timeout;
        }

        public CreateAlertRuleRequestTriggerConditionExtension setUnFinished(CreateAlertRuleRequestTriggerConditionExtensionUnFinished unFinished) {
            this.unFinished = unFinished;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtensionUnFinished getUnFinished() {
            return this.unFinished;
        }

    }

    public static class CreateAlertRuleRequestTriggerConditionTarget extends TeaModel {
        /**
         * <p>The nodes that are not to be monitored.</p>
         */
        @NameInMap("AllowTasks")
        public java.util.List<Long> allowTasks;

        /**
         * <p>The IDs of monitored objects.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The type of the monitored objects. Valid values:</p>
         * <ul>
         * <li><p>Task: node</p>
         * </li>
         * <li><p>Baseline: baseline</p>
         * </li>
         * <li><p>Project: workspace</p>
         * </li>
         * <li><p>BizProcess: workflow</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Task</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAlertRuleRequestTriggerConditionTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionTarget self = new CreateAlertRuleRequestTriggerConditionTarget();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionTarget setAllowTasks(java.util.List<Long> allowTasks) {
            this.allowTasks = allowTasks;
            return this;
        }
        public java.util.List<Long> getAllowTasks() {
            return this.allowTasks;
        }

        public CreateAlertRuleRequestTriggerConditionTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public CreateAlertRuleRequestTriggerConditionTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAlertRuleRequestTriggerCondition extends TeaModel {
        /**
         * <p>The extended information about the rule. This parameter is required for specific types of alerts.</p>
         */
        @NameInMap("Extension")
        public CreateAlertRuleRequestTriggerConditionExtension extension;

        /**
         * <p>The monitored objects.</p>
         */
        @NameInMap("Target")
        public CreateAlertRuleRequestTriggerConditionTarget target;

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li><p>Finished: An instance is successfully run.</p>
         * </li>
         * <li><p>UnFinished: An instance does not finish running before a specified point in time.</p>
         * </li>
         * <li><p>Error: An error occurs on an instance.</p>
         * </li>
         * <li><p>CycleUnfinished: An instance does not finish running as expected within a specific cycle.</p>
         * </li>
         * <li><p>Timeout: An instance times out.</p>
         * </li>
         * <li><p>InstanceTransferComplete: An instance is generated by the auto triggered node.</p>
         * </li>
         * <li><p>InstanceTransferFluctuate: The number of generated instances fluctuates.</p>
         * </li>
         * <li><p>ExhaustedError: An error persists after an instance is automatically rerun.</p>
         * </li>
         * <li><p>InstanceKeyword: An instance with errors contains specified keywords.</p>
         * </li>
         * <li><p>InstanceErrorCount: The number of instances on which an error occurs reaches a specified threshold.</p>
         * </li>
         * <li><p>InstanceErrorPercentage: The proportion of instances on which an error occurs in the workspace to the total number of instances reaches a specified threshold.</p>
         * </li>
         * <li><p>ResourceGroupPercentage: The usage rate of the resource group reaches a specified threshold.</p>
         * </li>
         * <li><p>ResourceGroupWaitCount: The number of instances that are waiting for resources in the resource group reaches a specified threshold.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAlertRuleRequestTriggerCondition build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerCondition self = new CreateAlertRuleRequestTriggerCondition();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerCondition setExtension(CreateAlertRuleRequestTriggerConditionExtension extension) {
            this.extension = extension;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionExtension getExtension() {
            return this.extension;
        }

        public CreateAlertRuleRequestTriggerCondition setTarget(CreateAlertRuleRequestTriggerConditionTarget target) {
            this.target = target;
            return this;
        }
        public CreateAlertRuleRequestTriggerConditionTarget getTarget() {
            return this.target;
        }

        public CreateAlertRuleRequestTriggerCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
