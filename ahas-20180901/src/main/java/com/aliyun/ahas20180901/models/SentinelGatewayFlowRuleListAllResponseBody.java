// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayFlowRuleListAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelGatewayFlowRuleListAllResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGatewayFlowRuleListAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayFlowRuleListAllResponseBody self = new SentinelGatewayFlowRuleListAllResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayFlowRuleListAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGatewayFlowRuleListAllResponseBody setData(java.util.List<SentinelGatewayFlowRuleListAllResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelGatewayFlowRuleListAllResponseBodyData> getData() {
        return this.data;
    }

    public SentinelGatewayFlowRuleListAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGatewayFlowRuleListAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGatewayFlowRuleListAllResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGatewayFlowRuleListAllResponseBodyData extends TeaModel {
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

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("hasParam")
        public Boolean hasParam;

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

        public static SentinelGatewayFlowRuleListAllResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGatewayFlowRuleListAllResponseBodyData self = new SentinelGatewayFlowRuleListAllResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setHasParam(Boolean hasParam) {
            this.hasParam = hasParam;
            return this;
        }
        public Boolean getHasParam() {
            return this.hasParam;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setIntervalSec(Long intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }
        public Long getIntervalSec() {
            return this.intervalSec;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
            this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
            return this;
        }
        public Integer getMaxQueueingTimeoutMs() {
            return this.maxQueueingTimeoutMs;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setParamItem(java.util.Map<String, ?> paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public java.util.Map<String, ?> getParamItem() {
            return this.paramItem;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setResourceMode(Integer resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public Integer getResourceMode() {
            return this.resourceMode;
        }

        public SentinelGatewayFlowRuleListAllResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
