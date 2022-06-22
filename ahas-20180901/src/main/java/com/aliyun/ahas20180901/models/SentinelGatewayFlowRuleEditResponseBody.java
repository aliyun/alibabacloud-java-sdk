// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleEditResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGatewayFlowRuleEditResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayFlowRuleEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleEditResponseBody self = new SentinelGatewayFlowRuleEditResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayFlowRuleEditResponseBody setData(SentinelGatewayFlowRuleEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGatewayFlowRuleEditResponseBodyData getData() {
        return this.data;
    }

    public SentinelGatewayFlowRuleEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayFlowRuleEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayFlowRuleEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayFlowRuleEditResponseBodyData extends TeaModel {
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

        public static SentinelGatewayFlowRuleEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayFlowRuleEditResponseBodyData self = new SentinelGatewayFlowRuleEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setIntervalSec(Long intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }
        public Long getIntervalSec() {
            return this.intervalSec;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
            this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
            return this;
        }
        public Integer getMaxQueueingTimeoutMs() {
            return this.maxQueueingTimeoutMs;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setParamItem(java.util.Map<String, ?> paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public java.util.Map<String, ?> getParamItem() {
            return this.paramItem;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setResourceMode(Integer resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public Integer getResourceMode() {
            return this.resourceMode;
        }

        public SentinelGatewayFlowRuleEditResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
