// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDesensitizationRuleResponseBody extends TeaModel {
    /**
     * <p>The list of masking rules.</p>
     */
    @NameInMap("DesensitizationRuleList")
    public java.util.List<ListDesensitizationRuleResponseBodyDesensitizationRuleList> desensitizationRuleList;

    /**
     * <p>The algorithm used for masking.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The name of the user who last modified the masking rule.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of times that the masking was used.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     */
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
        /**
         * <p>The type of the masking algorithm.</p>
         */
        @NameInMap("FuncParams")
        public String funcParams;

        /**
         * <p>The algorithm type.</p>
         */
        @NameInMap("FuncSample")
        public String funcSample;

        /**
         * <p>The algorithm used for masking.</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("LastModifierId")
        public String lastModifierId;

        @NameInMap("LastModifierName")
        public String lastModifierName;

        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>The ID of the user who last modified the masking rule.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The error message returned if the request failed.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The parameter.</p>
         */
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
