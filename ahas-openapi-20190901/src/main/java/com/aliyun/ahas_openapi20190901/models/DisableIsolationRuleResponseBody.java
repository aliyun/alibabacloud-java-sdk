// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class DisableIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisableIsolationRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableIsolationRuleResponseBody self = new DisableIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableIsolationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableIsolationRuleResponseBody setData(DisableIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public DisableIsolationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableIsolationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableIsolationRuleResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Threshold")
        public Float threshold;

        public static DisableIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableIsolationRuleResponseBodyData self = new DisableIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableIsolationRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DisableIsolationRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DisableIsolationRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public DisableIsolationRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DisableIsolationRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public DisableIsolationRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public DisableIsolationRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DisableIsolationRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DisableIsolationRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
