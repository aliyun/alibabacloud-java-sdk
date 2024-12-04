// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the rule.</p>
     */
    @NameInMap("AlertRule")
    public GetAlertRuleResponseBodyAlertRule alertRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRuleResponseBody self = new GetAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertRuleResponseBody setAlertRule(GetAlertRuleResponseBodyAlertRule alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public GetAlertRuleResponseBodyAlertRule getAlertRule() {
        return this.alertRule;
    }

    public GetAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertRuleResponseBodyAlertRuleNotificationReceivers extends TeaModel {
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
         * <p>WebhookUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The alert recipients.</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetAlertRuleResponseBodyAlertRuleNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleNotificationReceivers self = new GetAlertRuleResponseBodyAlertRuleNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetAlertRuleResponseBodyAlertRuleNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetAlertRuleResponseBodyAlertRuleNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleNotification extends TeaModel {
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
        public java.util.List<GetAlertRuleResponseBodyAlertRuleNotificationReceivers> receivers;

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

        public static GetAlertRuleResponseBodyAlertRuleNotification build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleNotification self = new GetAlertRuleResponseBodyAlertRuleNotification();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setIntervalInMinutes(Integer intervalInMinutes) {
            this.intervalInMinutes = intervalInMinutes;
            return this;
        }
        public Integer getIntervalInMinutes() {
            return this.intervalInMinutes;
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setMaximum(Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Integer getMaximum() {
            return this.maximum;
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setReceivers(java.util.List<GetAlertRuleResponseBodyAlertRuleNotificationReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<GetAlertRuleResponseBodyAlertRuleNotificationReceivers> getReceivers() {
            return this.receivers;
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setSilenceEndTime(String silenceEndTime) {
            this.silenceEndTime = silenceEndTime;
            return this;
        }
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        public GetAlertRuleResponseBodyAlertRuleNotification setSilenceStartTime(String silenceStartTime) {
            this.silenceStartTime = silenceStartTime;
            return this;
        }
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime extends TeaModel {
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

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime setCycleId(Integer cycleId) {
            this.cycleId = cycleId;
            return this;
        }
        public Integer getCycleId() {
            return this.cycleId;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished extends TeaModel {
        /**
         * <p>The configurations of the scheduling cycle and timeout period of the instance.</p>
         */
        @NameInMap("CycleAndTime")
        public java.util.List<GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished setCycleAndTime(java.util.List<GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime> cycleAndTime) {
            this.cycleAndTime = cycleAndTime;
            return this;
        }
        public java.util.List<GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinishedCycleAndTime> getCycleAndTime() {
            return this.cycleAndTime;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError extends TeaModel {
        /**
         * <p>Indicates whether an alert is triggered if a batch synchronization task is automatically rerun upon a failure.</p>
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

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError setAutoRerunAlert(Boolean autoRerunAlert) {
            this.autoRerunAlert = autoRerunAlert;
            return this;
        }
        public Boolean getAutoRerunAlert() {
            return this.autoRerunAlert;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError setStreamTaskIds(java.util.List<Long> streamTaskIds) {
            this.streamTaskIds = streamTaskIds;
            return this;
        }
        public java.util.List<Long> getStreamTaskIds() {
            return this.streamTaskIds;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount extends TeaModel {
        /**
         * <p>The maximum number of instances on which an error occurs. Valid values: [1,10000].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage extends TeaModel {
        /**
         * <p>The maximum percentage of instances on which an error occurs in the workspace to the total number of instances. Valid values: [1-100].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate extends TeaModel {
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
         * <p>10</p>
         */
        @NameInMap("Trend")
        public String trend;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout extends TeaModel {
        /**
         * <p>The timeout period. Unit: minutes. Valid values: [1, 21600].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished extends TeaModel {
        /**
         * <p>The latest completion time of the instance. The period is in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("UnFinishedTime")
        public String unFinishedTime;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished setUnFinishedTime(String unFinishedTime) {
            this.unFinishedTime = unFinishedTime;
            return this;
        }
        public String getUnFinishedTime() {
            return this.unFinishedTime;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension extends TeaModel {
        /**
         * <p>The configuration for an alert of the CycleUnfinished type.</p>
         */
        @NameInMap("CycleUnfinished")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        /**
         * <p>The configuration for an alert of the Error type.</p>
         */
        @NameInMap("Error")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError error;

        /**
         * <p>The configuration for an alert of the InstanceErrorCount type.</p>
         */
        @NameInMap("InstanceErrorCount")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        /**
         * <p>The configuration for an alert of the InstanceErrorPercentage type.</p>
         */
        @NameInMap("InstanceErrorPercentage")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        /**
         * <p>The configuration for an alert of the InstanceTransferFluctuate type.</p>
         */
        @NameInMap("InstanceTransferFluctuate")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        /**
         * <p>The configuration for an alert of the Timeout type.</p>
         */
        @NameInMap("Timeout")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout timeout;

        /**
         * <p>The configuration for an alert of the UnFinished type.</p>
         */
        @NameInMap("UnFinished")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished unFinished;

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setCycleUnfinished(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished cycleUnfinished) {
            this.cycleUnfinished = cycleUnfinished;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished getCycleUnfinished() {
            return this.cycleUnfinished;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setError(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError error) {
            this.error = error;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError getError() {
            return this.error;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setInstanceErrorCount(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount instanceErrorCount) {
            this.instanceErrorCount = instanceErrorCount;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount getInstanceErrorCount() {
            return this.instanceErrorCount;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setInstanceErrorPercentage(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage) {
            this.instanceErrorPercentage = instanceErrorPercentage;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage getInstanceErrorPercentage() {
            return this.instanceErrorPercentage;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setInstanceTransferFluctuate(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate) {
            this.instanceTransferFluctuate = instanceTransferFluctuate;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate getInstanceTransferFluctuate() {
            return this.instanceTransferFluctuate;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setTimeout(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout getTimeout() {
            return this.timeout;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension setUnFinished(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished unFinished) {
            this.unFinished = unFinished;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionUnFinished getUnFinished() {
            return this.unFinished;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget extends TeaModel {
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

        public static GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget self = new GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget setAllowTasks(java.util.List<Long> allowTasks) {
            this.allowTasks = allowTasks;
            return this;
        }
        public java.util.List<Long> getAllowTasks() {
            return this.allowTasks;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRuleTriggerCondition extends TeaModel {
        /**
         * <p>The extended information about the rule. This parameter is required for specific types of alerts.</p>
         */
        @NameInMap("Extension")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension extension;

        /**
         * <p>The monitored objects.</p>
         */
        @NameInMap("Target")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget target;

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>Finished: An instance is successfully run.</li>
         * <li>UnFinished: An instance does not finish running before a specified point in time.</li>
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
         * <p>Error</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAlertRuleResponseBodyAlertRuleTriggerCondition build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRuleTriggerCondition self = new GetAlertRuleResponseBodyAlertRuleTriggerCondition();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerCondition setExtension(GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension extension) {
            this.extension = extension;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension getExtension() {
            return this.extension;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerCondition setTarget(GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget target) {
            this.target = target;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget getTarget() {
            return this.target;
        }

        public GetAlertRuleResponseBodyAlertRuleTriggerCondition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAlertRuleResponseBodyAlertRule extends TeaModel {
        /**
         * <p>Indicates whether the rule is enabled.</p>
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
         * <p>16035</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>error_rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configuration for the alert notification.</p>
         */
        @NameInMap("Notification")
        public GetAlertRuleResponseBodyAlertRuleNotification notification;

        /**
         * <p>The ID of the Alibaba Cloud account used by the owner of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>279961421580845157</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The alert triggering condition.</p>
         */
        @NameInMap("TriggerCondition")
        public GetAlertRuleResponseBodyAlertRuleTriggerCondition triggerCondition;

        public static GetAlertRuleResponseBodyAlertRule build(java.util.Map<String, ?> map) throws Exception {
            GetAlertRuleResponseBodyAlertRule self = new GetAlertRuleResponseBodyAlertRule();
            return TeaModel.build(map, self);
        }

        public GetAlertRuleResponseBodyAlertRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetAlertRuleResponseBodyAlertRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlertRuleResponseBodyAlertRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertRuleResponseBodyAlertRule setNotification(GetAlertRuleResponseBodyAlertRuleNotification notification) {
            this.notification = notification;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleNotification getNotification() {
            return this.notification;
        }

        public GetAlertRuleResponseBodyAlertRule setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetAlertRuleResponseBodyAlertRule setTriggerCondition(GetAlertRuleResponseBodyAlertRuleTriggerCondition triggerCondition) {
            this.triggerCondition = triggerCondition;
            return this;
        }
        public GetAlertRuleResponseBodyAlertRuleTriggerCondition getTriggerCondition() {
            return this.triggerCondition;
        }

    }

}
