// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7GlobalRuleResponseBody extends TeaModel {
    @NameInMap("GlobalRules")
    public java.util.List<DescribeL7GlobalRuleResponseBodyGlobalRules> globalRules;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeL7GlobalRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7GlobalRuleResponseBody self = new DescribeL7GlobalRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL7GlobalRuleResponseBody setGlobalRules(java.util.List<DescribeL7GlobalRuleResponseBodyGlobalRules> globalRules) {
        this.globalRules = globalRules;
        return this;
    }
    public java.util.List<DescribeL7GlobalRuleResponseBodyGlobalRules> getGlobalRules() {
        return this.globalRules;
    }

    public DescribeL7GlobalRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeL7GlobalRuleResponseBodyGlobalRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>watch</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>watch</p>
         */
        @NameInMap("ActionDefault")
        public String actionDefault;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enabled")
        public Long enabled;

        /**
         * <strong>example:</strong>
         * <p>global_1</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeL7GlobalRuleResponseBodyGlobalRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeL7GlobalRuleResponseBodyGlobalRules self = new DescribeL7GlobalRuleResponseBodyGlobalRules();
            return TeaModel.build(map, self);
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setActionDefault(String actionDefault) {
            this.actionDefault = actionDefault;
            return this;
        }
        public String getActionDefault() {
            return this.actionDefault;
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeL7GlobalRuleResponseBodyGlobalRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
