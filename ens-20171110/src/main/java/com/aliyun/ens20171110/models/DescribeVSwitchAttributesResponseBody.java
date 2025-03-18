// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>253</p>
     */
    @NameInMap("AvailableIpAddressCount")
    public Long availableIpAddressCount;

    /**
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <strong>example:</strong>
     * <p>2019-06-01T00:00:00Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>This is my vswitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("HaVipIds")
    public DescribeVSwitchAttributesResponseBodyHaVipIds haVipIds;

    @NameInMap("InstanceIds")
    public DescribeVSwitchAttributesResponseBodyInstanceIds instanceIds;

    @NameInMap("LoadBalancerIds")
    public DescribeVSwitchAttributesResponseBodyLoadBalancerIds loadBalancerIds;

    @NameInMap("NatGatewayIds")
    public DescribeVSwitchAttributesResponseBodyNatGatewayIds natGatewayIds;

    /**
     * <strong>example:</strong>
     * <p>n-257gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    @NameInMap("NetworkInterfaceIds")
    public DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds networkInterfaceIds;

    /**
     * <strong>example:</strong>
     * <p>C0003****2A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>Test-switch</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    public static DescribeVSwitchAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchAttributesResponseBody self = new DescribeVSwitchAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchAttributesResponseBody setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public DescribeVSwitchAttributesResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeVSwitchAttributesResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeVSwitchAttributesResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVSwitchAttributesResponseBody setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeVSwitchAttributesResponseBody setHaVipIds(DescribeVSwitchAttributesResponseBodyHaVipIds haVipIds) {
        this.haVipIds = haVipIds;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyHaVipIds getHaVipIds() {
        return this.haVipIds;
    }

    public DescribeVSwitchAttributesResponseBody setInstanceIds(DescribeVSwitchAttributesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeVSwitchAttributesResponseBody setLoadBalancerIds(DescribeVSwitchAttributesResponseBodyLoadBalancerIds loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyLoadBalancerIds getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public DescribeVSwitchAttributesResponseBody setNatGatewayIds(DescribeVSwitchAttributesResponseBodyNatGatewayIds natGatewayIds) {
        this.natGatewayIds = natGatewayIds;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyNatGatewayIds getNatGatewayIds() {
        return this.natGatewayIds;
    }

    public DescribeVSwitchAttributesResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeVSwitchAttributesResponseBody setNetworkInterfaceIds(DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public DescribeVSwitchAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVSwitchAttributesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchAttributesResponseBody setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static class DescribeVSwitchAttributesResponseBodyHaVipIds extends TeaModel {
        @NameInMap("HaVipId")
        public java.util.List<String> haVipId;

        public static DescribeVSwitchAttributesResponseBodyHaVipIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyHaVipIds self = new DescribeVSwitchAttributesResponseBodyHaVipIds();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyHaVipIds setHaVipId(java.util.List<String> haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public java.util.List<String> getHaVipId() {
            return this.haVipId;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeVSwitchAttributesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyInstanceIds self = new DescribeVSwitchAttributesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyLoadBalancerIds extends TeaModel {
        @NameInMap("LoadBalancerId")
        public java.util.List<String> loadBalancerId;

        public static DescribeVSwitchAttributesResponseBodyLoadBalancerIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyLoadBalancerIds self = new DescribeVSwitchAttributesResponseBodyLoadBalancerIds();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyLoadBalancerIds setLoadBalancerId(java.util.List<String> loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public java.util.List<String> getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyNatGatewayIds extends TeaModel {
        @NameInMap("NatGatewayId")
        public java.util.List<String> natGatewayId;

        public static DescribeVSwitchAttributesResponseBodyNatGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyNatGatewayIds self = new DescribeVSwitchAttributesResponseBodyNatGatewayIds();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyNatGatewayIds setNatGatewayId(java.util.List<String> natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public java.util.List<String> getNatGatewayId() {
            return this.natGatewayId;
        }

    }

    public static class DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public java.util.List<String> networkInterfaceId;

        public static DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds self = new DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public DescribeVSwitchAttributesResponseBodyNetworkInterfaceIds setNetworkInterfaceId(java.util.List<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

}
