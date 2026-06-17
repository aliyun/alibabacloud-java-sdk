// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMetricRulesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>A value of 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>461CF2CD-2FC3-4B26-8645-7BD27E7D0F1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public CreateGroupMetricRulesResponseBodyResources resources;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateGroupMetricRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMetricRulesResponseBody self = new CreateGroupMetricRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupMetricRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateGroupMetricRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupMetricRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupMetricRulesResponseBody setResources(CreateGroupMetricRulesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public CreateGroupMetricRulesResponseBodyResources getResources() {
        return this.resources;
    }

    public CreateGroupMetricRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGroupMetricRulesResponseBodyResourcesAlertResult extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Message")
        public String message;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Success")
        public Boolean success;

        public static CreateGroupMetricRulesResponseBodyResourcesAlertResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesResponseBodyResourcesAlertResult self = new CreateGroupMetricRulesResponseBodyResourcesAlertResult();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesResponseBodyResourcesAlertResult setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public CreateGroupMetricRulesResponseBodyResourcesAlertResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateGroupMetricRulesResponseBodyResourcesAlertResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateGroupMetricRulesResponseBodyResourcesAlertResult setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateGroupMetricRulesResponseBodyResourcesAlertResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateGroupMetricRulesResponseBodyResources extends TeaModel {
        @NameInMap("AlertResult")
        public java.util.List<CreateGroupMetricRulesResponseBodyResourcesAlertResult> alertResult;

        public static CreateGroupMetricRulesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMetricRulesResponseBodyResources self = new CreateGroupMetricRulesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public CreateGroupMetricRulesResponseBodyResources setAlertResult(java.util.List<CreateGroupMetricRulesResponseBodyResourcesAlertResult> alertResult) {
            this.alertResult = alertResult;
            return this;
        }
        public java.util.List<CreateGroupMetricRulesResponseBodyResourcesAlertResult> getAlertResult() {
            return this.alertResult;
        }

    }

}
