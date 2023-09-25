// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("DIAlarmRule")
    public GetDIAlarmRuleResponseBodyDIAlarmRule DIAlarmRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIAlarmRuleResponseBody self = new GetDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIAlarmRuleResponseBody setDIAlarmRule(GetDIAlarmRuleResponseBodyDIAlarmRule DIAlarmRule) {
        this.DIAlarmRule = DIAlarmRule;
        return this;
    }
    public GetDIAlarmRuleResponseBodyDIAlarmRule getDIAlarmRule() {
        return this.DIAlarmRule;
    }

    public GetDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels extends TeaModel {
        @NameInMap("Channels")
        public java.util.List<String> channels;

        @NameInMap("Severity")
        public String severity;

        public static GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels self = new GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers extends TeaModel {
        @NameInMap("ReceiverType")
        public String receiverType;

        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers self = new GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings extends TeaModel {
        @NameInMap("InhibitionInterval")
        public Integer inhibitionInterval;

        @NameInMap("NotificationChannels")
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers> notificationReceivers;

        public static GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings self = new GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings();
            return TeaModel.build(map, self);
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings setInhibitionInterval(Integer inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings setNotificationChannels(java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings setNotificationReceivers(java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Threshold")
        public Long threshold;

        public static GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions self = new GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions();
            return TeaModel.build(map, self);
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class GetDIAlarmRuleResponseBodyDIAlarmRule extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("CreatedUid")
        public String createdUid;

        @NameInMap("DIAlarmRuleId")
        public Long DIAlarmRuleId;

        @NameInMap("DIJobId")
        public Long DIJobId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("NotificationSettings")
        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings notificationSettings;

        @NameInMap("TriggerConditions")
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions> triggerConditions;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        @NameInMap("UpdatedUid")
        public String updatedUid;

        public static GetDIAlarmRuleResponseBodyDIAlarmRule build(java.util.Map<String, ?> map) throws Exception {
            GetDIAlarmRuleResponseBodyDIAlarmRule self = new GetDIAlarmRuleResponseBodyDIAlarmRule();
            return TeaModel.build(map, self);
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setCreatedUid(String createdUid) {
            this.createdUid = createdUid;
            return this;
        }
        public String getCreatedUid() {
            return this.createdUid;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setDIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }
        public Long getDIAlarmRuleId() {
            return this.DIAlarmRuleId;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setDIJobId(Long DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public Long getDIJobId() {
            return this.DIJobId;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setNotificationSettings(GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings getNotificationSettings() {
            return this.notificationSettings;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setTriggerConditions(java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions> triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions> getTriggerConditions() {
            return this.triggerConditions;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetDIAlarmRuleResponseBodyDIAlarmRule setUpdatedUid(String updatedUid) {
            this.updatedUid = updatedUid;
            return this;
        }
        public String getUpdatedUid() {
            return this.updatedUid;
        }

    }

}
