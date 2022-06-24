// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelAllParamDegradeRuleResponseBody extends TeaModel {
    // RestResponse<List<ParamDegradeRuleDTO>>
    @NameInMap("Content")
    public ListSentinelAllParamDegradeRuleResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static ListSentinelAllParamDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelAllParamDegradeRuleResponseBody self = new ListSentinelAllParamDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSentinelAllParamDegradeRuleResponseBody setContent(ListSentinelAllParamDegradeRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListSentinelAllParamDegradeRuleResponseBodyContent getContent() {
        return this.content;
    }

    public ListSentinelAllParamDegradeRuleResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public ListSentinelAllParamDegradeRuleResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class ListSentinelAllParamDegradeRuleResponseBodyContentData extends TeaModel {
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

        @NameInMap("Grade")
        public Integer grade;

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

        public static ListSentinelAllParamDegradeRuleResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelAllParamDegradeRuleResponseBodyContentData self = new ListSentinelAllParamDegradeRuleResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setCount(Double count) {
            this.count = count;
            return this;
        }
        public Double getCount() {
            return this.count;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContentData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListSentinelAllParamDegradeRuleResponseBodyContent extends TeaModel {
        // 请求响应码，200 为success
        @NameInMap("Code")
        public String code;

        // 返回的数据对象
        @NameInMap("Data")
        public java.util.List<ListSentinelAllParamDegradeRuleResponseBodyContentData> data;

        // 返回的错误信息
        @NameInMap("Message")
        public String message;

        // 请求ID
        @NameInMap("RequestId")
        public String requestId;

        // 是否成功标识
        @NameInMap("Success")
        public Boolean success;

        public static ListSentinelAllParamDegradeRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelAllParamDegradeRuleResponseBodyContent self = new ListSentinelAllParamDegradeRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContent setData(java.util.List<ListSentinelAllParamDegradeRuleResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSentinelAllParamDegradeRuleResponseBodyContentData> getData() {
            return this.data;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListSentinelAllParamDegradeRuleResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
