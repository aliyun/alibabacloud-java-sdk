// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleOffResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelFlowRuleOffResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFlowRuleOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleOffResponseBody self = new SentinelFlowRuleOffResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleOffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFlowRuleOffResponseBody setData(SentinelFlowRuleOffResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelFlowRuleOffResponseBodyData getData() {
        return this.data;
    }

    public SentinelFlowRuleOffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFlowRuleOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFlowRuleOffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFlowRuleOffResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("maxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("refResource")
        public String refResource;

        @NameInMap("resource")
        public String resource;

        @NameInMap("strategy")
        public Integer strategy;

        @NameInMap("userId")
        public String userId;

        @NameInMap("warmUpPeriodSec")
        public Integer warmUpPeriodSec;

        public static SentinelFlowRuleOffResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFlowRuleOffResponseBodyData self = new SentinelFlowRuleOffResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFlowRuleOffResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFlowRuleOffResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelFlowRuleOffResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelFlowRuleOffResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelFlowRuleOffResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelFlowRuleOffResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelFlowRuleOffResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFlowRuleOffResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelFlowRuleOffResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelFlowRuleOffResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelFlowRuleOffResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFlowRuleOffResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public SentinelFlowRuleOffResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFlowRuleOffResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public SentinelFlowRuleOffResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFlowRuleOffResponseBodyData setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

    }

}
