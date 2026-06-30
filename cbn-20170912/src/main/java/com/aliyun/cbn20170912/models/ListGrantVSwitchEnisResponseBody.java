// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponseBody extends TeaModel {
    /**
     * <p>A list of ENI information.</p>
     */
    @NameInMap("GrantVSwitchEnis")
    public java.util.List<ListGrantVSwitchEnisResponseBodyGrantVSwitchEnis> grantVSwitchEnis;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that is used for the next query.</p>
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
     * <p>The total number of entries.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is invalid if you use MaxResults and NextToken to perform a paged query.</p>
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
         * <p>The description of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>created by CBN</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-p0w172vv82kxzb49****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>my-eni-name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The primary private IPv4 address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>Indicates whether the ENI is created by a transit router.</p>
         * <ul>
         * <li><p><strong>true</strong>: The ENI is created by a transit router.</p>
         * </li>
         * <li><p><strong>false</strong>: The ENI is not created by a transit router.</p>
         * </li>
         * </ul>
         * <p>ENIs created by transit routers cannot be used as multicast sources or members.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TransitRouterFlag")
        public Boolean transitRouterFlag;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
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
