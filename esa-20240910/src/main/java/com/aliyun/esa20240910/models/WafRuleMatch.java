// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRuleMatch extends TeaModel {
    /**
     * <p>The case-insensitive value setting.</p>
     */
    @NameInMap("ConvertToLower")
    public Boolean convertToLower;

    /**
     * <p>The logic list.</p>
     */
    @NameInMap("Criteria")
    public java.util.List<WafRuleMatch> criteria;

    /**
     * <p>The logical relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("Logic")
    public String logic;

    /**
     * <p>The match operator.</p>
     * 
     * <strong>example:</strong>
     * <p>eq</p>
     */
    @NameInMap("MatchOperator")
    public String matchOperator;

    /**
     * <p>The match field.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The match value.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("MatchValue")
    public Object matchValue;

    /**
     * <p>The negation of the match result.</p>
     */
    @NameInMap("Negate")
    public Boolean negate;

    /**
     * <p>The primary row key of the parent group. This is used for two-level drop-down positioning of enumeration subkey fields. For example, the Parent of ali.websdk.umid is ali.websdk.</p>
     * 
     * <strong>example:</strong>
     * <p>ali.websdk</p>
     */
    @NameInMap("Parent")
    public String parent;

    public static WafRuleMatch build(java.util.Map<String, ?> map) throws Exception {
        WafRuleMatch self = new WafRuleMatch();
        return TeaModel.build(map, self);
    }

    public WafRuleMatch setConvertToLower(Boolean convertToLower) {
        this.convertToLower = convertToLower;
        return this;
    }
    public Boolean getConvertToLower() {
        return this.convertToLower;
    }

    public WafRuleMatch setCriteria(java.util.List<WafRuleMatch> criteria) {
        this.criteria = criteria;
        return this;
    }
    public java.util.List<WafRuleMatch> getCriteria() {
        return this.criteria;
    }

    public WafRuleMatch setLogic(String logic) {
        this.logic = logic;
        return this;
    }
    public String getLogic() {
        return this.logic;
    }

    public WafRuleMatch setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public WafRuleMatch setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public WafRuleMatch setMatchValue(Object matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public Object getMatchValue() {
        return this.matchValue;
    }

    public WafRuleMatch setNegate(Boolean negate) {
        this.negate = negate;
        return this;
    }
    public Boolean getNegate() {
        return this.negate;
    }

    public WafRuleMatch setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

}
