// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAlertRuleResponseBody extends TeaModel {
    @NameInMap("AlertRule")
    public GetAlertRuleResponseBodyAlertRule alertRule;

    /**
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
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>WebhookUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

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
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IntervalInMinutes")
        public Integer intervalInMinutes;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Maximum")
        public Integer maximum;

        @NameInMap("Receivers")
        public java.util.List<GetAlertRuleResponseBodyAlertRuleNotificationReceivers> receivers;

        /**
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRerunAlert")
        public Boolean autoRerunAlert;

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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
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
        @NameInMap("CycleUnfinished")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        @NameInMap("Error")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionError error;

        @NameInMap("InstanceErrorCount")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        @NameInMap("InstanceErrorPercentage")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        @NameInMap("InstanceTransferFluctuate")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        @NameInMap("Timeout")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtensionTimeout timeout;

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
        @NameInMap("AllowTasks")
        public java.util.List<Long> allowTasks;

        @NameInMap("Ids")
        public java.util.List<Long> ids;

        /**
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
        @NameInMap("Extension")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionExtension extension;

        @NameInMap("Target")
        public GetAlertRuleResponseBodyAlertRuleTriggerConditionTarget target;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>16035</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>error_rule</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Notification")
        public GetAlertRuleResponseBodyAlertRuleNotification notification;

        /**
         * <strong>example:</strong>
         * <p>279961421580845157</p>
         */
        @NameInMap("Owner")
        public String owner;

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
