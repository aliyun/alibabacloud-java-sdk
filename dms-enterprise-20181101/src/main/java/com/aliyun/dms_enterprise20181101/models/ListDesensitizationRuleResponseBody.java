// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDesensitizationRuleResponseBody extends TeaModel {
    // The list of masking rules.
    @NameInMap("DesensitizationRuleList")
    public java.util.List<ListDesensitizationRuleResponseBodyDesensitizationRuleList> desensitizationRuleList;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request failed.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   true: The request was successful.
    // *   false: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries returned. By default, this parameter is not returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDesensitizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDesensitizationRuleResponseBody self = new ListDesensitizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDesensitizationRuleResponseBody setDesensitizationRuleList(java.util.List<ListDesensitizationRuleResponseBodyDesensitizationRuleList> desensitizationRuleList) {
        this.desensitizationRuleList = desensitizationRuleList;
        return this;
    }
    public java.util.List<ListDesensitizationRuleResponseBodyDesensitizationRuleList> getDesensitizationRuleList() {
        return this.desensitizationRuleList;
    }

    public ListDesensitizationRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDesensitizationRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDesensitizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDesensitizationRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDesensitizationRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDesensitizationRuleResponseBodyDesensitizationRuleList extends TeaModel {
        // The parameter.
        @NameInMap("FuncParams")
        public String funcParams;

        // The example.
        @NameInMap("FuncSample")
        public String funcSample;

        // The algorithm type.
        @NameInMap("FunctionType")
        public String functionType;

        // The ID of the user who last modified the masking rule.
        @NameInMap("LastModifierId")
        public String lastModifierId;

        // The name of the user who last modified the masking rule.
        @NameInMap("LastModifierName")
        public String lastModifierName;

        // The number of times that the masking was used.
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        // The description of the rule.
        @NameInMap("RuleDesc")
        public String ruleDesc;

        // The ID of the masking rule.
        @NameInMap("RuleId")
        public Integer ruleId;

        // The name of the masking rule.
        @NameInMap("RuleName")
        public String ruleName;

        // The algorithm used for masking.
        @NameInMap("RuleType")
        public String ruleType;

        public static ListDesensitizationRuleResponseBodyDesensitizationRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListDesensitizationRuleResponseBodyDesensitizationRuleList self = new ListDesensitizationRuleResponseBodyDesensitizationRuleList();
            return TeaModel.build(map, self);
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setFuncParams(String funcParams) {
            this.funcParams = funcParams;
            return this;
        }
        public String getFuncParams() {
            return this.funcParams;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setFuncSample(String funcSample) {
            this.funcSample = funcSample;
            return this;
        }
        public String getFuncSample() {
            return this.funcSample;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setLastModifierId(String lastModifierId) {
            this.lastModifierId = lastModifierId;
            return this;
        }
        public String getLastModifierId() {
            return this.lastModifierId;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListDesensitizationRuleResponseBodyDesensitizationRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

}
