// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineRequest extends TeaModel {
    /**
     * <p>Specifies whether alerting is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    /**
     * <p>The baseline alert margin. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>The baseline alert configurations.</p>
     */
    @NameInMap("AlertSettings")
    public java.util.List<UpdateBaselineRequestAlertSettings> alertSettings;

    /**
     * <p>The ID of the baseline. You can call <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000010800007</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The baseline name.</p>
     * 
     * <strong>example:</strong>
     * <p>BaselineName</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The baseline type. Valid values:</p>
     * <ul>
     * <li>DAILY: daily baseline.</li>
     * <li>HOURLY: hourly baseline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>Specifies whether the baseline is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of upstream node IDs for the baseline, separated by commas. If there are many nodes, we recommend that you add a virtual node downstream for easier management.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The baseline committed time configurations.</p>
     */
    @NameInMap("OvertimeSettings")
    public java.util.List<UpdateBaselineRequestOvertimeSettings> overtimeSettings;

    /**
     * <p>The Alibaba Cloud UID of the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The project ID. You can call <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2043</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The IDs of nodes to remove from the baseline. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123,456</p>
     */
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
        /**
         * <p>Specifies whether to @all members. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AtAll")
        public Boolean atAll;

        /**
         * <p>The webhook URL of the DingTalk group chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxx">https://oapi.dingtalk.com/robot/send?access_token=xxx</a></p>
         */
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

    public static class UpdateBaselineRequestAlertSettingsTopicSlowConfig extends TeaModel {
        /**
         * <p>The minimum slowdown threshold. Unit: seconds. Valid values: 300 to 18000.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("MinOver")
        public Integer minOver;

        /**
         * <p>The ratio used to calculate the slowdown threshold based on the historical average execution duration of the node. Valid values: 0.1 to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("OverFactor")
        public Double overFactor;

        public static UpdateBaselineRequestAlertSettingsTopicSlowConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateBaselineRequestAlertSettingsTopicSlowConfig self = new UpdateBaselineRequestAlertSettingsTopicSlowConfig();
            return TeaModel.build(map, self);
        }

        public UpdateBaselineRequestAlertSettingsTopicSlowConfig setMinOver(Integer minOver) {
            this.minOver = minOver;
            return this;
        }
        public Integer getMinOver() {
            return this.minOver;
        }

        public UpdateBaselineRequestAlertSettingsTopicSlowConfig setOverFactor(Double overFactor) {
            this.overFactor = overFactor;
            return this;
        }
        public Double getOverFactor() {
            return this.overFactor;
        }

    }

    public static class UpdateBaselineRequestAlertSettings extends TeaModel {
        /**
         * <p>The event alerting interval. Unit: minutes. Minimum value: 5. Maximum value: 1440.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        /**
         * <p>The maximum number of event alerting notifications. Maximum value: 288.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertMaximum")
        public Integer alertMaximum;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>MAIL: email.</li>
         * <li>SMS: text message.</li>
         * <li>PHONE: phone call. Only DataWorks Professional Edition and higher support phone call alerts.</li>
         * <li>DINGROBOTS: DingTalk chatbot. This alert method takes effect only after the RobotUrls parameter is configured.</li>
         * <li>Webhooks: WeCom or Lark chatbot. This alert method takes effect only after the Webhooks parameter is configured.</li>
         * </ul>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>The alert recipient details. For specified users: a list of employee IDs. For on-duty schedule: the schedule name. For owner: leave empty.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("AlertRecipient")
        public String alertRecipient;

        /**
         * <p>The alert recipient type. Valid values:</p>
         * <ul>
         * <li>OWNER: node owner.</li>
         * <li>OTHER: specified users.</li>
         * <li>SHIFT_SCHEDULE: on-duty schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertRecipientType")
        public String alertRecipientType;

        /**
         * <p>The alert type. Valid values:</p>
         * <ul>
         * <li>BASELINE: baseline alerting.</li>
         * <li>TOPIC: event alerting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASELINE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>Specifies whether baseline alerting is enabled. This is a baseline-specific configuration. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaselineAlertEnabled")
        public Boolean baselineAlertEnabled;

        /**
         * <p>The list of DingTalk chatbots.</p>
         */
        @NameInMap("DingRobots")
        public java.util.List<UpdateBaselineRequestAlertSettingsDingRobots> dingRobots;

        /**
         * <p>The silence end time.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The silence start time.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        /**
         * <p>The threshold configuration for event slowdown alerts.</p>
         */
        @NameInMap("TopicSlowConfig")
        public UpdateBaselineRequestAlertSettingsTopicSlowConfig topicSlowConfig;

        /**
         * <p>The event alerting type. This is an event-specific configuration.</p>
         */
        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

        /**
         * <p>The webhook list.</p>
         */
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

        public UpdateBaselineRequestAlertSettings setTopicSlowConfig(UpdateBaselineRequestAlertSettingsTopicSlowConfig topicSlowConfig) {
            this.topicSlowConfig = topicSlowConfig;
            return this;
        }
        public UpdateBaselineRequestAlertSettingsTopicSlowConfig getTopicSlowConfig() {
            return this.topicSlowConfig;
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
        /**
         * <p>The epoch corresponding to the committed time. For daily baselines, the value is 1. For hourly baselines, you can configure up to 24 epochs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>The committed time in hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
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
