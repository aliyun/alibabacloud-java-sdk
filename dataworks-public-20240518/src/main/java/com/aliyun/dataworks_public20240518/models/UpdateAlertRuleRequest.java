// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>105412</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>collection_name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Notification")
    public UpdateAlertRuleRequestNotification notification;

    /**
     * <strong>example:</strong>
     * <p>193379****</p>
     */
    @NameInMap("Owner")
    public String owner;

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
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:true}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>TaskOwner</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

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
        public java.util.List<UpdateAlertRuleRequestNotificationReceivers> receivers;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleId")
        public Integer cycleId;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRerunAlert")
        public Boolean autoRerunAlert;

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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
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
        @NameInMap("CycleUnfinished")
        public UpdateAlertRuleRequestTriggerConditionExtensionCycleUnfinished cycleUnfinished;

        @NameInMap("Error")
        public UpdateAlertRuleRequestTriggerConditionExtensionError error;

        @NameInMap("InstanceErrorCount")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorCount instanceErrorCount;

        @NameInMap("InstanceErrorPercentage")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceErrorPercentage instanceErrorPercentage;

        @NameInMap("InstanceTransferFluctuate")
        public UpdateAlertRuleRequestTriggerConditionExtensionInstanceTransferFluctuate instanceTransferFluctuate;

        @NameInMap("Timeout")
        public UpdateAlertRuleRequestTriggerConditionExtensionTimeout timeout;

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
        @NameInMap("Extension")
        public UpdateAlertRuleRequestTriggerConditionExtension extension;

        @NameInMap("Target")
        public UpdateAlertRuleRequestTriggerConditionTarget target;

        /**
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
