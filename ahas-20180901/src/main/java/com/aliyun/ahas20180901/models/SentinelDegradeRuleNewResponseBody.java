// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelDegradeRuleNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelDegradeRuleNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleNewResponseBody self = new SentinelDegradeRuleNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelDegradeRuleNewResponseBody setData(SentinelDegradeRuleNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelDegradeRuleNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelDegradeRuleNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelDegradeRuleNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelDegradeRuleNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelDegradeRuleNewResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("count")
        public Float count;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("halfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("halfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("minRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("slowRatioThreshold")
        public Float slowRatioThreshold;

        @NameInMap("statIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("timeWindow")
        public Integer timeWindow;

        @NameInMap("userId")
        public String userId;

        public static SentinelDegradeRuleNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelDegradeRuleNewResponseBodyData self = new SentinelDegradeRuleNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelDegradeRuleNewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelDegradeRuleNewResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelDegradeRuleNewResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelDegradeRuleNewResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelDegradeRuleNewResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelDegradeRuleNewResponseBodyData setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public SentinelDegradeRuleNewResponseBodyData setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public SentinelDegradeRuleNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelDegradeRuleNewResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelDegradeRuleNewResponseBodyData setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public SentinelDegradeRuleNewResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelDegradeRuleNewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelDegradeRuleNewResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelDegradeRuleNewResponseBodyData setSlowRatioThreshold(Float slowRatioThreshold) {
            this.slowRatioThreshold = slowRatioThreshold;
            return this;
        }
        public Float getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        public SentinelDegradeRuleNewResponseBodyData setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public SentinelDegradeRuleNewResponseBodyData setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public SentinelDegradeRuleNewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
