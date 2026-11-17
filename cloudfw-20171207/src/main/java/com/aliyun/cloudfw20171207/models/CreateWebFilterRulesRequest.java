// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterRulesRequest extends TeaModel {
    /**
     * <p>The list of web filtering rules. You can specify a maximum of 100 rules at a time, and the total number of rules in the template after creation must not exceed 100.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateWebFilterRulesRequestRules> rules;

    /**
     * <p>The ID of the web filtering template to which the web filtering rules belong. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static CreateWebFilterRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterRulesRequest self = new CreateWebFilterRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterRulesRequest setRules(java.util.List<CreateWebFilterRulesRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateWebFilterRulesRequestRules> getRules() {
        return this.rules;
    }

    public CreateWebFilterRulesRequest setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static class CreateWebFilterRulesRequestRulesConditions extends TeaModel {
        /**
         * <p>The type of the matching condition. Only <strong>URL</strong> is supported, which indicates matching by URL.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The URL to match. It cannot be empty and must not exceed 240 bytes in length (each Chinese character counts as 3 bytes). It must contain at least one forward slash (/), and the first segment must contain letters, digits, or Chinese characters. It cannot contain a protocol header, query parameters, or fragment identifiers. A single asterisk (<em>) indicates matching all URLs. When a wildcard is used, a maximum of one wildcard is allowed and it must end with /</em>. URLs within the same template cannot be duplicated.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/login">www.example.com/login</a></p>
         */
        @NameInMap("Values")
        public String values;

        public static CreateWebFilterRulesRequestRulesConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateWebFilterRulesRequestRulesConditions self = new CreateWebFilterRulesRequestRulesConditions();
            return TeaModel.build(map, self);
        }

        public CreateWebFilterRulesRequestRulesConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateWebFilterRulesRequestRulesConditions setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class CreateWebFilterRulesRequestRules extends TeaModel {
        /**
         * <p>The list of matching conditions for the rule. The list must contain exactly one condition.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<CreateWebFilterRulesRequestRulesConditions> conditions;

        /**
         * <p>The action to perform when a rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the request.</li>
         * <li><strong>Alert</strong>: monitors the request.</li>
         * <li><strong>Deny</strong>: blocks the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        public static CreateWebFilterRulesRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateWebFilterRulesRequestRules self = new CreateWebFilterRulesRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateWebFilterRulesRequestRules setConditions(java.util.List<CreateWebFilterRulesRequestRulesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateWebFilterRulesRequestRulesConditions> getConditions() {
            return this.conditions;
        }

        public CreateWebFilterRulesRequestRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

    }

}
