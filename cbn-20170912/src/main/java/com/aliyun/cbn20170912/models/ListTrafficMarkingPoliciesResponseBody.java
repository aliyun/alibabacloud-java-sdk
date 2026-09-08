// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTrafficMarkingPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>699989E4-64A0-5F78-8B93-CDB32D98971F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of traffic marking policies.</p>
     */
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
        /**
         * <p>The address type. Valid values: IPv4, IPv6, or empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.120.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range to be matched by the traffic classification rule.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The DSCP value of the traffic packet.</p>
         * <blockquote>
         * <p>If the <strong>MatchDscp</strong> value is -1, any DSCP value is matched.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <blockquote>
         * <p>The traffic marking policy supports matching multiple protocol types. For details about each protocol type, refer to the relevant documentation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range to be matched by the traffic classification rule.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The ID of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-rule-fa9kgq1e90rmhc****</p>
         */
        @NameInMap("TrafficMatchRuleId")
        public String trafficMatchRuleId;

        /**
         * <p>The name of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        /**
         * <p>The status of the traffic classification rule.</p>
         * <ul>
         * <li><strong>Creating</strong>: The rule is being created.</li>
         * <li><strong>Active</strong>: The rule is active.</li>
         * <li><strong>Deleting</strong>: The rule is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("TrafficMatchRuleStatus")
        public String trafficMatchRuleStatus;

        public static ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules self = new ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
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
        /**
         * <p>The DSCP value of the traffic marking policy.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MarkingDscp")
        public Integer markingDscp;

        /**
         * <p>The priority of the traffic marking policy.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The description of the traffic marking policy.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficMarkingPolicyDescription")
        public String trafficMarkingPolicyDescription;

        /**
         * <p>The ID of the traffic marking policy.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-iz5egnyitxiroq****</p>
         */
        @NameInMap("TrafficMarkingPolicyId")
        public String trafficMarkingPolicyId;

        /**
         * <p>The name of the traffic marking policy.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficMarkingPolicyName")
        public String trafficMarkingPolicyName;

        /**
         * <p>The status of the traffic marking policy.</p>
         * <ul>
         * <li><strong>Creating</strong>: The policy is being created.</li>
         * <li><strong>Active</strong>: The policy is active.</li>
         * <li><strong>Modifying</strong>: The policy is being modified.</li>
         * <li><strong>Deleting</strong>: The policy is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("TrafficMarkingPolicyStatus")
        public String trafficMarkingPolicyStatus;

        /**
         * <p>The list of traffic classification rules.</p>
         */
        @NameInMap("TrafficMatchRules")
        public java.util.List<ListTrafficMarkingPoliciesResponseBodyTrafficMarkingPoliciesTrafficMatchRules> trafficMatchRules;

        /**
         * <p>The ID of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-ccni***</p>
         */
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
