// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Resource")
    public ApplyMetricRuleTemplateResponseBodyResource resource;

    public static ApplyMetricRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateResponseBody self = new ApplyMetricRuleTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyMetricRuleTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApplyMetricRuleTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyMetricRuleTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyMetricRuleTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyMetricRuleTemplateResponseBody setResource(ApplyMetricRuleTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public ApplyMetricRuleTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public static class ApplyMetricRuleTemplateResponseBodyResourceAlertResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static ApplyMetricRuleTemplateResponseBodyResourceAlertResults build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseBodyResourceAlertResults self = new ApplyMetricRuleTemplateResponseBodyResourceAlertResults();
            return TeaModel.build(map, self);
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ApplyMetricRuleTemplateResponseBodyResource extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("AlertResults")
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults;

        public static ApplyMetricRuleTemplateResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseBodyResource self = new ApplyMetricRuleTemplateResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public ApplyMetricRuleTemplateResponseBodyResource setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ApplyMetricRuleTemplateResponseBodyResource setAlertResults(java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults) {
            this.alertResults = alertResults;
            return this;
        }
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> getAlertResults() {
            return this.alertResults;
        }

    }

}
