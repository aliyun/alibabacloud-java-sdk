// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationCustomRulesRequest extends TeaModel {
    /**
     * <p>The ID of the application template to which the custom rules belong. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ati-4f0691c56b8d4f06</p>
     */
    @NameInMap("ApplicationTemplateId")
    public String applicationTemplateId;

    /**
     * <p>The list of custom rules for the application. You can specify up to 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateApplicationCustomRulesRequestRules> rules;

    public static CreateApplicationCustomRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationCustomRulesRequest self = new CreateApplicationCustomRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationCustomRulesRequest setApplicationTemplateId(String applicationTemplateId) {
        this.applicationTemplateId = applicationTemplateId;
        return this;
    }
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    public CreateApplicationCustomRulesRequest setRules(java.util.List<CreateApplicationCustomRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateApplicationCustomRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class CreateApplicationCustomRulesRequestRules extends TeaModel {
        /**
         * <p>The name of the custom rule. The name cannot be empty and can be up to 64 characters in length. It can contain Chinese characters, English letters, digits, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>CustomRule01</p>
         */
        @NameInMap("ApplicationCustomRuleName")
        public String applicationCustomRuleName;

        /**
         * <p>The list of application IDs associated with the rule. A single rule can be associated with 1 to 200 applications. The IDs cannot be 0, must be unique, and must exist in the built-in application signature library. You can call the ListApplications operation to query the IDs.</p>
         */
        @NameInMap("ApplicationIds")
        public java.util.List<Long> applicationIds;

        /**
         * <p>The priority of the rule. Valid values: integers from 1 to 200. A smaller value indicates a higher priority. Priorities must be unique within the same batch and the same template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The action to perform when the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the traffic.</li>
         * <li><strong>Alert</strong>: monitors the traffic.</li>
         * <li><strong>Deny</strong>: blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        public static CreateApplicationCustomRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationCustomRulesRequestRules self = new CreateApplicationCustomRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateApplicationCustomRulesRequestRules setApplicationCustomRuleName(String applicationCustomRuleName) {
            this.applicationCustomRuleName = applicationCustomRuleName;
            return this;
        }
        public String getApplicationCustomRuleName() {
            return this.applicationCustomRuleName;
        }

        public CreateApplicationCustomRulesRequestRules setApplicationIds(java.util.List<Long> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<Long> getApplicationIds() {
            return this.applicationIds;
        }

        public CreateApplicationCustomRulesRequestRules setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateApplicationCustomRulesRequestRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

    }

}
