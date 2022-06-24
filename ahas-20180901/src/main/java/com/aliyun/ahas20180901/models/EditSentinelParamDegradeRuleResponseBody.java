// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelParamDegradeRuleResponseBody extends TeaModel {
    // RestResponse<ParamDegradeRuleDTO>
    @NameInMap("Content")
    public EditSentinelParamDegradeRuleResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static EditSentinelParamDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelParamDegradeRuleResponseBody self = new EditSentinelParamDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EditSentinelParamDegradeRuleResponseBody setContent(EditSentinelParamDegradeRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public EditSentinelParamDegradeRuleResponseBodyContent getContent() {
        return this.content;
    }

    public EditSentinelParamDegradeRuleResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public EditSentinelParamDegradeRuleResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class EditSentinelParamDegradeRuleResponseBodyContentData extends TeaModel {
        @NameInMap("AppGroup")
        public String appGroup;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Count")
        public Double count;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FallbackObject")
        public String fallbackObject;

        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("LimitApp")
        public String limitApp;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("Model")
        public Long model;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamKey")
        public String paramKey;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("StatIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("TimeWindow")
        public Integer timeWindow;

        @NameInMap("UserId")
        public String userId;

        public static EditSentinelParamDegradeRuleResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            EditSentinelParamDegradeRuleResponseBodyContentData self = new EditSentinelParamDegradeRuleResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setCount(Double count) {
            this.count = count;
            return this;
        }
        public Double getCount() {
            return this.count;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public EditSentinelParamDegradeRuleResponseBodyContentData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class EditSentinelParamDegradeRuleResponseBodyContent extends TeaModel {
        // 请求响应码，200 为success
        @NameInMap("Code")
        public String code;

        // 返回的数据对象
        @NameInMap("Data")
        public EditSentinelParamDegradeRuleResponseBodyContentData data;

        // 返回的错误信息
        @NameInMap("Message")
        public String message;

        // 请求ID
        @NameInMap("RequestId")
        public String requestId;

        // 是否成功标识
        @NameInMap("Success")
        public Boolean success;

        public static EditSentinelParamDegradeRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            EditSentinelParamDegradeRuleResponseBodyContent self = new EditSentinelParamDegradeRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public EditSentinelParamDegradeRuleResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public EditSentinelParamDegradeRuleResponseBodyContent setData(EditSentinelParamDegradeRuleResponseBodyContentData data) {
            this.data = data;
            return this;
        }
        public EditSentinelParamDegradeRuleResponseBodyContentData getData() {
            return this.data;
        }

        public EditSentinelParamDegradeRuleResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EditSentinelParamDegradeRuleResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public EditSentinelParamDegradeRuleResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
