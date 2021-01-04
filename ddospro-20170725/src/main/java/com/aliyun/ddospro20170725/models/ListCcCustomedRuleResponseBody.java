// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ListCcCustomedRuleResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RuleList")
    public ListCcCustomedRuleResponseBodyRuleList ruleList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCcCustomedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCcCustomedRuleResponseBody self = new ListCcCustomedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCcCustomedRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCcCustomedRuleResponseBody setRuleList(ListCcCustomedRuleResponseBodyRuleList ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public ListCcCustomedRuleResponseBodyRuleList getRuleList() {
        return this.ruleList;
    }

    public ListCcCustomedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCcCustomedRuleResponseBodyRuleListRule extends TeaModel {
        @NameInMap("BlockingTime")
        public Integer blockingTime;

        @NameInMap("BlockingType")
        public String blockingType;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("VisitCount")
        public Integer visitCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("MatchingRule")
        public String matchingRule;

        public static ListCcCustomedRuleResponseBodyRuleListRule build(java.util.Map<String, ?> map) throws Exception {
            ListCcCustomedRuleResponseBodyRuleListRule self = new ListCcCustomedRuleResponseBodyRuleListRule();
            return TeaModel.build(map, self);
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setBlockingTime(Integer blockingTime) {
            this.blockingTime = blockingTime;
            return this;
        }
        public Integer getBlockingTime() {
            return this.blockingTime;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setBlockingType(String blockingType) {
            this.blockingType = blockingType;
            return this;
        }
        public String getBlockingType() {
            return this.blockingType;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setVisitCount(Integer visitCount) {
            this.visitCount = visitCount;
            return this;
        }
        public Integer getVisitCount() {
            return this.visitCount;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public ListCcCustomedRuleResponseBodyRuleListRule setMatchingRule(String matchingRule) {
            this.matchingRule = matchingRule;
            return this;
        }
        public String getMatchingRule() {
            return this.matchingRule;
        }

    }

    public static class ListCcCustomedRuleResponseBodyRuleList extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<ListCcCustomedRuleResponseBodyRuleListRule> rule;

        public static ListCcCustomedRuleResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListCcCustomedRuleResponseBodyRuleList self = new ListCcCustomedRuleResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListCcCustomedRuleResponseBodyRuleList setRule(java.util.List<ListCcCustomedRuleResponseBodyRuleListRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<ListCcCustomedRuleResponseBodyRuleListRule> getRule() {
            return this.rule;
        }

    }

}
