// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRuleMatch extends TeaModel {
    @NameInMap("ConvertToLower")
    public Boolean convertToLower;

    @NameInMap("Criteria")
    public java.util.List<WafRuleMatch> criteria;

    @NameInMap("Logic")
    public String logic;

    @NameInMap("MatchOperator")
    public String matchOperator;

    @NameInMap("MatchType")
    public String matchType;

    @NameInMap("MatchValue")
    public Object matchValue;

    @NameInMap("Negate")
    public Boolean negate;

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

}
