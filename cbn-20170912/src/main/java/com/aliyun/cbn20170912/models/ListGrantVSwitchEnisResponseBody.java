// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    /**
     * <p>The list of network interface controller (NIC) information.</p>
     */
    @NameInMap("GrantVSwitchEnis")
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis;

    /**
     * <p>The maximum number of entries returned for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token returned for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBFE1736-2F33-5309-9954-875B11E9519D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * <blockquote>
     * <p>Notice: When you use the MaxResults and NextToken parameters for paging, the returned Total parameter value is meaningless.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListGrantVSwitchEnisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchEnisResponseBody self = new ListGrantVSwitchEnisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchEnisResponseBody setGrantVSwitchEnis(java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis) {
        this.grantVSwitchEnis = grantVSwitchEnis;
        return this;
    }
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> getGrantVSwitchEnis() {
        return this.grantVSwitchEnis;
    }

    public ListGrantVSwitchEnisResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListGrantVSwitchEnisResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGrantVSwitchEnisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrantVSwitchEnisResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis extends TeaModel {
        /**
         * <p>The description of the elastic network interfaces (ENIs). This describes the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>created by CBN</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the elastic network interfaces (ENIs). This is the network interface controller (NIC) identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-p0w172vv82kxzb49****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of the elastic network interfaces (ENIs). This is the network interface controller (NIC) name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-eni-name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The primary private IP IPv4 address of the elastic network interfaces (ENIs). This is the network interface controller (NIC) primary private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>Indicates whether the elastic network interface (ENI) is created by a transit router for routing and forwarding purposes.</p>
         * <ul>
         * <li><strong>true</strong>: The ENI is created by a transit router.</li>
         * <li><strong>false</strong>: The ENI is not created by a transit router.</li>
         * </ul>
         * <p>Elastic network interfaces (ENIs) created by transit routers cannot serve as multicast sources or multicast members.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TransitRouterFlag")
        public Boolean transitRouterFlag;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC-connected instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w9alkte4w2htrqe****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis build(java.util.Map<String, ?> map) throws Exception {
            ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis self = new ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis();
            return TeaModel.build(map, self);
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setTransitRouterFlag(Boolean transitRouterFlag) {
            this.transitRouterFlag = transitRouterFlag;
            return this;
        }
        public Boolean getTransitRouterFlag() {
            return this.transitRouterFlag;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
