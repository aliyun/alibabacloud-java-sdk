// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetBaselineResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecb967ec-c137-48a5-860****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineResponseBody self = new GetBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaselineResponseBody setData(GetBaselineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBaselineResponseBodyData getData() {
        return this.data;
    }

    public GetBaselineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBaselineResponseBodyDataAlertSettingsDingRobots extends TeaModel {
        /**
         * <p>Indicates whether to @ all members.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static GetBaselineResponseBodyDataAlertSettingsDingRobots build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineResponseBodyDataAlertSettingsDingRobots self = new GetBaselineResponseBodyDataAlertSettingsDingRobots();
            return TeaModel.build(map, self);
        }

        public GetBaselineResponseBodyDataAlertSettingsDingRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

        public GetBaselineResponseBodyDataAlertSettingsDingRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("MinOver")
        public Integer minOver;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("OverFactor")
        public Double overFactor;

        public static GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig self = new GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig();
            return TeaModel.build(map, self);
        }

        public GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig setMinOver(Integer minOver) {
            this.minOver = minOver;
            return this;
        }
        public Integer getMinOver() {
            return this.minOver;
        }

        public GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig setOverFactor(Double overFactor) {
            this.overFactor = overFactor;
            return this;
        }
        public Double getOverFactor() {
            return this.overFactor;
        }

    }

    public static class GetBaselineResponseBodyDataAlertSettings extends TeaModel {
        /**
         * <p>The event alerting interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        /**
         * <p>The maximum number of event alerting notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertMaximum")
        public Integer alertMaximum;

        /**
         * <p>The list of alert methods.</p>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>The alert recipient details.</p>
         * <ul>
         * <li>If AlertRecipientType is set to OWNER: empty.</li>
         * <li>If AlertRecipientType is set to SHIFT_SCHEDULE: the UID of the shift schedule.</li>
         * <li>If AlertRecipientType is set to OTHER: a list of UIDs. Separate multiple UIDs with commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("AlertRecipient")
        public String alertRecipient;

        /**
         * <p>The type of alert recipient. Valid values:</p>
         * <ul>
         * <li>OWNER: node owner.</li>
         * <li>OTHER: specified users.</li>
         * <li>SHIFT_SCHEDULE: shift schedule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertRecipientType")
        public String alertRecipientType;

        /**
         * <p>The alerting type. Valid values:</p>
         * <ul>
         * <li>BASELINE: baseline.</li>
         * <li>TOPIC: event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASELINE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The baseline alert switch. This is a baseline-specific configuration. Valid values:</p>
         * <ul>
         * <li>true: started.</li>
         * <li>false: stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BaselineAlertEnabled")
        public Boolean baselineAlertEnabled;

        /**
         * <p>The list of DingTalk chatbots.</p>
         */
        @NameInMap("DingRobots")
        public java.util.List<GetBaselineResponseBodyDataAlertSettingsDingRobots> dingRobots;

        /**
         * <p>The silence end time, in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The silence start time, in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        @NameInMap("TopicSlowConfig")
        public GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig topicSlowConfig;

        /**
         * <p>The list of event alerting types. This is an event-specific configuration.</p>
         */
        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

        /**
         * <p>The list of webhooks.</p>
         */
        @NameInMap("Webhooks")
        public java.util.List<String> webhooks;

        public static GetBaselineResponseBodyDataAlertSettings build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineResponseBodyDataAlertSettings self = new GetBaselineResponseBodyDataAlertSettings();
            return TeaModel.build(map, self);
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertMaximum(Integer alertMaximum) {
            this.alertMaximum = alertMaximum;
            return this;
        }
        public Integer getAlertMaximum() {
            return this.alertMaximum;
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertRecipient(String alertRecipient) {
            this.alertRecipient = alertRecipient;
            return this;
        }
        public String getAlertRecipient() {
            return this.alertRecipient;
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertRecipientType(String alertRecipientType) {
            this.alertRecipientType = alertRecipientType;
            return this;
        }
        public String getAlertRecipientType() {
            return this.alertRecipientType;
        }

        public GetBaselineResponseBodyDataAlertSettings setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public GetBaselineResponseBodyDataAlertSettings setBaselineAlertEnabled(Boolean baselineAlertEnabled) {
            this.baselineAlertEnabled = baselineAlertEnabled;
            return this;
        }
        public Boolean getBaselineAlertEnabled() {
            return this.baselineAlertEnabled;
        }

        public GetBaselineResponseBodyDataAlertSettings setDingRobots(java.util.List<GetBaselineResponseBodyDataAlertSettingsDingRobots> dingRobots) {
            this.dingRobots = dingRobots;
            return this;
        }
        public java.util.List<GetBaselineResponseBodyDataAlertSettingsDingRobots> getDingRobots() {
            return this.dingRobots;
        }

        public GetBaselineResponseBodyDataAlertSettings setSilenceEndTime(String silenceEndTime) {
            this.silenceEndTime = silenceEndTime;
            return this;
        }
        public String getSilenceEndTime() {
            return this.silenceEndTime;
        }

        public GetBaselineResponseBodyDataAlertSettings setSilenceStartTime(String silenceStartTime) {
            this.silenceStartTime = silenceStartTime;
            return this;
        }
        public String getSilenceStartTime() {
            return this.silenceStartTime;
        }

        public GetBaselineResponseBodyDataAlertSettings setTopicSlowConfig(GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig topicSlowConfig) {
            this.topicSlowConfig = topicSlowConfig;
            return this;
        }
        public GetBaselineResponseBodyDataAlertSettingsTopicSlowConfig getTopicSlowConfig() {
            return this.topicSlowConfig;
        }

        public GetBaselineResponseBodyDataAlertSettings setTopicTypes(java.util.List<String> topicTypes) {
            this.topicTypes = topicTypes;
            return this;
        }
        public java.util.List<String> getTopicTypes() {
            return this.topicTypes;
        }

        public GetBaselineResponseBodyDataAlertSettings setWebhooks(java.util.List<String> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public java.util.List<String> getWebhooks() {
            return this.webhooks;
        }

    }

    public static class GetBaselineResponseBodyDataOverTimeSettings extends TeaModel {
        /**
         * <p>The cycle corresponding to the committed time. The value is 1 for daily baselines. You can configure up to 24 cycles for hourly baselines.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>The committed time in hh:mm format, where hh ranges from 0 to 47 and mm ranges from 0 to 59.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("Time")
        public String time;

        public static GetBaselineResponseBodyDataOverTimeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineResponseBodyDataOverTimeSettings self = new GetBaselineResponseBodyDataOverTimeSettings();
            return TeaModel.build(map, self);
        }

        public GetBaselineResponseBodyDataOverTimeSettings setCycle(Integer cycle) {
            this.cycle = cycle;
            return this;
        }
        public Integer getCycle() {
            return this.cycle;
        }

        public GetBaselineResponseBodyDataOverTimeSettings setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class GetBaselineResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether alerting is started. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlertEnabled")
        public Boolean alertEnabled;

        /**
         * <p>The alert margin threshold, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AlertMarginThreshold")
        public Integer alertMarginThreshold;

        /**
         * <p>The alert settings.</p>
         */
        @NameInMap("AlertSettings")
        public java.util.List<GetBaselineResponseBodyDataAlertSettings> alertSettings;

        /**
         * <p>The ID of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Test baseline</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The type of the baseline. Valid values:</p>
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
         * <p>Indicates whether the baseline is started.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of upstream nodes of the baseline.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<Long> nodeIds;

        /**
         * <p>The baseline committed time settings.</p>
         */
        @NameInMap("OverTimeSettings")
        public java.util.List<GetBaselineResponseBodyDataOverTimeSettings> overTimeSettings;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>9527952****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetBaselineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineResponseBodyData self = new GetBaselineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineResponseBodyData setAlertEnabled(Boolean alertEnabled) {
            this.alertEnabled = alertEnabled;
            return this;
        }
        public Boolean getAlertEnabled() {
            return this.alertEnabled;
        }

        public GetBaselineResponseBodyData setAlertMarginThreshold(Integer alertMarginThreshold) {
            this.alertMarginThreshold = alertMarginThreshold;
            return this;
        }
        public Integer getAlertMarginThreshold() {
            return this.alertMarginThreshold;
        }

        public GetBaselineResponseBodyData setAlertSettings(java.util.List<GetBaselineResponseBodyDataAlertSettings> alertSettings) {
            this.alertSettings = alertSettings;
            return this;
        }
        public java.util.List<GetBaselineResponseBodyDataAlertSettings> getAlertSettings() {
            return this.alertSettings;
        }

        public GetBaselineResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineResponseBodyData setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public GetBaselineResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetBaselineResponseBodyData setNodeIds(java.util.List<Long> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        public GetBaselineResponseBodyData setOverTimeSettings(java.util.List<GetBaselineResponseBodyDataOverTimeSettings> overTimeSettings) {
            this.overTimeSettings = overTimeSettings;
            return this;
        }
        public java.util.List<GetBaselineResponseBodyDataOverTimeSettings> getOverTimeSettings() {
            return this.overTimeSettings;
        }

        public GetBaselineResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
