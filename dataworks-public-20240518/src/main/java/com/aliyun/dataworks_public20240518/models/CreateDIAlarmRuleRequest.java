// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the synchronization task with which the alert rule is associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The description of the alert rule.</p>
     * 
     * <strong>example:</strong>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Heartbeat</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The name of the alert rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alartRule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The alert notification settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationSettings")
    public CreateDIAlarmRuleRequestNotificationSettings notificationSettings;

    /**
     * <p>The conditions that can trigger the alert rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerConditions")
    public java.util.List<CreateDIAlarmRuleRequestTriggerConditions> triggerConditions;

    public static CreateDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDIAlarmRuleRequest self = new CreateDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDIAlarmRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDIAlarmRuleRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIAlarmRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDIAlarmRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateDIAlarmRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public CreateDIAlarmRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDIAlarmRuleRequest setNotificationSettings(CreateDIAlarmRuleRequestNotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }
    public CreateDIAlarmRuleRequestNotificationSettings getNotificationSettings() {
        return this.notificationSettings;
    }

    public CreateDIAlarmRuleRequest setTriggerConditions(java.util.List<CreateDIAlarmRuleRequestTriggerConditions> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }
    public java.util.List<CreateDIAlarmRuleRequestTriggerConditions> getTriggerConditions() {
        return this.triggerConditions;
    }

    public static class CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels extends TeaModel {
        /**
         * <p>The alert notification methods. Valid values:</p>
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

        public static CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels self = new CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        public CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers extends TeaModel {
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

        public static CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers self = new CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class CreateDIAlarmRuleRequestNotificationSettings extends TeaModel {
        /**
         * <p>The duration of the alert suppression interval. Default value: 5. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        @Deprecated
        public Integer inhibitionInterval;

        /**
         * <p>告警抑制间隔时长，单位分钟，默认5分钟。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MuteInterval")
        public Integer muteInterval;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels;

        /**
         * <p>The settings of alert notification recipients.</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers;

        public static CreateDIAlarmRuleRequestNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestNotificationSettings self = new CreateDIAlarmRuleRequestNotificationSettings();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public CreateDIAlarmRuleRequestNotificationSettings setInhibitionInterval(Integer inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public CreateDIAlarmRuleRequestNotificationSettings setMuteInterval(Integer muteInterval) {
            this.muteInterval = muteInterval;
            return this;
        }
        public Integer getMuteInterval() {
            return this.muteInterval;
        }

        public CreateDIAlarmRuleRequestNotificationSettings setNotificationChannels(java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public CreateDIAlarmRuleRequestNotificationSettings setNotificationReceivers(java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class CreateDIAlarmRuleRequestTriggerConditions extends TeaModel {
        /**
         * <p>The types of DDL operations for which the alert rule takes effect.</p>
         */
        @NameInMap("DdlReportTags")
        @Deprecated
        public java.util.List<String> ddlReportTags;

        /**
         * <p>在DDL通知的时候才生效，需要生效的DDL列表。</p>
         */
        @NameInMap("DdlTypes")
        public java.util.List<String> ddlTypes;

        /**
         * <p>The time interval for alert calculation. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Long threshold;

        public static CreateDIAlarmRuleRequestTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestTriggerConditions self = new CreateDIAlarmRuleRequestTriggerConditions();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public CreateDIAlarmRuleRequestTriggerConditions setDdlReportTags(java.util.List<String> ddlReportTags) {
            this.ddlReportTags = ddlReportTags;
            return this;
        }
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
        }

        public CreateDIAlarmRuleRequestTriggerConditions setDdlTypes(java.util.List<String> ddlTypes) {
            this.ddlTypes = ddlTypes;
            return this;
        }
        public java.util.List<String> getDdlTypes() {
            return this.ddlTypes;
        }

        public CreateDIAlarmRuleRequestTriggerConditions setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public CreateDIAlarmRuleRequestTriggerConditions setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public CreateDIAlarmRuleRequestTriggerConditions setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

}
