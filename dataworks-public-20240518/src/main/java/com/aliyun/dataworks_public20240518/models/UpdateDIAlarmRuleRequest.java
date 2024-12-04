// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34982</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The description of the alert rule.</p>
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
     * <li>DdlReport</li>
     * <li>ResourceUtilization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Heartbeat</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>alarm_rule_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The alert notification settings.</p>
     */
    @NameInMap("NotificationSettings")
    public UpdateDIAlarmRuleRequestNotificationSettings notificationSettings;

    /**
     * <p>The conditions that can trigger the alert rule.</p>
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

    public UpdateDIAlarmRuleRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
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

    public UpdateDIAlarmRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
         * <p>The alert notification method. Valid values:</p>
         * <ul>
         * <li>Mail</li>
         * <li>Phone</li>
         * <li>Sms</li>
         * <li>Ding</li>
         * </ul>
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
         * <p>The recipient type. Valid values: AliyunUid, DingToken, FeishuToken, and WebHookUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>DingToken</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>The recipient.</p>
         * <ul>
         * <li>If the ReceiverType parameter is set to AliyunUid, set this parameter to the Alibaba Cloud account ID of a user.</li>
         * <li>If the ReceiverType parameter is set to DingToken, set this parameter to the token of a DingTalk chatbot.</li>
         * </ul>
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
        public Long inhibitionInterval;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of alert notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers;

        public static UpdateDIAlarmRuleRequestNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestNotificationSettings self = new UpdateDIAlarmRuleRequestNotificationSettings();
            return TeaModel.build(map, self);
        }

        public UpdateDIAlarmRuleRequestNotificationSettings setInhibitionInterval(Long inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Long getInhibitionInterval() {
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
         * <p>The types of DDL operations for which the alert rule takes effect.</p>
         */
        @NameInMap("DdlReportTags")
        public java.util.List<String> ddlReportTags;

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

        public UpdateDIAlarmRuleRequestTriggerConditions setDdlReportTags(java.util.List<String> ddlReportTags) {
            this.ddlReportTags = ddlReportTags;
            return this;
        }
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
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
