// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelParamDegradeRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSentinelParamDegradeRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSentinelParamDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelParamDegradeRuleResponseBody self = new CreateSentinelParamDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSentinelParamDegradeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSentinelParamDegradeRuleResponseBody setData(CreateSentinelParamDegradeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSentinelParamDegradeRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateSentinelParamDegradeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSentinelParamDegradeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSentinelParamDegradeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSentinelParamDegradeRuleResponseBodyData extends TeaModel {
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

        public static CreateSentinelParamDegradeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSentinelParamDegradeRuleResponseBodyData self = new CreateSentinelParamDegradeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setCount(Double count) {
            this.count = count;
            return this;
        }
        public Double getCount() {
            return this.count;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public CreateSentinelParamDegradeRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
