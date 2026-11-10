// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyBasedRoutesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
     * <li>If <strong>NextToken</strong> returns a value, the value is the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of policy-based route rules.</p>
     */
    @NameInMap("PolicyBasedRoutes")
    public java.util.List<DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes> policyBasedRoutes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTransitRouterPolicyBasedRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyBasedRoutesResponseBody self = new DescribeTransitRouterPolicyBasedRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyBasedRoutesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponseBody setPolicyBasedRoutes(java.util.List<DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes> policyBasedRoutes) {
        this.policyBasedRoutes = policyBasedRoutes;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes> getPolicyBasedRoutes() {
        return this.policyBasedRoutes;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouterPolicyBasedRoutesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes extends TeaModel {
        /**
         * <p>The address family. Valid values:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The description of the policy-based route table.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Matches traffic whose port numbers fall within the destination port range. If this parameter is not specified, traffic to any destination port is matched.</p>
         * <p>The port range format is described as follows:</p>
         * <ul>
         * <li>80: port 80.</li>
         * <li>80/80: port 80.</li>
         * <li>1/200: ports 1 to 200.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("DestPortRange")
        public String destPortRange;

        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.185.33.0/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value of the traffic packets to match. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The DSCP value format is described as follows:</p>
         * <ul>
         * <li>1: matches traffic with a DSCP value of 1.</li>
         * <li>1/10: matches traffic with DSCP values from 1 to 10.</li>
         * <li>-1/-1: matches traffic with any DSCP value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1/10</p>
         */
        @NameInMap("Dscp")
        public String dscp;

        /**
         * <p>The name of the policy-based route rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The instance ID of the policy-based routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>pbr-123qwead</p>
         */
        @NameInMap("PolicyBasedRouteId")
        public String policyBasedRouteId;

        /**
         * <p>The instance ID of the policy-based routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-123adsfzc</p>
         */
        @NameInMap("PolicyTableId")
        public String policyTableId;

        /**
         * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <p>The priority of each policy-based route in a policy-based route table of a transit router must be unique. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type of the traffic packets.</p>
         * <p>Traffic classification rules support matching traffic of various protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>The source port. Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Matches traffic whose port numbers fall within the source port range. If this parameter is not specified, traffic from any source port is matched.</p>
         * <p>The port range format is described as follows:</p>
         * <ul>
         * <li>80: port 80.</li>
         * <li>80/80: port 80.</li>
         * <li>1/200: ports 1 to 200.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The status of the policy-based route. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The policy-based route is being created.</li>
         * <li><strong>Active</strong>: The policy-based route is available.</li>
         * <li><strong>Deleting</strong>: The policy-based route is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The destination route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-123adf</p>
         */
        @NameInMap("TargetRouteTableId")
        public String targetRouteTableId;

        public static DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes self = new DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setDestPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }
        public String getDestPortRange() {
            return this.destPortRange;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setDscp(String dscp) {
            this.dscp = dscp;
            return this;
        }
        public String getDscp() {
            return this.dscp;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setPolicyBasedRouteId(String policyBasedRouteId) {
            this.policyBasedRouteId = policyBasedRouteId;
            return this;
        }
        public String getPolicyBasedRouteId() {
            return this.policyBasedRouteId;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setPolicyTableId(String policyTableId) {
            this.policyTableId = policyTableId;
            return this;
        }
        public String getPolicyTableId() {
            return this.policyTableId;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTransitRouterPolicyBasedRoutesResponseBodyPolicyBasedRoutes setTargetRouteTableId(String targetRouteTableId) {
            this.targetRouteTableId = targetRouteTableId;
            return this;
        }
        public String getTargetRouteTableId() {
            return this.targetRouteTableId;
        }

    }

}
