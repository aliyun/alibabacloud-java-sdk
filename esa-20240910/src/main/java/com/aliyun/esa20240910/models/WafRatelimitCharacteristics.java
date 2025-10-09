// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafRatelimitCharacteristics extends TeaModel {
    @NameInMap("Criteria")
    public java.util.List<WafRatelimitCharacteristicsCriteria> criteria;

    @NameInMap("Logic")
    public String logic;

    @NameInMap("MatchType")
    public String matchType;

    public static WafRatelimitCharacteristics build(java.util.Map<String, ?> map) throws Exception {
        WafRatelimitCharacteristics self = new WafRatelimitCharacteristics();
        return TeaModel.build(map, self);
    }

    public WafRatelimitCharacteristics setCriteria(java.util.List<WafRatelimitCharacteristicsCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }
    public java.util.List<WafRatelimitCharacteristicsCriteria> getCriteria() {
        return this.criteria;
    }

    public WafRatelimitCharacteristics setLogic(String logic) {
        this.logic = logic;
        return this;
    }
    public String getLogic() {
        return this.logic;
    }

    public WafRatelimitCharacteristics setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public static class WafRatelimitCharacteristicsCriteriaCriteriaCriteria extends TeaModel {
        @NameInMap("MatchType")
        public String matchType;

        public static WafRatelimitCharacteristicsCriteriaCriteriaCriteria build(java.util.Map<String, ?> map) throws Exception {
            WafRatelimitCharacteristicsCriteriaCriteriaCriteria self = new WafRatelimitCharacteristicsCriteriaCriteriaCriteria();
            return TeaModel.build(map, self);
        }

        public WafRatelimitCharacteristicsCriteriaCriteriaCriteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

    }

    public static class WafRatelimitCharacteristicsCriteriaCriteria extends TeaModel {
        @NameInMap("Criteria")
        public java.util.List<WafRatelimitCharacteristicsCriteriaCriteriaCriteria> criteria;

        @NameInMap("Logic")
        public String logic;

        @NameInMap("MatchType")
        public String matchType;

        public static WafRatelimitCharacteristicsCriteriaCriteria build(java.util.Map<String, ?> map) throws Exception {
            WafRatelimitCharacteristicsCriteriaCriteria self = new WafRatelimitCharacteristicsCriteriaCriteria();
            return TeaModel.build(map, self);
        }

        public WafRatelimitCharacteristicsCriteriaCriteria setCriteria(java.util.List<WafRatelimitCharacteristicsCriteriaCriteriaCriteria> criteria) {
            this.criteria = criteria;
            return this;
        }
        public java.util.List<WafRatelimitCharacteristicsCriteriaCriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        public WafRatelimitCharacteristicsCriteriaCriteria setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public WafRatelimitCharacteristicsCriteriaCriteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

    }

    public static class WafRatelimitCharacteristicsCriteria extends TeaModel {
        @NameInMap("Criteria")
        public java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> criteria;

        @NameInMap("Logic")
        public String logic;

        @NameInMap("MatchType")
        public String matchType;

        public static WafRatelimitCharacteristicsCriteria build(java.util.Map<String, ?> map) throws Exception {
            WafRatelimitCharacteristicsCriteria self = new WafRatelimitCharacteristicsCriteria();
            return TeaModel.build(map, self);
        }

        public WafRatelimitCharacteristicsCriteria setCriteria(java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> criteria) {
            this.criteria = criteria;
            return this;
        }
        public java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        public WafRatelimitCharacteristicsCriteria setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

        public WafRatelimitCharacteristicsCriteria setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

    }

}
