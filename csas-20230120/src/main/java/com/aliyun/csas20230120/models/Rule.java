// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    /**
     * <p>The logical relationship between rules at the same level. Valid values:</p>
     * <ul>
     * <li><strong>AND</strong>: All rules at the same level must be hit.</li>
     * <li><strong>OR</strong>: Any one rule at the same level can be hit.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AND</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Combinator")
    public String combinator;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1361</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The endpoint device attribute field to match. Required for leaf rules.</p>
     * 
     * <strong>example:</strong>
     * <p>mac</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The matching operator. Required for leaf rules.</p>
     * 
     * <strong>example:</strong>
     * <p>equal</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The rule subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RuleSubType")
    public String ruleSubType;

    /**
     * <p>The rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>device_info</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The list of matching rules. At least one rule must be included.</p>
     */
    @NameInMap("Rules")
    public java.util.List<Rule> rules;

    /**
     * <p>The set of values to match. Required for leaf rules and cannot be empty.</p>
     */
    @NameInMap("Values")
    public java.util.List<String> values;

    public static Rule build(java.util.Map<String, ?> map) throws Exception {
        Rule self = new Rule();
        return TeaModel.build(map, self);
    }

    public Rule setCombinator(String combinator) {
        this.combinator = combinator;
        return this;
    }
    public String getCombinator() {
        return this.combinator;
    }

    public Rule setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Rule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Rule setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public Rule setRuleSubType(String ruleSubType) {
        this.ruleSubType = ruleSubType;
        return this;
    }
    public String getRuleSubType() {
        return this.ruleSubType;
    }

    public Rule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public Rule setRules(java.util.List<Rule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<Rule> getRules() {
        return this.rules;
    }

    public Rule setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
