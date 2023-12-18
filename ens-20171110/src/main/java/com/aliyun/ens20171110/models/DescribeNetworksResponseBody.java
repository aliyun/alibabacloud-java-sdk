// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworksResponseBody extends TeaModel {
    /**
     * <p>The list of networks.</p>
     */
    @NameInMap("Networks")
    public DescribeNetworksResponseBodyNetworks networks;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the list.</p>
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
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The timestamp when the instance was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the network.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the edge node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the network access control list (ACL).</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The ID of the network.</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The name of the network.</p>
         */
        @NameInMap("NetworkName")
        public String networkName;

        /**
         * <p>The route table ID.</p>
         */
        @NameInMap("RouterTableId")
        public String routerTableId;

        /**
         * <p>The status of the network. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Available</p>
         */
        @NameInMap("Status")
        public String status;

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
