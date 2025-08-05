// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleRequest extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    @Deprecated
    public Long DIAlarmRuleId;

    @NameInMap("DIJobId")
    public Long DIJobId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Name")
    public String name;

    @NameInMap("NotificationSettings")
    public UpdateDIAlarmRuleRequestNotificationSettings notificationSettings;

    @NameInMap("TriggerConditions")
    public java.util.List<UpdateDIAlarmRuleRequestTriggerConditions> triggerConditions;

    public static UpdateDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleRequest self = new UpdateDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    public UpdateDIAlarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
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
        @NameInMap("Channels")
        public java.util.List<String> channels;

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
        @NameInMap("ReceiverType")
        public String receiverType;

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
        @NameInMap("InhibitionInterval")
        @Deprecated
        public Long inhibitionInterval;

        @NameInMap("MuteInterval")
        public Long muteInterval;

        @NameInMap("NotificationChannels")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationChannels> notificationChannels;

        @NameInMap("NotificationReceivers")
        public java.util.List<UpdateDIAlarmRuleRequestNotificationSettingsNotificationReceivers> notificationReceivers;

        public static UpdateDIAlarmRuleRequestNotificationSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestNotificationSettings self = new UpdateDIAlarmRuleRequestNotificationSettings();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public UpdateDIAlarmRuleRequestNotificationSettings setInhibitionInterval(Long inhibitionInterval) {
            this.inhibitionInterval = inhibitionInterval;
            return this;
        }
        public Long getInhibitionInterval() {
            return this.inhibitionInterval;
        }

        public UpdateDIAlarmRuleRequestNotificationSettings setMuteInterval(Long muteInterval) {
            this.muteInterval = muteInterval;
            return this;
        }
        public Long getMuteInterval() {
            return this.muteInterval;
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
        @NameInMap("DdlReportTags")
        @Deprecated
        public java.util.List<String> ddlReportTags;

        @NameInMap("DdlTypes")
        public java.util.List<String> ddlTypes;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Threshold")
        public Long threshold;

        public static UpdateDIAlarmRuleRequestTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateDIAlarmRuleRequestTriggerConditions self = new UpdateDIAlarmRuleRequestTriggerConditions();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public UpdateDIAlarmRuleRequestTriggerConditions setDdlReportTags(java.util.List<String> ddlReportTags) {
            this.ddlReportTags = ddlReportTags;
            return this;
        }
        public java.util.List<String> getDdlReportTags() {
            return this.ddlReportTags;
        }

        public UpdateDIAlarmRuleRequestTriggerConditions setDdlTypes(java.util.List<String> ddlTypes) {
            this.ddlTypes = ddlTypes;
            return this;
        }
        public java.util.List<String> getDdlTypes() {
            return this.ddlTypes;
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
