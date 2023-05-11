// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call succeeds. Valid values:</p>
     * <br>
     * <p>*   true: The call succeeds.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The resources that are affected by the alert rule.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the application group to which the alert template is applied.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>>  The HTTP status code 200 indicates that the call succeeds.</p>
     */
    @NameInMap("Resource")
    public ApplyMetricRuleTemplateResponseBodyResource resource;

    /**
     * <p>The details of the generated alert rule.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public ApplyMetricRuleTemplateResponseBody setResource(ApplyMetricRuleTemplateResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public ApplyMetricRuleTemplateResponseBodyResource getResource() {
        return this.resource;
    }

    public ApplyMetricRuleTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyMetricRuleTemplateResponseBodyResourceAlertResults extends TeaModel {
        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>In this example, the `700****` alert template is applied to the `123456` application group. For the generated alert rule, the ID is `applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****`, and the name is `test123`.</p>
         */
        @NameInMap("Success")
        public Boolean success;

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

        public ApplyMetricRuleTemplateResponseBodyResourceAlertResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ApplyMetricRuleTemplateResponseBodyResource extends TeaModel {
        /**
         * <p>Indicates whether the call succeeds. Valid values:</p>
         * <br>
         * <p>*   true: The call succeeds.</p>
         * <p>*   false: The call fails.</p>
         */
        @NameInMap("AlertResults")
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults;

        /**
         * <p>The returned information.</p>
         */
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
