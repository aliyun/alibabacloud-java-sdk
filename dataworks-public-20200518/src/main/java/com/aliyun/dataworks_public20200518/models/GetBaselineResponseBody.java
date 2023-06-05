// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBaselineResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AtAll")
        public Boolean atAll;

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
        public java.util.List<GetBaselineResponseBodyDataAlertSettingsDingRobots> dingRobots;

        @NameInMap("SilenceEndTime")
        public String silenceEndTime;

        @NameInMap("SilenceStartTime")
        public String silenceStartTime;

        @NameInMap("TopicTypes")
        public java.util.List<String> topicTypes;

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
        @NameInMap("Cycle")
        public Integer cycle;

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
        @NameInMap("AlertEnabled")
        public Boolean alertEnabled;

        @NameInMap("AlertMarginThreshold")
        public Integer alertMarginThreshold;

        @NameInMap("AlertSettings")
        public java.util.List<GetBaselineResponseBodyDataAlertSettings> alertSettings;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineType")
        public String baselineType;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("NodeIds")
        public java.util.List<Long> nodeIds;

        @NameInMap("OverTimeSettings")
        public java.util.List<GetBaselineResponseBodyDataOverTimeSettings> overTimeSettings;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

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
