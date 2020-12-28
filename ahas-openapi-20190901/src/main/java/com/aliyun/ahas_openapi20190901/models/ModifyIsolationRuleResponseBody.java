// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ModifyIsolationRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyIsolationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIsolationRuleResponseBody self = new ModifyIsolationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIsolationRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyIsolationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyIsolationRuleResponseBody setData(ModifyIsolationRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyIsolationRuleResponseBodyData getData() {
        return this.data;
    }

    public ModifyIsolationRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyIsolationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyIsolationRuleResponseBodyData extends TeaModel {
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

        public static ModifyIsolationRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyIsolationRuleResponseBodyData self = new ModifyIsolationRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyIsolationRuleResponseBodyData setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ModifyIsolationRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ModifyIsolationRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ModifyIsolationRuleResponseBodyData setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ModifyIsolationRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyIsolationRuleResponseBodyData setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ModifyIsolationRuleResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ModifyIsolationRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ModifyIsolationRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
