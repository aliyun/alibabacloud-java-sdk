// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRuleMatch2 extends TeaModel {
    /**
     * <p>Transforms input to lowercase to ensure case-insensitivity.</p>
     */
    @NameInMap("ConvertToLower")
    public Boolean convertToLower;

    /**
     * <p>The details of logical databases.</p>
     */
    @NameInMap("Criteria")
    public java.util.List<WafRuleMatch2Criteria> criteria;

    /**
     * <p>The logical judgment.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("Logic")
    public String logic;

    /**
     * <p>The matching operator.</p>
     * 
     * <strong>example:</strong>
     * <p>eq</p>
     */
    @NameInMap("MatchOperator")
    public String matchOperator;

    /**
     * <p>The matching type.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The value of the matching condition.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("MatchValue")
    public Object matchValue;

    /**
     * <p>Converts a value or condition to its opposite.</p>
     */
    @NameInMap("Negate")
    public Boolean negate;

    public static WafRuleMatch2 build(java.util.Map<String, ?> map) throws Exception {
        WafRuleMatch2 self = new WafRuleMatch2();
        return TeaModel.build(map, self);
    }

    public WafRuleMatch2 setConvertToLower(Boolean convertToLower) {
        this.convertToLower = convertToLower;
        return this;
    }
    public Boolean getConvertToLower() {
        return this.convertToLower;
    }

    public WafRuleMatch2 setCriteria(java.util.List<WafRuleMatch2Criteria> criteria) {
        this.criteria = criteria;
        return this;
    }
    public java.util.List<WafRuleMatch2Criteria> getCriteria() {
        return this.criteria;
    }

    public WafRuleMatch2 setLogic(String logic) {
        this.logic = logic;
        return this;
    }
    public String getLogic() {
        return this.logic;
    }

    public WafRuleMatch2 setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }
    public String getMatchOperator() {
        return this.matchOperator;
    }

    public WafRuleMatch2 setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public WafRuleMatch2 setMatchValue(Object matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public Object getMatchValue() {
        return this.matchValue;
    }

    public WafRuleMatch2 setNegate(Boolean negate) {
        this.negate = negate;
        return this;
    }
    public Boolean getNegate() {
        return this.negate;
    }

    public static class WafRuleMatch2CriteriaCriteriaCriteria extends TeaModel {
        /**
         * <p>Transforms input to lowercase to ensure case-insensitivity.</p>
         */
        @NameInMap("ConvertToLower")
        public Boolean convertToLower;

        /**
         * <p>The matching operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("MatchOperator")
        public String matchOperator;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("MatchValue")
        public Object matchValue;

        /**
         * <p>Converts a value or condition to its opposite.</p>
         */
        @NameInMap("Negate")
        public Boolean negate;

        public static WafRuleMatch2CriteriaCriteriaCriteria build(java.util.Map<String, ?> map) throws Exception {
            WafRuleMatch2CriteriaCriteriaCriteria self = new WafRuleMatch2CriteriaCriteriaCriteria();
            return TeaModel.build(map, self);
        }

        public WafRuleMatch2CriteriaCriteriaCriteria setConvertToLower(Boolean convertToLower) {
            this.convertToLower = convertToLower;
            return this;
        }
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        public WafRuleMatch2CriteriaCriteriaCriteria setMatchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }
        public String getMatchOperator() {
            return this.matchOperator;
        }

        public WafRuleMatch2CriteriaCriteriaCriteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public WafRuleMatch2CriteriaCriteriaCriteria setMatchValue(Object matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public Object getMatchValue() {
            return this.matchValue;
        }

        public WafRuleMatch2CriteriaCriteriaCriteria setNegate(Boolean negate) {
            this.negate = negate;
            return this;
        }
        public Boolean getNegate() {
            return this.negate;
        }

    }

    public static class WafRuleMatch2CriteriaCriteria extends TeaModel {
        /**
         * <p>Transforms input to lowercase to ensure case-insensitivity.</p>
         */
        @NameInMap("ConvertToLower")
        public Boolean convertToLower;

        /**
         * <p>The details of logical databases.</p>
         */
        @NameInMap("Criteria")
        public java.util.List<WafRuleMatch2CriteriaCriteriaCriteria> criteria;

        /**
         * <p>The logical judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("Logic")
        public String logic;

        /**
         * <p>The matching operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("MatchOperator")
        public String matchOperator;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("MatchValue")
        public Object matchValue;

        /**
         * <p>Converts a value or condition to its opposite.</p>
         */
        @NameInMap("Negate")
        public Boolean negate;

        public static WafRuleMatch2CriteriaCriteria build(java.util.Map<String, ?> map) throws Exception {
            WafRuleMatch2CriteriaCriteria self = new WafRuleMatch2CriteriaCriteria();
            return TeaModel.build(map, self);
        }

        public WafRuleMatch2CriteriaCriteria setConvertToLower(Boolean convertToLower) {
            this.convertToLower = convertToLower;
            return this;
        }
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        public WafRuleMatch2CriteriaCriteria setCriteria(java.util.List<WafRuleMatch2CriteriaCriteriaCriteria> criteria) {
            this.criteria = criteria;
            return this;
        }
        public java.util.List<WafRuleMatch2CriteriaCriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        public WafRuleMatch2CriteriaCriteria setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public WafRuleMatch2CriteriaCriteria setMatchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }
        public String getMatchOperator() {
            return this.matchOperator;
        }

        public WafRuleMatch2CriteriaCriteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public WafRuleMatch2CriteriaCriteria setMatchValue(Object matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public Object getMatchValue() {
            return this.matchValue;
        }

        public WafRuleMatch2CriteriaCriteria setNegate(Boolean negate) {
            this.negate = negate;
            return this;
        }
        public Boolean getNegate() {
            return this.negate;
        }

    }

    public static class WafRuleMatch2Criteria extends TeaModel {
        /**
         * <p>Transforms input to lowercase to ensure case-insensitivity.</p>
         */
        @NameInMap("ConvertToLower")
        public Boolean convertToLower;

        /**
         * <p>The details of logical databases.</p>
         */
        @NameInMap("Criteria")
        public java.util.List<WafRuleMatch2CriteriaCriteria> criteria;

        /**
         * <p>The logical judgment.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("Logic")
        public String logic;

        /**
         * <p>The matching operator.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("MatchOperator")
        public String matchOperator;

        /**
         * <p>The matching type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("MatchValue")
        public Object matchValue;

        /**
         * <p>Converts a value or condition to its opposite.</p>
         */
        @NameInMap("Negate")
        public Boolean negate;

        public static WafRuleMatch2Criteria build(java.util.Map<String, ?> map) throws Exception {
            WafRuleMatch2Criteria self = new WafRuleMatch2Criteria();
            return TeaModel.build(map, self);
        }

        public WafRuleMatch2Criteria setConvertToLower(Boolean convertToLower) {
            this.convertToLower = convertToLower;
            return this;
        }
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        public WafRuleMatch2Criteria setCriteria(java.util.List<WafRuleMatch2CriteriaCriteria> criteria) {
            this.criteria = criteria;
            return this;
        }
        public java.util.List<WafRuleMatch2CriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        public WafRuleMatch2Criteria setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public WafRuleMatch2Criteria setMatchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }
        public String getMatchOperator() {
            return this.matchOperator;
        }

        public WafRuleMatch2Criteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public WafRuleMatch2Criteria setMatchValue(Object matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public Object getMatchValue() {
            return this.matchValue;
        }

        public WafRuleMatch2Criteria setNegate(Boolean negate) {
            this.negate = negate;
            return this;
        }
        public Boolean getNegate() {
            return this.negate;
        }

    }

}
