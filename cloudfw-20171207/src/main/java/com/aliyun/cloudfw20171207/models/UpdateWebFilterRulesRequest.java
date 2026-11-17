// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterRulesRequest extends TeaModel {
    /**
     * <p>The list of web filtering rules to be updated. You can specify up to 20 rules at a time. The rule IDs in the list must be unique.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateWebFilterRulesRequestRules> rules;

    public static UpdateWebFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterRulesRequest self = new UpdateWebFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterRulesRequest setRules(java.util.List<UpdateWebFilterRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateWebFilterRulesRequestRules> getRules() {
        return this.rules;
    }

    public static class UpdateWebFilterRulesRequestRulesConditions extends TeaModel {
        /**
         * <p>The type of the match condition. Only <strong>URL</strong> is supported, which indicates matching by URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The URL to match. The value cannot be empty and must not exceed 240 bytes in length. Each Chinese character is counted as 3 bytes. The URL must contain at least one forward slash (/), and the first segment must contain letters, digits, or Chinese characters. The URL cannot contain a protocol header, query parameters, or fragment identifiers. A single asterisk (<em>) matches all URLs. If a wildcard is used, only one wildcard is allowed and it must end with /</em>. URLs within the same template must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/login">www.example.com/login</a></p>
         */
        @NameInMap("Values")
        public String values;

        public static UpdateWebFilterRulesRequestRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateWebFilterRulesRequestRulesConditions self = new UpdateWebFilterRulesRequestRulesConditions();
            return TeaModel.build(map, self);
        }

        public UpdateWebFilterRulesRequestRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateWebFilterRulesRequestRulesConditions setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class UpdateWebFilterRulesRequestRules extends TeaModel {
        /**
         * <p>The list of match conditions for the rule. The list must contain exactly one condition. After the update, URLs within the same template must be unique.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<UpdateWebFilterRulesRequestRulesConditions> conditions;

        /**
         * <p>The action to perform when the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the request.</li>
         * <li><strong>Alert</strong>: monitors the request.</li>
         * <li><strong>Deny</strong>: blocks the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>The ID of the web filtering rule to be updated. The rule must exist within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>wfr-8c1d2e3f4a5b6c7d</p>
         */
        @NameInMap("WebFilterRuleId")
        public String webFilterRuleId;

        public static UpdateWebFilterRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateWebFilterRulesRequestRules self = new UpdateWebFilterRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateWebFilterRulesRequestRules setConditions(java.util.List<UpdateWebFilterRulesRequestRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<UpdateWebFilterRulesRequestRulesConditions> getConditions() {
            return this.conditions;
        }

        public UpdateWebFilterRulesRequestRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public UpdateWebFilterRulesRequestRules setWebFilterRuleId(String webFilterRuleId) {
            this.webFilterRuleId = webFilterRuleId;
            return this;
        }
        public String getWebFilterRuleId() {
            return this.webFilterRuleId;
        }

    }

}
