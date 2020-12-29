// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("PublicIpAddress")
    public DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress;

    @NameInMap("InnerIpAddress")
    public DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("EipAddress")
    public DescribeInstanceAttributeResponseBodyEipAddress eipAddress;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("VlanId")
    public String vlanId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Status")
    public String status;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StoppedMode")
    public String stoppedMode;

    @NameInMap("DedicatedHostAttribute")
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute;

    @NameInMap("SecurityGroupIds")
    public DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds;

    @NameInMap("VpcAttributes")
    public DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes;

    @NameInMap("OperationLocks")
    public DescribeInstanceAttributeResponseBodyOperationLocks operationLocks;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceAttributeResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeInstanceAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstanceAttributeResponseBody setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeInstanceAttributeResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstanceAttributeResponseBody setPublicIpAddress(DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyPublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setInnerIpAddress(DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeInstanceAttributeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstanceAttributeResponseBody setEipAddress(DescribeInstanceAttributeResponseBodyEipAddress eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyEipAddress getEipAddress() {
        return this.eipAddress;
    }

    public DescribeInstanceAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceAttributeResponseBody setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public DescribeInstanceAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceAttributeResponseBody setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeInstanceAttributeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAttributeResponseBody setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public DescribeInstanceAttributeResponseBody setDedicatedHostAttribute(DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute) {
        this.dedicatedHostAttribute = dedicatedHostAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    public DescribeInstanceAttributeResponseBody setSecurityGroupIds(DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeInstanceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeInstanceAttributeResponseBody setVpcAttributes(DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyVpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    public DescribeInstanceAttributeResponseBody setOperationLocks(DescribeInstanceAttributeResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeInstanceAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeInstanceAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public DescribeInstanceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceAttributeResponseBody setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public static class DescribeInstanceAttributeResponseBodyPublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyPublicIpAddress self = new DescribeInstanceAttributeResponseBodyPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyPublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInnerIpAddress self = new DescribeInstanceAttributeResponseBodyInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyEipAddress extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        public static DescribeInstanceAttributeResponseBodyEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyEipAddress self = new DescribeInstanceAttributeResponseBodyEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static DescribeInstanceAttributeResponseBodyDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyDedicatedHostAttribute self = new DescribeInstanceAttributeResponseBodyDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class DescribeInstanceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstanceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodySecurityGroupIds self = new DescribeInstanceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress self = new DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("PrivateIpAddress")
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstanceAttributeResponseBodyVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributes self = new DescribeInstanceAttributeResponseBodyVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setPrivateIpAddress(DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocksLockReason self = new DescribeInstanceAttributeResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocks self = new DescribeInstanceAttributeResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocks setLockReason(java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

}
