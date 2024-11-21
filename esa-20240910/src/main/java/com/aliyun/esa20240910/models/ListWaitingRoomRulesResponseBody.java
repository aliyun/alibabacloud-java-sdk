// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to trace a call.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The waiting room bypass rules.</p>
     */
    @NameInMap("WaitingRoomRules")
    public java.util.List<ListWaitingRoomRulesResponseBodyWaitingRoomRules> waitingRoomRules;

    public static ListWaitingRoomRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomRulesResponseBody self = new ListWaitingRoomRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWaitingRoomRulesResponseBody setWaitingRoomRules(java.util.List<ListWaitingRoomRulesResponseBodyWaitingRoomRules> waitingRoomRules) {
        this.waitingRoomRules = waitingRoomRules;
        return this;
    }
    public java.util.List<ListWaitingRoomRulesResponseBodyWaitingRoomRules> getWaitingRoomRules() {
        return this.waitingRoomRules;
    }

    public static class ListWaitingRoomRulesResponseBodyWaitingRoomRules extends TeaModel {
        /**
         * <p>The rule content, which is a policy or conditional expression.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37286782688****</p>
         */
        @NameInMap("WaitingRoomRuleId")
        public Long waitingRoomRuleId;

        public static ListWaitingRoomRulesResponseBodyWaitingRoomRules build(java.util.Map<String, ?> map) throws Exception {
            ListWaitingRoomRulesResponseBodyWaitingRoomRules self = new ListWaitingRoomRulesResponseBodyWaitingRoomRules();
            return TeaModel.build(map, self);
        }

        public ListWaitingRoomRulesResponseBodyWaitingRoomRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListWaitingRoomRulesResponseBodyWaitingRoomRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListWaitingRoomRulesResponseBodyWaitingRoomRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListWaitingRoomRulesResponseBodyWaitingRoomRules setWaitingRoomRuleId(Long waitingRoomRuleId) {
            this.waitingRoomRuleId = waitingRoomRuleId;
            return this;
        }
        public Long getWaitingRoomRuleId() {
            return this.waitingRoomRuleId;
        }

    }

}
