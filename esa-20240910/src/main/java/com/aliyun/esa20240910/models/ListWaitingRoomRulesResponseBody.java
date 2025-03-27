// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomRulesResponseBody extends TeaModel {
    /**
     * <p>Request ID, used for tracking the call status.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of waiting room bypass rules.</p>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: set the value to true</li>
         * <li>Match specific requests: set the value to a custom expression, e.g., (http.host eq \&quot;video.example.com\&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch. This parameter does not need to be set when adding global configuration. Value range:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>Rule name. This parameter does not need to be set when adding global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Rule ID.</p>
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
