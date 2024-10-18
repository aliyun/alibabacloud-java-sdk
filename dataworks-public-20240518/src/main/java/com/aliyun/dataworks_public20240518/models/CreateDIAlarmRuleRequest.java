// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIAlarmRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>任务ID，是告警规则关联的任务ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>告警规则是否启用，默认不开启。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>告警指标类型，可选的枚举值：</p>
     * <ul>
     * <li>Heartbeat（任务状态报警）</li>
     * <li>FailoverCount（failover次数报警）</li>
     * <li>Delay（任务延迟报警）</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Heartbeat</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alartRule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NotificationSettings")
    public CreateDIAlarmRuleRequestNotificationSettings notificationSettings;

    /**
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
        @NameInMap("Channels")
        public java.util.List<String> channels;

        /**
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
         * <strong>example:</strong>
         * <p>DingToken</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

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
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InhibitionInterval")
        public Integer inhibitionInterval;

        @NameInMap("NotificationChannels")
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
        public java.util.List<CreateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers;

        public static CreateDIAlarmRuleRequestNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestNotificationSettings self = new CreateDIAlarmRuleRequestNotificationSettings();
            return TeaModel.build(map, self);
        }

        public CreateDIAlarmRuleRequestNotificationSettings setInhibitionInterval(Integer inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Integer getInhibitionInterval() {
            return this.inhibitionInterval;
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
        @NameInMap("DdlReportTags")
        public java.util.List<String> ddlReportTags;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>Warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Threshold")
        public Long threshold;

        public static CreateDIAlarmRuleRequestTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateDIAlarmRuleRequestTriggerConditions self = new CreateDIAlarmRuleRequestTriggerConditions();
            return TeaModel.build(map, self);
        }

        public CreateDIAlarmRuleRequestTriggerConditions setDdlReportTags(java.util.List<String> ddlReportTags) {
            this.ddlReportTags = ddlReportTags;
            return this;
        }
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
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
