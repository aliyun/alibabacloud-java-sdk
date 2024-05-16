// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineRequest extends TeaModel {
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    @NameInMap("AlertSettings")
    public java.util.List<UpdateBaselineRequestAlertSettings> alertSettings;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    @NameInMap("BaselineName")
    public String baselineName;

    @NameInMap("BaselineType")
    public String baselineType;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("OvertimeSettings")
    public java.util.List<UpdateBaselineRequestOvertimeSettings> overtimeSettings;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RemoveNodeIds")
    public String removeNodeIds;

    public static UpdateBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineRequest self = new UpdateBaselineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineRequest setAlertEnabled(Boolean alertEnabled) {
        this.alertEnabled = alertEnabled;
        return this;
    }
    public Boolean getAlertEnabled() {
        return this.alertEnabled;
    }

    public UpdateBaselineRequest setAlertMarginThreshold(Integer alertMarginThreshold) {
        this.alertMarginThreshold = alertMarginThreshold;
        return this;
    }
    public Integer getAlertMarginThreshold() {
        return this.alertMarginThreshold;
    }

    public UpdateBaselineRequest setAlertSettings(java.util.List<UpdateBaselineRequestAlertSettings> alertSettings) {
        this.alertSettings = alertSettings;
        return this;
    }
    public java.util.List<UpdateBaselineRequestAlertSettings> getAlertSettings() {
        return this.alertSettings;
    }

    public UpdateBaselineRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public UpdateBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public UpdateBaselineRequest setBaselineType(String baselineType) {
        this.baselineType = baselineType;
        return this;
    }
    public String getBaselineType() {
        return this.baselineType;
    }

    public UpdateBaselineRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateBaselineRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateBaselineRequest setOvertimeSettings(java.util.List<UpdateBaselineRequestOvertimeSettings> overtimeSettings) {
        this.overtimeSettings = overtimeSettings;
        return this;
    }
    public java.util.List<UpdateBaselineRequestOvertimeSettings> getOvertimeSettings() {
        return this.overtimeSettings;
    }

    public UpdateBaselineRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateBaselineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateBaselineRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateBaselineRequest setRemoveNodeIds(String removeNodeIds) {
        this.removeNodeIds = removeNodeIds;
        return this;
    }
    public String getRemoveNodeIds() {
        return this.removeNodeIds;
    }

    public static class UpdateBaselineRequestAlertSettingsDingRobots extends TeaModel {
        @NameInMap("AtAll")
        public Boolean atAll;

        @NameInMap("WebUrl")
        public String webUrl;

        public static UpdateBaselineRequestAlertSettingsDingRobots build(java.util.Map<String, ?> map) throws Exception {
            UpdateBaselineRequestAlertSettingsDingRobots self = new UpdateBaselineRequestAlertSettingsDingRobots();
            return TeaModel.build(map, self);
        }

        public UpdateBaselineRequestAlertSettingsDingRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

        public UpdateBaselineRequestAlertSettingsDingRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class UpdateBaselineRequestAlertSettings extends TeaModel {
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        @NameInMap("AlertMaximum")
        public Integer alertMaximum;

        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        @NameInMap("AlertRecipient")
        public String alertRecipient;

        @NameInMap("AlertRecipientType")
        public String alertRecipientType;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("BaselineAlertEnabled")
        public Boolean baselineAlertEnabled;

        @NameInMap("DingRobots")
        public java.util.List<UpdateBaselineRequestAlertSettingsDingRobots> dingRobots;

        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

        @NameInMap("Webhooks")
        public java.util.List<String> webhooks;

        public static UpdateBaselineRequestAlertSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateBaselineRequestAlertSettings self = new UpdateBaselineRequestAlertSettings();
            return TeaModel.build(map, self);
        }

        public UpdateBaselineRequestAlertSettings setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public UpdateBaselineRequestAlertSettings setAlertMaximum(Integer alertMaximum) {
            this.alertMaximum = alertMaximum;
            return this;
        }
        public Integer getAlertMaximum() {
            return this.alertMaximum;
        }

        public UpdateBaselineRequestAlertSettings setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public UpdateBaselineRequestAlertSettings setAlertRecipient(String alertRecipient) {
            this.alertRecipient = alertRecipient;
            return this;
        }
        public String getAlertRecipient() {
            return this.alertRecipient;
        }

        public UpdateBaselineRequestAlertSettings setAlertRecipientType(String alertRecipientType) {
            this.alertRecipientType = alertRecipientType;
            return this;
        }
        public String getAlertRecipientType() {
            return this.alertRecipientType;
        }

        public UpdateBaselineRequestAlertSettings setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public UpdateBaselineRequestAlertSettings setBaselineAlertEnabled(Boolean baselineAlertEnabled) {
            this.baselineAlertEnabled = baselineAlertEnabled;
            return this;
        }
        public Boolean getBaselineAlertEnabled() {
            return this.baselineAlertEnabled;
        }

        public UpdateBaselineRequestAlertSettings setDingRobots(java.util.List<UpdateBaselineRequestAlertSettingsDingRobots> dingRobots) {
            this.dingRobots = dingRobots;
            return this;
        }
        public java.util.List<UpdateBaselineRequestAlertSettingsDingRobots> getDingRobots() {
            return this.dingRobots;
        }

        public UpdateBaselineRequestAlertSettings setSilenceEndTime(String silenceEndTime) {
            this.silenceEndTime = silenceEndTime;
            return this;
        }
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        public UpdateBaselineRequestAlertSettings setSilenceStartTime(String silenceStartTime) {
            this.silenceStartTime = silenceStartTime;
            return this;
        }
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

        public UpdateBaselineRequestAlertSettings setTopicTypes(java.util.List<String> topicTypes) {
            this.topicTypes = topicTypes;
            return this;
        }
        public java.util.List<String> getTopicTypes() {
            return this.topicTypes;
        }

        public UpdateBaselineRequestAlertSettings setWebhooks(java.util.List<String> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public java.util.List<String> getWebhooks() {
            return this.webhooks;
        }

    }

    public static class UpdateBaselineRequestOvertimeSettings extends TeaModel {
        @NameInMap("Cycle")
        public Integer cycle;

        @NameInMap("Time")
        public String time;

        public static UpdateBaselineRequestOvertimeSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateBaselineRequestOvertimeSettings self = new UpdateBaselineRequestOvertimeSettings();
            return TeaModel.build(map, self);
        }

        public UpdateBaselineRequestOvertimeSettings setCycle(Integer cycle) {
            this.cycle = cycle;
            return this;
        }
        public Integer getCycle() {
            return this.cycle;
        }

        public UpdateBaselineRequestOvertimeSettings setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
