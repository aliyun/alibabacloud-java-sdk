// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworksResponseBody extends TeaModel {
    /**
     * <p>The VPCs.</p>
     */
    @NameInMap("Networks")
    public DescribeNetworksResponseBodyNetworks networks;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworksResponseBody self = new DescribeNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworksResponseBody setNetworks(DescribeNetworksResponseBodyNetworks networks) {
        this.networks = networks;
        return this;
    }
    public DescribeNetworksResponseBodyNetworks getNetworks() {
        return this.networks;
    }

    public DescribeNetworksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworksResponseBodyNetworksNetworkRouteTableIds extends TeaModel {
        @NameInMap("RouteTableId")
        public java.util.List<String> routeTableId;

        public static DescribeNetworksResponseBodyNetworksNetworkRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetworkRouteTableIds self = new DescribeNetworksResponseBodyNetworksNetworkRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetworkRouteTableIds setRouteTableId(java.util.List<String> routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public java.util.List<String> getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeNetworksResponseBodyNetworksNetworkTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("TagKey")
        @Deprecated
        public String tagKey;

        @NameInMap("TagValue")
        @Deprecated
        public String tagValue;

        @NameInMap("Value")
        public String value;

        public static DescribeNetworksResponseBodyNetworksNetworkTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetworkTagsTag self = new DescribeNetworksResponseBodyNetworksNetworkTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetworkTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        @Deprecated
        public DescribeNetworksResponseBodyNetworksNetworkTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        @Deprecated
        public DescribeNetworksResponseBodyNetworksNetworkTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeNetworksResponseBodyNetworksNetworkTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNetworksResponseBodyNetworksNetworkTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworksResponseBodyNetworksNetworkTagsTag> tag;

        public static DescribeNetworksResponseBodyNetworksNetworkTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetworkTags self = new DescribeNetworksResponseBodyNetworksNetworkTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetworkTags setTag(java.util.List<DescribeNetworksResponseBodyNetworksNetworkTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworksResponseBodyNetworksNetworkTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworksResponseBodyNetworksNetworkVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeNetworksResponseBodyNetworksNetworkVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetworkVSwitchIds self = new DescribeNetworksResponseBodyNetworksNetworkVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetworkVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeNetworksResponseBodyNetworksNetwork extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.xx.xx/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The timestamp when the instance was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-16T06:33:15Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the gateway route table associated with the IPv6 gateway.</p>
         * <blockquote>
         * <p> This parameter is available only when the IPv6 gateway is associated with a gateway route table.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rt-5*****tbs</p>
         */
        @NameInMap("GatewayRouteTableId")
        public String gatewayRouteTableId;

        /**
         * <p>The ID of the network access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spxscd****</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5***</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The name of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NetworkName")
        public String networkName;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>rt-5*****pks</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The IDs of the route tables.</p>
         */
        @NameInMap("RouteTableIds")
        public DescribeNetworksResponseBodyNetworksNetworkRouteTableIds routeTableIds;

        /**
         * <p>The route table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rtb-5**</p>
         */
        @NameInMap("RouterTableId")
        public String routerTableId;

        /**
         * <p>The status of the network. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Available</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeNetworksResponseBodyNetworksNetworkTags tags;

        /**
         * <p>The list of vSwitches in the network.</p>
         */
        @NameInMap("VSwitchIds")
        public DescribeNetworksResponseBodyNetworksNetworkVSwitchIds vSwitchIds;

        public static DescribeNetworksResponseBodyNetworksNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetwork self = new DescribeNetworksResponseBodyNetworksNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetwork setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setGatewayRouteTableId(String gatewayRouteTableId) {
            this.gatewayRouteTableId = gatewayRouteTableId;
            return this;
        }
        public String getGatewayRouteTableId() {
            return this.gatewayRouteTableId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setNetworkName(String networkName) {
            this.networkName = networkName;
            return this;
        }
        public String getNetworkName() {
            return this.networkName;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setRouteTableIds(DescribeNetworksResponseBodyNetworksNetworkRouteTableIds routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }
        public DescribeNetworksResponseBodyNetworksNetworkRouteTableIds getRouteTableIds() {
            return this.routeTableIds;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setRouterTableId(String routerTableId) {
            this.routerTableId = routerTableId;
            return this;
        }
        public String getRouterTableId() {
            return this.routerTableId;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setTags(DescribeNetworksResponseBodyNetworksNetworkTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNetworksResponseBodyNetworksNetworkTags getTags() {
            return this.tags;
        }

        public DescribeNetworksResponseBodyNetworksNetwork setVSwitchIds(DescribeNetworksResponseBodyNetworksNetworkVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeNetworksResponseBodyNetworksNetworkVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class DescribeNetworksResponseBodyNetworks extends TeaModel {
        @NameInMap("Network")
        public java.util.List<DescribeNetworksResponseBodyNetworksNetwork> network;

        public static DescribeNetworksResponseBodyNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworks self = new DescribeNetworksResponseBodyNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworks setNetwork(java.util.List<DescribeNetworksResponseBodyNetworksNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<DescribeNetworksResponseBodyNetworksNetwork> getNetwork() {
            return this.network;
        }

    }

}
