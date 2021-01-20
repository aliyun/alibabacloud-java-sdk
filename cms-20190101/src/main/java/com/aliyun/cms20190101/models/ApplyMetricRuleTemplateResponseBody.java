// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public ApplyMetricRuleTemplateResponseBodyResource resource;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyMetricRuleTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateResponseBody self = new ApplyMetricRuleTemplateResponseBody();
        return TeaModel.build(map, self);
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

    public ApplyMetricRuleTemplateResponseBody setResource(ApplyMetricRuleTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public ApplyMetricRuleTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public ApplyMetricRuleTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApplyMetricRuleTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyMetricRuleTemplateResponseBodyResourceAlertResults extends TeaModel {
        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ApplyMetricRuleTemplateResponseBodyResourceAlertResults build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseBodyResourceAlertResults self = new ApplyMetricRuleTemplateResponseBodyResourceAlertResults();
            return TeaModel.build(map, self);
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
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

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ApplyMetricRuleTemplateResponseBodyResource extends TeaModel {
        @NameInMap("AlertResults")
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults;

        @NameInMap("GroupId")
        public Long groupId;

        public static ApplyMetricRuleTemplateResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            ApplyMetricRuleTemplateResponseBodyResource self = new ApplyMetricRuleTemplateResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public ApplyMetricRuleTemplateResponseBodyResource setAlertResults(java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults) {
            this.alertResults = alertResults;
            return this;
        }
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> getAlertResults() {
            return this.alertResults;
        }

        public ApplyMetricRuleTemplateResponseBodyResource setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

    }

}
