// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class EnableIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EnableIsolationRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static EnableIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableIsolationRuleResponseBody self = new EnableIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableIsolationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableIsolationRuleResponseBody setData(EnableIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public EnableIsolationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableIsolationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableIsolationRuleResponseBodyData extends TeaModel {
        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Enable")
        public Boolean enable;

        public static EnableIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableIsolationRuleResponseBodyData self = new EnableIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableIsolationRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public EnableIsolationRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public EnableIsolationRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public EnableIsolationRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public EnableIsolationRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public EnableIsolationRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public EnableIsolationRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public EnableIsolationRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public EnableIsolationRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
