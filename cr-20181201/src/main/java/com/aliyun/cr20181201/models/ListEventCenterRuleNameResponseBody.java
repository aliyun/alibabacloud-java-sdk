// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRuleNameResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of names of event notification rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;RuleName\&quot;: \&quot;mlf\&quot;, \&quot;RuleId\&quot;: \&quot;crecr-73q93pgljm1pc2fp\&quot;}]</p>
     */
    @NameInMap("RuleNames")
    public java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> ruleNames;

    public static ListEventCenterRuleNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRuleNameResponseBody self = new ListEventCenterRuleNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRuleNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventCenterRuleNameResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListEventCenterRuleNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventCenterRuleNameResponseBody setRuleNames(java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> getRuleNames() {
        return this.ruleNames;
    }

    public static class ListEventCenterRuleNameResponseBodyRuleNames extends TeaModel {
        /**
         * <p>The ID of the event notification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crecr-n6pbhgjxtl*****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the event notification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-chain</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListEventCenterRuleNameResponseBodyRuleNames build(java.util.Map<String, ?> map) throws Exception {
            ListEventCenterRuleNameResponseBodyRuleNames self = new ListEventCenterRuleNameResponseBodyRuleNames();
            return TeaModel.build(map, self);
        }

        public ListEventCenterRuleNameResponseBodyRuleNames setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListEventCenterRuleNameResponseBodyRuleNames setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
