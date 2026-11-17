// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationCustomRulesRequest extends TeaModel {
    /**
     * <p>The list of custom application rules to be modified. You can specify up to 20 rules at a time. Rule IDs in the list must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateApplicationCustomRulesRequestRules> rules;

    public static UpdateApplicationCustomRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationCustomRulesRequest self = new UpdateApplicationCustomRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationCustomRulesRequest setRules(java.util.List<UpdateApplicationCustomRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateApplicationCustomRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class UpdateApplicationCustomRulesRequestRules extends TeaModel {
        /**
         * <p>The list of application IDs to be associated. You can specify up to 200 IDs. The IDs cannot be 0 and must exist in the built-in application signature library. The IDs must not overlap with those in RemoveApplicationIds. The combined list cannot be empty and can contain up to 200 IDs.</p>
         */
        @NameInMap("AddApplicationIds")
        public java.util.List<Long> addApplicationIds;

        /**
         * <p>The ID of the custom application rule to be modified. The rule must exist within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-7d2e4f6a8b0c1d3e</p>
         */
        @NameInMap("ApplicationCustomRuleId")
        public String applicationCustomRuleId;

        /**
         * <p>The name of the custom rule. The name can be up to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). If this parameter is not specified or is left empty, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomRule02</p>
         */
        @NameInMap("ApplicationCustomRuleName")
        public String applicationCustomRuleName;

        /**
         * <p>The priority of the rule. This parameter is required. Valid values: integers from 1 to 200. A smaller value indicates a higher priority. Priorities must be unique within the same template. You can swap priorities by deleting and then re-inserting rules.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The list of application IDs to be disassociated. You can specify up to 200 IDs. The IDs must not overlap with those in AddApplicationIds. The combined list cannot be empty and can contain up to 200 IDs.</p>
         */
        @NameInMap("RemoveApplicationIds")
        public java.util.List<Long> removeApplicationIds;

        /**
         * <p>The action to perform when the rule is matched. This parameter is required. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the traffic.</li>
         * <li><strong>Alert</strong>: monitors the traffic.</li>
         * <li><strong>Deny</strong>: blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        public static UpdateApplicationCustomRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationCustomRulesRequestRules self = new UpdateApplicationCustomRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationCustomRulesRequestRules setAddApplicationIds(java.util.List<Long> addApplicationIds) {
            this.addApplicationIds = addApplicationIds;
            return this;
        }
        public java.util.List<Long> getAddApplicationIds() {
            return this.addApplicationIds;
        }

        public UpdateApplicationCustomRulesRequestRules setApplicationCustomRuleId(String applicationCustomRuleId) {
            this.applicationCustomRuleId = applicationCustomRuleId;
            return this;
        }
        public String getApplicationCustomRuleId() {
            return this.applicationCustomRuleId;
        }

        public UpdateApplicationCustomRulesRequestRules setApplicationCustomRuleName(String applicationCustomRuleName) {
            this.applicationCustomRuleName = applicationCustomRuleName;
            return this;
        }
        public String getApplicationCustomRuleName() {
            return this.applicationCustomRuleName;
        }

        public UpdateApplicationCustomRulesRequestRules setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateApplicationCustomRulesRequestRules setRemoveApplicationIds(java.util.List<Long> removeApplicationIds) {
            this.removeApplicationIds = removeApplicationIds;
            return this;
        }
        public java.util.List<Long> getRemoveApplicationIds() {
            return this.removeApplicationIds;
        }

        public UpdateApplicationCustomRulesRequestRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

    }

}
