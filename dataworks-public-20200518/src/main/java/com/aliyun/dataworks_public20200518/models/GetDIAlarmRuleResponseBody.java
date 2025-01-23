// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the alert rule.</p>
     */
    @NameInMap("DIAlarmRule")
    public GetDIAlarmRuleResponseBodyDIAlarmRule DIAlarmRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A807D85-AC9F-55F7-A58F-998D5249CAD9</p>
     */
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
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>Warning</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
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
        /**
         * <p>The recipient type. Valid values: AliyunUid and DingToken.</p>
         * <ul>
         * <li>If the alert notification method is Mail, Phone, or Sms, the value of this parameter is <strong>AliyunUid</strong>, which indicates the Alibaba Cloud account ID.</li>
         * <li>If the alert notification method is Ding, the value of this parameter is <strong>DingToken</strong>, which indicates the DingTalk chatbot token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingToken</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The recipients.</p>
         */
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
        /**
         * <p>The duration of the alert suppression interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        public Integer inhibitionInterval;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The alert notification recipients.</p>
         */
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
        /**
         * <p>The time interval for alert calculation. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The severity level. Valid values:</p>
         * <ul>
         * <li>Warning</li>
         * <li>Critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The alert threshold.</p>
         * <ul>
         * <li>If the alert rule is for task status, no threshold is used.</li>
         * <li>If the alert rule is for failovers, specify the number of failovers.</li>
         * <li>If the alert rule is for latency, the threshold is the latency duration, in seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The timestamp when the alert rule was created. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663573162</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the user who creates the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("CreatedUid")
        public String createdUid;

        /**
         * <p>The alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34988</p>
         */
        @NameInMap("DIAlarmRuleId")
        public Long DIAlarmRuleId;

        /**
         * <p>The ID of the task with which the alert rule is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>11170</p>
         */
        @NameInMap("DIJobId")
        public Long DIJobId;

        /**
         * <p>The description of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql synchronizes to hologres heartbeat alert</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the alert rule is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The metric type in the alert rule. Valid values:</p>
         * <ul>
         * <li>Heartbeat</li>
         * <li>FailoverCount</li>
         * <li>Delay</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Heartbeat</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The alert notification settings.</p>
         */
        @NameInMap("NotificationSettings")
        public GetDIAlarmRuleResponseBodyDIAlarmRuleNotificationSettings notificationSettings;

        /**
         * <p>The conditions that are used to trigger the alert rule.</p>
         */
        @NameInMap("TriggerConditions")
        public java.util.List<GetDIAlarmRuleResponseBodyDIAlarmRuleTriggerConditions> triggerConditions;

        /**
         * <p>The timestamp when the alert rule was last updated. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1663573163</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the user who last updates the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
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
