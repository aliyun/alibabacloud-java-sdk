// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateResponseBody extends TeaModel {
    /**
     * <p>The responses code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F897F3C-020A-4993-95B4-63ABB84F83E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that are affected by the alert rule.</p>
     */
    @NameInMap("Resource")
    public ApplyMetricRuleTemplateResponseBodyResource resource;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The responses code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>alert rule is creating, please wait a few minutes.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The details of the generated alert rule.</p>
         */
        @NameInMap("AlertResults")
        public java.util.List<ApplyMetricRuleTemplateResponseBodyResourceAlertResults> alertResults;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
