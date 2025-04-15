// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    /**
     * <p>The details of the NAT gateways.</p>
     */
    @NameInMap("NatGateways")
    public java.util.List<DescribeNatGatewaysResponseBodyNatGateways> natGateways;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2818A8F4-5E2B-5611-8732-5ACF7B677059</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of NAT gateways that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNatGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponseBody self = new DescribeNatGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponseBody setNatGateways(java.util.List<DescribeNatGatewaysResponseBodyNatGateways> natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public java.util.List<DescribeNatGatewaysResponseBodyNatGateways> getNatGateways() {
        return this.natGateways;
    }

    public DescribeNatGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysIpLists extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-50g****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The IP address of the EIP associated with the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>8.XX.XX.162</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The association between the EIP and the Internet NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>UsedByForwardTable</strong>: The EIP is specified in a DNAT entry.</li>
         * <li><strong>UsedBySnatTable</strong>: The EIP is specified in an SNAT entry.</li>
         * <li><strong>UsedByForwardSnatTable</strong>: The EIP is specified in both an SNAT entry and a DNAT entry.</li>
         * <li><strong>Idle</strong>: The EIP is not specified in a DNAT or SNAT entry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Idle</p>
         */
        @NameInMap("UsingStatus")
        public String usingStatus;

        public static DescribeNatGatewaysResponseBodyNatGatewaysIpLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysIpLists self = new DescribeNatGatewaysResponseBodyNatGatewaysIpLists();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysIpLists setUsingStatus(String usingStatus) {
            this.usingStatus = usingStatus;
            return this;
        }
        public String getUsingStatus() {
            return this.usingStatus;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysTags extends TeaModel {
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

        public static DescribeNatGatewaysResponseBodyNatGatewaysTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysTags self = new DescribeNatGatewaysResponseBodyNatGatewaysTags();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        @Deprecated
        public DescribeNatGatewaysResponseBodyNatGatewaysTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        @Deprecated
        public DescribeNatGatewaysResponseBodyNatGatewaysTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGateways extends TeaModel {
        /**
         * <p>The time when the NAT gateway was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-22T07:03:32Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xiangyang-5</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The list of elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.</p>
         */
        @NameInMap("IpLists")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> ipLists;

        /**
         * <p>The name of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5s2ml1olj0kzaws9n1yrj****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The type of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>enat.default</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the SNAT entry.</p>
         * <ul>
         * <li>Pending: The SNAT entry is being created or modified.</li>
         * <li>Available: The SNAT entry is available.</li>
         * <li>Deleting: The SNAT entry is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysTags> tags;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5szpp1os9m55myirbflfw****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeNatGatewaysResponseBodyNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGateways self = new DescribeNatGatewaysResponseBodyNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGateways setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setIpLists(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> ipLists) {
            this.ipLists = ipLists;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysIpLists> getIpLists() {
            return this.ipLists;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setTags(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysTags> getTags() {
            return this.tags;
        }

        public DescribeNatGatewaysResponseBodyNatGateways setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
