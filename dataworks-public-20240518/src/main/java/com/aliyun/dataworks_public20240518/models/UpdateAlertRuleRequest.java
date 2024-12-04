// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>collection_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for the alert notification.</p>
     */
    @NameInMap("Notification")
    public UpdateAlertRuleRequestNotification notification;

    /**
     * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>193379****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The alert triggering condition.</p>
     */
    @NameInMap("TriggerCondition")
    public UpdateAlertRuleRequestTriggerCondition triggerCondition;

    public static UpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleRequest self = new UpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAlertRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlertRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertRuleRequest setNotification(UpdateAlertRuleRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public UpdateAlertRuleRequestNotification getNotification() {
        return this.notification;
    }

    public UpdateAlertRuleRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateAlertRuleRequest setTriggerCondition(UpdateAlertRuleRequestTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }
    public UpdateAlertRuleRequestTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    public static class UpdateAlertRuleRequestNotificationReceivers extends TeaModel {
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
         * <li>Shift Schedules: the personnel in a shift schedule.</li>
         * <li>TaskOwner: the task owner. The task owner can receive custom alerts and event alerts.</li>
         * <li>Owner: the baseline owner. The baseline owner can receive baseline alerts.</li>
         * <li>WebhookUrl: URL of a custom webhook.</li>
         * <li>DingdingUrl: DingTalk webhook URL.</li>
         * <li>FeishuUrl: Lark webhook URL.</li>
         * <li>WeixinUrl: WeCom webhook URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static UpdateAlertRuleRequestNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestNotificationReceivers self = new UpdateAlertRuleRequestNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateAlertRuleRequestNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateAlertRuleRequestNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class UpdateAlertRuleRequestNotification extends TeaModel {
        /**
         * <p>The alert notification channels.</p>
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
         */
        @NameInMap("Receivers")
        public java.util.List<UpdateAlertRuleRequestNotificationReceivers> receivers;

        /**
         * <p>The end time for silence. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The start time for silence. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        public static UpdateAlertRuleRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestNotification self = new UpdateAlertRuleRequestNotification();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public UpdateAlertRuleRequestNotification setIntervalInMinutes(Integer intervalInMinutes) {
            this.intervalInMinutes = intervalInMinutes;
            return this;
        }
        public Integer getIntervalInMinutes() {
            return this.intervalInMinutes;
        }

        public UpdateAlertRuleRequestNotification setMaximum(Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Integer getMaximum() {
            return this.maximum;
        }

        public UpdateAlertRuleRequestNotification setReceivers(java.util.List<UpdateAlertRuleRequestNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<UpdateAlertRuleRequestNotificationReceivers> getReceivers() {
            return this.receivers;
        }

        public UpdateAlertRuleRequestNotification setSilenceEndTime(String silenceEndTime) {
            this.silenceEndTime = silenceEndTime;
            return this;
        }
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        public UpdateAlertRuleRequestNotification setSilenceStartTime(String silenceStartTime) {
            this.silenceStartTime = silenceStartTime;
            return this;
        }
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime extends TeaModel {
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
         * <p>01:00</p>
         */
        @NameInMap("Time")
        public String time;

        public static UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime self = new UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime setCycleId(Integer cycleId) {
            this.cycleId = cycleId;
            return this;
        }
        public Integer getCycleId() {
            return this.cycleId;
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished extends TeaModel {
        /**
         * <p>The configurations of the scheduling cycle and timeout period of the instance.</p>
         */
        @NameInMap("CycleAndTime")
        public java.util.List<UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime;

        public static UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished self = new UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished setCycleAndTime(java.util.List<UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime) {
            this.cycleAndTime = cycleAndTime;
            return this;
        }
        public java.util.List<UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinishedCycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionError extends TeaModel {
        /**
         * <p>Specifies whether to trigger an alert if a batch synchronization task is automatically rerun upon a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRerunAlert")
        public Boolean autoRerunAlert;

        /**
         * <p>The IDs of the real-time computing tasks. This parameter is required when you monitor real-time computing tasks.</p>
         */
        @NameInMap("StreamTaskIds")
        public java.util.List<Long> streamTaskIds;

        public static UpdateAlertRuleRequestTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionError self = new UpdateAlertRuleRequestTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionError setAutoRerunAlert(Boolean autoRerunAlert) {
            this.autoRerunAlert = autoRerunAlert;
            return this;
        }
        public Boolean getAutoRerunAlert() {
            return this.autoRerunAlert;
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionError setStreamTaskIds(java.util.List<Long> streamTaskIds) {
            this.streamTaskIds = streamTaskIds;
            return this;
        }
        public java.util.List<Long> getStreamTaskIds() {
            return this.streamTaskIds;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount extends TeaModel {
        /**
         * <p>The maximum number of instances on which an error occurs. Valid values: [1,10000].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount self = new UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage extends TeaModel {
        /**
         * <p>The maximum percentage of instances on which an error occurs in the workspace to the total number of instances. Valid values: [1-100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage self = new UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate extends TeaModel {
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
         * <li>abs: the absolute value. The number of instances increases or decreases.</li>
         * <li>increase: The number of instances increases.</li>
         * <li>decrease: The number of instances decreases.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>abs</p>
         */
        @NameInMap("Trend")
        public String trend;

        public static UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate self = new UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionTimeout extends TeaModel {
        /**
         * <p>The timeout period. Unit: minutes. Valid values: [1, 21600].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static UpdateAlertRuleRequestTriggerConditionExtensionTimeout build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionTimeout self = new UpdateAlertRuleRequestTriggerConditionExtensionTimeout();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionTimeout setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtensionUnFinished extends TeaModel {
        /**
         * <p>The latest completion time of the instance. The period is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("UnFinishedTime")
        public String unFinishedTime;

        public static UpdateAlertRuleRequestTriggerConditionExtensionUnFinished build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtensionUnFinished self = new UpdateAlertRuleRequestTriggerConditionExtensionUnFinished();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtensionUnFinished setUnFinishedTime(String unFinishedTime) {
            this.unFinishedTime = unFinishedTime;
            return this;
        }
        public String getUnFinishedTime() {
            return this.unFinishedTime;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionExtension extends TeaModel {
        /**
         * <p>The configuration for an alert of the CycleUnfinished type.</p>
         */
        @NameInMap("CycleUnfinished")
        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        /**
         * <p>The configuration for an alert of the Error type.</p>
         */
        @NameInMap("Error")
        public UpdateAlertRuleRequestTriggerConditionExtensionError error;

        /**
         * <p>The configuration for an alert of the InstanceErrorCount type.</p>
         */
        @NameInMap("InstanceErrorCount")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        /**
         * <p>The configuration for an alert of the InstanceErrorPercentage type.</p>
         */
        @NameInMap("InstanceErrorPercentage")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        /**
         * <p>The configuration for an alert of the InstanceTransferFluctuate type.</p>
         */
        @NameInMap("InstanceTransferFluctuate")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        /**
         * <p>The configuration for an alert of the Timeout type.</p>
         */
        @NameInMap("Timeout")
        public UpdateAlertRuleRequestTriggerConditionExtensionTimeout timeout;

        /**
         * <p>The configuration for an alert of the UnFinished type.</p>
         */
        @NameInMap("UnFinished")
        public UpdateAlertRuleRequestTriggerConditionExtensionUnFinished unFinished;

        public static UpdateAlertRuleRequestTriggerConditionExtension build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionExtension self = new UpdateAlertRuleRequestTriggerConditionExtension();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setCycleUnfinished(UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished) {
            this.cycleUnfinished = cycleUnfinished;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished getCycleUnfinished() {
            return this.cycleUnfinished;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setError(UpdateAlertRuleRequestTriggerConditionExtensionError error) {
            this.error = error;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionError getError() {
            return this.error;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setInstanceErrorCount(UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount) {
            this.instanceErrorCount = instanceErrorCount;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount getInstanceErrorCount() {
            return this.instanceErrorCount;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setInstanceErrorPercentage(UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage) {
            this.instanceErrorPercentage = instanceErrorPercentage;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage getInstanceErrorPercentage() {
            return this.instanceErrorPercentage;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setInstanceTransferFluctuate(UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate) {
            this.instanceTransferFluctuate = instanceTransferFluctuate;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate getInstanceTransferFluctuate() {
            return this.instanceTransferFluctuate;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setTimeout(UpdateAlertRuleRequestTriggerConditionExtensionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionTimeout getTimeout() {
            return this.timeout;
        }

        public UpdateAlertRuleRequestTriggerConditionExtension setUnFinished(UpdateAlertRuleRequestTriggerConditionExtensionUnFinished unFinished) {
            this.unFinished = unFinished;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtensionUnFinished getUnFinished() {
            return this.unFinished;
        }

    }

    public static class UpdateAlertRuleRequestTriggerConditionTarget extends TeaModel {
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

        public static UpdateAlertRuleRequestTriggerConditionTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerConditionTarget self = new UpdateAlertRuleRequestTriggerConditionTarget();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerConditionTarget setAllowTasks(java.util.List<Long> allowTasks) {
            this.allowTasks = allowTasks;
            return this;
        }
        public java.util.List<Long> getAllowTasks() {
            return this.allowTasks;
        }

        public UpdateAlertRuleRequestTriggerConditionTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public UpdateAlertRuleRequestTriggerConditionTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAlertRuleRequestTriggerCondition extends TeaModel {
        /**
         * <p>The extended information about the rule. This parameter is required for specific types of alerts.</p>
         */
        @NameInMap("Extension")
        public UpdateAlertRuleRequestTriggerConditionExtension extension;

        /**
         * <p>The monitored objects.</p>
         */
        @NameInMap("Target")
        public UpdateAlertRuleRequestTriggerConditionTarget target;

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>Finished: An instance is successfully run.</li>
         * <li>UnFinished:An instance does not finish running before a specified point in time.</li>
         * <li>Error: An error occurs on an instance.</li>
         * <li>CycleUnfinished: An instance does not finish running as expected within a specific cycle.</li>
         * <li>Timeout: An instance times out.</li>
         * <li>InstanceTransferComplete: An instance is generated by the auto triggered node.</li>
         * <li>InstanceTransferFluctuate: The number of generated instances fluctuates.</li>
         * <li>ExhaustedError: An error persists after an instance is automatically rerun.</li>
         * <li>InstanceKeyword: An instance with errors contains specified keywords.</li>
         * <li>InstanceErrorCount: The number of instances on which an error occurs reaches a specified threshold.</li>
         * <li>InstanceErrorPercentage: The proportion of instances on which an error occurs in the workspace to the total number of instances reaches a specified threshold.</li>
         * <li>ResourceGroupPercentage: The usage rate of the resource group reaches a specified threshold.</li>
         * <li>ResourceGroupWaitCount: The number of instances that are waiting for resources in the resource group reaches a specified threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateAlertRuleRequestTriggerCondition build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertRuleRequestTriggerCondition self = new UpdateAlertRuleRequestTriggerCondition();
            return TeaModel.build(map, self);
        }

        public UpdateAlertRuleRequestTriggerCondition setExtension(UpdateAlertRuleRequestTriggerConditionExtension extension) {
            this.extension = extension;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionExtension getExtension() {
            return this.extension;
        }

        public UpdateAlertRuleRequestTriggerCondition setTarget(UpdateAlertRuleRequestTriggerConditionTarget target) {
            this.target = target;
            return this;
        }
        public UpdateAlertRuleRequestTriggerConditionTarget getTarget() {
            return this.target;
        }

        public UpdateAlertRuleRequestTriggerCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
