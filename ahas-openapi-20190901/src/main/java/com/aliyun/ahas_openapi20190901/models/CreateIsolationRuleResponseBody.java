// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateIsolationRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIsolationRuleResponseBody self = new CreateIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIsolationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIsolationRuleResponseBody setData(CreateIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public CreateIsolationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIsolationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIsolationRuleResponseBodyData extends TeaModel {
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

        public static CreateIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIsolationRuleResponseBodyData self = new CreateIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIsolationRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public CreateIsolationRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public CreateIsolationRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateIsolationRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public CreateIsolationRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIsolationRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public CreateIsolationRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public CreateIsolationRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public CreateIsolationRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
