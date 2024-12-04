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
     * <p>The ID of the Alibaba Cloud account used by the creator of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>279114181716147735</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The conditions for triggering the alert.</p>
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
         * <li>AliUid: Alibaba Cloud account ID.</li>
         * <li>Shift Schedules: The personnel in a shift schedule.</li>
         * <li>TaskOwner: The node owner. This parameter is available for custom alerts and event alerts.</li>
         * <li>Owner: The baseline owner. This parameter is available for baseline alerts.</li>
         * <li>WebhookUrl: URL of a custom webhook.</li>
         * <li>DingdingUrl: DingTalk chatbot URL.</li>
         * <li>FeishuUrl: Lark chatbot URL.</li>
         * <li>WeixinUrl: WeCom chatbot URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The IDs of the alert recipients.</p>
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
         * <p>The alert channels.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The interval at which an alert notification is sent. Unit: minutes. Valid values: 5 to 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IntervalInMinutes")
        public Integer intervalInMinutes;

        /**
         * <p>The maximum number of times an alert notification is sent within one calendar day. Valid values: 1 to 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Maximum")
        public Integer maximum;

        /**
         * <p>The alert recipient.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Receivers")
        public java.util.List<CreateAlertRuleRequestNotificationReceivers> receivers;

        /**
         * <p>The end of the time range for silence. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The beginning of the time range for silence. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
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
         * <p>The ID of the scheduling cycle of the instance. Valid values: 1 to 288.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
         * <p>The timeout period of instance running. The time is in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
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
         * <p>Indicates whether an alert is triggered if a batch synchronization task is rerun after it fails to run as expected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRerunAlert")
        public Boolean autoRerunAlert;

        /**
         * <p>The IDs of the real-time computing tasks. This parameter is required when you monitor real-time computing tasks.</p>
         */
        @NameInMap("StreamTaskIds")
        public java.util.List<Long> streamTaskIds;

        public static CreateAlertRuleRequestTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertRuleRequestTriggerConditionExtensionError self = new CreateAlertRuleRequestTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public CreateAlertRuleRequestTriggerConditionExtensionError setAutoRerunAlert(Boolean autoRerunAlert) {
            this.autoRerunAlert = autoRerunAlert;
            return this;
        }
        public Boolean getAutoRerunAlert() {
            return this.autoRerunAlert;
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
         * <p>The number of instances on which an error occurs. Valid values: 1 to 10,000.</p>
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
         * <p>The percentage of the number of instances on which an error occurs in the workspace to the total number of instances on the current day. Valid values: 1 to 100.</p>
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
         * <p>The percentage of fluctuation in the number of auto triggered node instances that are generated in your workspace. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>The way in which the number of auto triggered node instances that are generated in your workspace significantly fluctuates. Valid values:</p>
         * <ul>
         * <li>abs: The number of instances increases or decreases.</li>
         * <li>increase: The number of instances increases.</li>
         * <li>decrease: The number of instances decreases.</li>
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
         * <p>The timeout period. Unit: minutes. Valid values: 1 to 21,600.</p>
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
         * <p>The timeout period of the instance that is still running at a specified point in time. The time is in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
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
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to CycleUnfinished.</p>
         */
        @NameInMap("CycleUnfinished")
        public CreateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to Error.</p>
         */
        @NameInMap("Error")
        public CreateAlertRuleRequestTriggerConditionExtensionError error;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceErrorCount.</p>
         */
        @NameInMap("InstanceErrorCount")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceErrorPercentage.</p>
         */
        @NameInMap("InstanceErrorPercentage")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to InstanceTransferFluctuate.</p>
         */
        @NameInMap("InstanceTransferFluctuate")
        public CreateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to Timeout.</p>
         */
        @NameInMap("Timeout")
        public CreateAlertRuleRequestTriggerConditionExtensionTimeout timeout;

        /**
         * <p>The alert configuration. This parameter takes effect only if the Type parameter is set to UnFinished.</p>
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
         * <p>The whitelists of the monitoring tasks.</p>
         */
        @NameInMap("AllowTasks")
        public java.util.List<Long> allowTasks;

        /**
         * <p>The IDs of monitored objects.</p>
         */
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
         * <p>The type of the monitored object. Valid values:</p>
         * <ul>
         * <li>Task: node</li>
         * <li>Baseline: baseline</li>
         * <li>Project: workspace</li>
         * <li>BizProcess: workflow</li>
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
         * <p>The extended information about the rule. This parameter is required for some trigger conditions.</p>
         */
        @NameInMap("Extension")
        public CreateAlertRuleRequestTriggerConditionExtension extension;

        /**
         * <p>The monitored object.</p>
         */
        @NameInMap("Target")
        public CreateAlertRuleRequestTriggerConditionTarget target;

        /**
         * <p>The condition for triggering the alert. Valid values:</p>
         * <ul>
         * <li>Finished: The system sends an alert notification when the instance is successfully run.</li>
         * <li>UnFinished: The system sends an alert notification if the instance is still running at a specified point in time.</li>
         * <li>Error: The system sends an alert notification if an error occurs when the instance is running.</li>
         * <li>CycleUnfinished: The system sends an alert notification if the instance is still running at the end of a specified cycle.</li>
         * <li>Timeout: The system sends an alert notification if the instance is still running after a specified period of time ends.</li>
         * <li>InstanceTransferComplete: The system sends an alert notification if DataWorks generates auto triggered node instances that need to run the next day before 24:00.</li>
         * <li>InstanceTransferFluctuate: The system sends an alert notification when the number of auto triggered node instances that are generated in your workspace significantly fluctuates, in comparison with the average number of auto triggered node instances that are historically generated in the workspace.</li>
         * <li>ExhaustedError: The system sends an alert notification if an error persists after the instance is automatically rerun.</li>
         * <li>InstanceKeyword: The system sends an alert notification if the instance with errors contain specified keywords.</li>
         * <li>InstanceErrorCount: The system sends an alert notification if the number of instances on which an error occurs on the current day reaches a specified threshold.</li>
         * <li>InstanceErrorPercentage: The system sends an alert notification if the proportion of the number of instances on which an error occurs in the workspace to the total number of instances on the current day reaches a specified threshold.</li>
         * <li>ResourceGroupPercentage: The system sends an alert notification if the value of the ResourceGroupPercentage parameter is greater than a specific percentage for a specific period of time.</li>
         * <li>ResourceGroupWaitCount: The system sends an alert notification if the value of the ResourceGroupWaitCount parameter is greater than a specific number for a specific period of time.</li>
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
