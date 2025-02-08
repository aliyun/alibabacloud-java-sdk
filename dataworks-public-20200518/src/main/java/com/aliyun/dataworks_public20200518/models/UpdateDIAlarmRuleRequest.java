// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>The alert rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34982</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    /**
     * <p>The description of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql synchronizes to hologres heartbeat alert</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the alert rule. By default, the alert rule is disabled.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Heartbeat</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The alert notification settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationSettings")
    public UpdateDIAlarmRuleRequestNotificationSettings notificationSettings;

    /**
     * <p>The conditions that are used to trigger the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerConditions")
    public java.util.List<UpdateDIAlarmRuleRequestTriggerConditions> triggerConditions;

    public static UpdateDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleRequest self = new UpdateDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDIAlarmRuleRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public UpdateDIAlarmRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDIAlarmRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateDIAlarmRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public UpdateDIAlarmRuleRequest setNotificationSettings(UpdateDIAlarmRuleRequestNotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }
    public UpdateDIAlarmRuleRequestNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    public UpdateDIAlarmRuleRequest setTriggerConditions(java.util.List<UpdateDIAlarmRuleRequestTriggerConditions> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }
    public java.util.List<UpdateDIAlarmRuleRequestTriggerConditions> getTriggerConditions() {
        return this.triggerConditions;
    }

    public static class UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels extends TeaModel {
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

        public static UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels self = new UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers extends TeaModel {
        /**
         * <p>The recipient type.</p>
         * <ul>
         * <li>If the alert notification method is Mail, Phone, or Sms, the recipient type is the Alibaba Cloud account ID.</li>
         * <li>If the alert notification method is Ding, the recipient type is the DingTalk chatbot token.</li>
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

        public static UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers self = new UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class UpdateDIAlarmRuleRequestNotificationSettings extends TeaModel {
        /**
         * <p>The duration of the alert suppression interval. Default value: 5. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        public Integer inhibitionInterval;

        /**
         * <p>The alert notification methods.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of alert notification recipients.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers;

        public static UpdateDIAlarmRuleRequestNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestNotificationSettings self = new UpdateDIAlarmRuleRequestNotificationSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIAlarmRuleRequestNotificationSettings setInhibitionInterval(Integer inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public UpdateDIAlarmRuleRequestNotificationSettings setNotificationChannels(java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public UpdateDIAlarmRuleRequestNotificationSettings setNotificationReceivers(java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class UpdateDIAlarmRuleRequestTriggerConditions extends TeaModel {
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
         * <li>If the alert rule is for task status, you do not need to specify a threshold.</li>
         * <li>If the alert rule is for failovers, you must specify the number of failovers.</li>
         * <li>If the alert rule is for latency, you must specify the latency duration, in seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Threshold")
        public Long threshold;

        public static UpdateDIAlarmRuleRequestTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestTriggerConditions self = new UpdateDIAlarmRuleRequestTriggerConditions();
            return TeaModel.build(map, self);
        }

        public UpdateDIAlarmRuleRequestTriggerConditions setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public UpdateDIAlarmRuleRequestTriggerConditions setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public UpdateDIAlarmRuleRequestTriggerConditions setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

}
