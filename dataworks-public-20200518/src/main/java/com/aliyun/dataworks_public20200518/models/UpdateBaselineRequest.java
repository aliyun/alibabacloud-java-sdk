// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the alerting feature. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    /**
     * <p>The alert margin threshold of the baseline. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>The alert settings of the baseline.</p>
     */
    @NameInMap("AlertSettings")
    public java.util.List<UpdateBaselineRequestAlertSettings> alertSettings;

    /**
     * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000010800007</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The name of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>BaselineName</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ancestor nodes of nodes in the baseline. Separate the ancestor nodes with commas (,). If a large number of ancestor nodes exist, we recommend that you create a zero load node and configure the zero load node as the descendant node of nodes in the baseline to facilitate node management.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The settings of the committed completion time of the baseline.</p>
     */
    @NameInMap("OvertimeSettings")
    public java.util.List<UpdateBaselineRequestOvertimeSettings> overtimeSettings;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2043</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the node that you want to disassociate from the baseline. You can specify multiple node IDs. Separate multiple node IDs with commas (,).</p>
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
         * <p>Specifies whether to remind all members by using the at sign (@). Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AtAll")
        public Boolean atAll;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
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

    public static class UpdateBaselineRequestAlertSettings extends TeaModel {
        /**
         * <p>The interval at which an event alert notification is sent. Unit: minutes. Minimum value: 5. Maximum value: 1,440.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        /**
         * <p>The maximum number of times an event alert notification is sent. Maximum value: 24.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertMaximum")
        public Integer alertMaximum;

        /**
         * <p>The alert notification methods. Valid values: MAIL, SMS, PHONE, DINGROBOTS, and Webhooks. The value MAIL indicates that alert notifications are sent by email. The value SMS indicates that alert notifications are sent by text message. The value PHONE indicates that alert notifications are sent by phone call. You can use this notification method only in DataWorks Professional Edition or a more advanced edition. The value DINGROBOTS indicates that alert notifications are sent by using a DingTalk chatbot. You can use this notification method only if the RobotUrls parameter is configured. The value Webhooks indicates that alert notifications are sent by WeCom or Lark. You can use this notification method only if the Webhooks parameter is configured.</p>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>The details of the alert recipient. If you set AlertRecipientType to OWNER, leave this parameter empty. If you set AlertRecipientType to SHIFT_SCHEDULE, set this parameter to the name of the shift schedule. If you set AlertRecipientType to OTHER, set this parameter to the employee IDs of specified personnel.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("AlertRecipient")
        public String alertRecipient;

        /**
         * <p>The type of the alert recipient. Valid values: OWNER, OTHER, and SHIFT_SCHEDULE. The value OWNER indicates the node owner. The value OTHER indicates specified personnel. The value SHIFT_SCHEDULE indicates personnel in a shift schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertRecipientType")
        public String alertRecipientType;

        /**
         * <p>The type of the alert. Valid values: BASELINE and TOPIC. The value BASELINE indicates a baseline alert. The value TOPIC indicates an event alert.</p>
         * 
         * <strong>example:</strong>
         * <p>BASELINE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>Specifies whether to enable the baseline alerting feature. This feature is specific to baselines. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaselineAlertEnabled")
        public Boolean baselineAlertEnabled;

        /**
         * <p>The DingTalk chatbots.</p>
         */
        @NameInMap("DingRobots")
        public java.util.List<UpdateBaselineRequestAlertSettingsDingRobots> dingRobots;

        /**
         * <p>The end time of silence.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The start time of silence.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        /**
         * <p>The types of event alerts, which are event-specific configurations.</p>
         */
        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

        /**
         * <p>The webhook URLs.</p>
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
         * <p>The cycle that corresponds to the committed completion time. For a day-level baseline, set this parameter to 1. For an hour-level baseline, set this parameter to a value that is no more than 24.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>The committed completion time in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
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
