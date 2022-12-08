// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTrafficMarkingPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TrafficMarkingPolicies")
    public java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies> trafficMarkingPolicies;

    public static ListTrafficMarkingPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMarkingPoliciesResponseBody self = new ListTrafficMarkingPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrafficMarkingPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrafficMarkingPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMarkingPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrafficMarkingPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrafficMarkingPoliciesResponseBody setTrafficMarkingPolicies(java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies> trafficMarkingPolicies) {
        this.trafficMarkingPolicies = trafficMarkingPolicies;
        return this;
    }
    public java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies> getTrafficMarkingPolicies() {
        return this.trafficMarkingPolicies;
    }

    public static class ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules extends TeaModel {
        @NameInMap("DstCidr")
        public String dstCidr;

        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        @NameInMap("MatchDscp")
        public Integer matchDscp;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SrcCidr")
        public String srcCidr;

        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        @NameInMap("TrafficMatchRuleId")
        public String trafficMatchRuleId;

        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        @NameInMap("TrafficMatchRuleStatus")
        public String trafficMatchRuleStatus;

        public static ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules self = new ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setTrafficMatchRuleId(String trafficMatchRuleId) {
            this.trafficMatchRuleId = trafficMatchRuleId;
            return this;
        }
        public String getTrafficMatchRuleId() {
            return this.trafficMatchRuleId;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setTrafficMatchRuleStatus(String trafficMatchRuleStatus) {
            this.trafficMatchRuleStatus = trafficMatchRuleStatus;
            return this;
        }
        public String getTrafficMatchRuleStatus() {
            return this.trafficMatchRuleStatus;
        }

    }

    public static class ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies extends TeaModel {
        @NameInMap("MarkingDscp")
        public Integer markingDscp;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("TrafficMarkingPolicyDescription")
        public String trafficMarkingPolicyDescription;

        @NameInMap("TrafficMarkingPolicyId")
        public String trafficMarkingPolicyId;

        @NameInMap("TrafficMarkingPolicyName")
        public String trafficMarkingPolicyName;

        @NameInMap("TrafficMarkingPolicyStatus")
        public String trafficMarkingPolicyStatus;

        @NameInMap("TrafficMatchRules")
        public java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules> trafficMatchRules;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies self = new ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies();
            return TeaModel.build(map, self);
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setMarkingDscp(Integer markingDscp) {
            this.markingDscp = markingDscp;
            return this;
        }
        public Integer getMarkingDscp() {
            return this.markingDscp;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTrafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
            this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
            return this;
        }
        public String getTrafficMarkingPolicyDescription() {
            return this.trafficMarkingPolicyDescription;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }
        public String getTrafficMarkingPolicyId() {
            return this.trafficMarkingPolicyId;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTrafficMarkingPolicyName(String trafficMarkingPolicyName) {
            this.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }
        public String getTrafficMarkingPolicyName() {
            return this.trafficMarkingPolicyName;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTrafficMarkingPolicyStatus(String trafficMarkingPolicyStatus) {
            this.trafficMarkingPolicyStatus = trafficMarkingPolicyStatus;
            return this;
        }
        public String getTrafficMarkingPolicyStatus() {
            return this.trafficMarkingPolicyStatus;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTrafficMatchRules(java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules> trafficMatchRules) {
            this.trafficMatchRules = trafficMatchRules;
            return this;
        }
        public java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules> getTrafficMatchRules() {
            return this.trafficMatchRules;
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPolicies setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
