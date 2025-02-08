// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
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
         * <p>Whether @ everyone.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AtAll")
        public Boolean atAll;

        /**
         * <p>DingTalk robot address</p>
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

    public static class GetBaselineResponseBodyDataAlertSettings extends TeaModel {
        /**
         * <p>The event alert interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        /**
         * <p>The maximum number of event alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertMaximum")
        public Integer alertMaximum;

        /**
         * <p>Alert method list</p>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>Alert recipient details.</p>
         * <p>AlertRecipientType is OWNER: empty
         * AlertRecipientType is SHIFT_SCHEDULE: duty table uid
         * AlertRecipientType is OTHER: uid list, multiple UIDs are in English, split</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("AlertRecipient")
        public String alertRecipient;

        /**
         * <p>The type of alert recipient.</p>
         * <ul>
         * <li>OWNER: task owner</li>
         * <li>OTHER: designated person</li>
         * <li>SHIFT: SCHEDULE-duty table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertRecipientType")
        public String alertRecipientType;

        /**
         * <p>Alert type</p>
         * <ul>
         * <li>BASELINE: baseline</li>
         * <li>TOPIC: event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASELINE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The baseline alarm switch.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BaselineAlertEnabled")
        public Boolean baselineAlertEnabled;

        /**
         * <p>DingTalk robot list.</p>
         */
        @NameInMap("DingRobots")
        public java.util.List<GetBaselineResponseBodyDataAlertSettingsDingRobots> dingRobots;

        /**
         * <p>The end time of the silence. The format is HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        /**
         * <p>The start time of the silence. Format: HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        /**
         * <p>The list of Event Alert types.</p>
         */
        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

        /**
         * <p>webhook list.</p>
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
         * <p>The period corresponding to the commitment time. The space-based line is 1, and the hourly baseline can be configured for up to 24 cycles.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>Commitment time, hh:mm format, hh value range is [0,47],mm value range is [0,59].</p>
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
         * <p>Indicates whether the alerting feature is enabled. Valid values:</p>
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
         * <p>The alert margin threshold. Unit: minutes.</p>
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
         * <p>The baseline ID.</p>
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
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("BaselineType")
        public String baselineType;

        /**
         * <p>Indicates whether the baseline is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The node IDs.</p>
         */
        @NameInMap("NodeIds")
        public java.util.List<Long> nodeIds;

        /**
         * <p>The settings of the committed completion time of the baseline.</p>
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
         * <p>The workspace ID.</p>
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
