// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7GlobalRuleResponseBody extends TeaModel {
    /**
     * <p>The global template rule information.</p>
     */
    @NameInMap("GlobalRules")
    public java.util.List<DescribeL7GlobalRuleResponseBodyGlobalRules> globalRules;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
     * 
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
         * <p>The action that the rule performs. Valid values:</p>
         * <ul>
         * <li><strong>watch</strong>: Monitor.</li>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>challenge</strong>: JavaScript Challenge.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>watch</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The default action of the rule. Valid values:</p>
         * <ul>
         * <li><strong>watch</strong>: Monitor.</li>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>challenge</strong>: JavaScript Challenge.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>watch</p>
         */
        @NameInMap("ActionDefault")
        public String actionDefault;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP请求疑似模拟浏览器，校验浏览器Header等组合特征#4</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enabled.</li>
         * <li><strong>0</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enabled")
        public Long enabled;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>global_1</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>模拟浏览器请求</p>
         */
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
