// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleOffResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGatewayFlowRuleOffResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayFlowRuleOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleOffResponseBody self = new SentinelGatewayFlowRuleOffResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleOffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayFlowRuleOffResponseBody setData(SentinelGatewayFlowRuleOffResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGatewayFlowRuleOffResponseBodyData getData() {
        return this.data;
    }

    public SentinelGatewayFlowRuleOffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayFlowRuleOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayFlowRuleOffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayFlowRuleOffResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("burst")
        public Integer burst;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("intervalSec")
        public Long intervalSec;

        @NameInMap("maxQueueingTimeoutMs")
        public Integer maxQueueingTimeoutMs;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("paramItem")
        public java.util.Map<String, ?> paramItem;

        @NameInMap("resource")
        public String resource;

        @NameInMap("resourceMode")
        public Integer resourceMode;

        @NameInMap("userId")
        public String userId;

        public static SentinelGatewayFlowRuleOffResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayFlowRuleOffResponseBodyData self = new SentinelGatewayFlowRuleOffResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setIntervalSec(Long intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }
        public Long getIntervalSec() {
            return this.intervalSec;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
            this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
            return this;
        }
        public Integer getMaxQueueingTimeoutMs() {
            return this.maxQueueingTimeoutMs;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setParamItem(java.util.Map<String, ?> paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public java.util.Map<String, ?> getParamItem() {
            return this.paramItem;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setResourceMode(Integer resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public Integer getResourceMode() {
            return this.resourceMode;
        }

        public SentinelGatewayFlowRuleOffResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
