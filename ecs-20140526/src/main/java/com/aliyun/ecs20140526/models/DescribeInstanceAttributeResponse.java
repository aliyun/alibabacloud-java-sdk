// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("Cpu")
    @Validation(required = true)
    public Integer cpu;

    @NameInMap("Memory")
    @Validation(required = true)
    public Integer memory;

    @NameInMap("HostName")
    @Validation(required = true)
    public String hostName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("InternetChargeType")
    @Validation(required = true)
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    @Validation(required = true)
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    @Validation(required = true)
    public Integer internetMaxBandwidthOut;

    @NameInMap("VlanId")
    @Validation(required = true)
    public String vlanId;

    @NameInMap("SerialNumber")
    @Validation(required = true)
    public String serialNumber;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    public String instanceNetworkType;

    @NameInMap("IoOptimized")
    @Validation(required = true)
    public String ioOptimized;

    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    public String instanceChargeType;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("StoppedMode")
    @Validation(required = true)
    public String stoppedMode;

    @NameInMap("CreditSpecification")
    @Validation(required = true)
    public String creditSpecification;

    @NameInMap("OperationLocks")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseOperationLocks operationLocks;

    @NameInMap("VpcAttributes")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseVpcAttributes vpcAttributes;

    @NameInMap("EipAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseEipAddress eipAddress;

    @NameInMap("DedicatedHostAttribute")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseDedicatedHostAttribute dedicatedHostAttribute;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseSecurityGroupIds securityGroupIds;

    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponsePublicIpAddress publicIpAddress;

    @NameInMap("InnerIpAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseInnerIpAddress innerIpAddress;

    public static DescribeInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponse self = new DescribeInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAttributeResponse setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceAttributeResponse setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstanceAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceAttributeResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeInstanceAttributeResponse setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstanceAttributeResponse setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceAttributeResponse setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeInstanceAttributeResponse setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeInstanceAttributeResponse setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeInstanceAttributeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceAttributeResponse setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstanceAttributeResponse setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public DescribeInstanceAttributeResponse setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeInstanceAttributeResponse setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public DescribeInstanceAttributeResponse setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeInstanceAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeInstanceAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceAttributeResponse setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstanceAttributeResponse setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstanceAttributeResponse setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstanceAttributeResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeInstanceAttributeResponse setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public DescribeInstanceAttributeResponse setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public DescribeInstanceAttributeResponse setOperationLocks(DescribeInstanceAttributeResponseOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeInstanceAttributeResponseOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeInstanceAttributeResponse setVpcAttributes(DescribeInstanceAttributeResponseVpcAttributes vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
        return this;
    }
    public DescribeInstanceAttributeResponseVpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    public DescribeInstanceAttributeResponse setEipAddress(DescribeInstanceAttributeResponseEipAddress eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseEipAddress getEipAddress() {
        return this.eipAddress;
    }

    public DescribeInstanceAttributeResponse setDedicatedHostAttribute(DescribeInstanceAttributeResponseDedicatedHostAttribute dedicatedHostAttribute) {
        this.dedicatedHostAttribute = dedicatedHostAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseDedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    public DescribeInstanceAttributeResponse setSecurityGroupIds(DescribeInstanceAttributeResponseSecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeInstanceAttributeResponseSecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeInstanceAttributeResponse setPublicIpAddress(DescribeInstanceAttributeResponsePublicIpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponsePublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DescribeInstanceAttributeResponse setInnerIpAddress(DescribeInstanceAttributeResponseInnerIpAddress innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseInnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public static class DescribeInstanceAttributeResponseOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeInstanceAttributeResponseOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseOperationLocksLockReason self = new DescribeInstanceAttributeResponseOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAttributeResponseOperationLocksLockReason> lockReason;

        public static DescribeInstanceAttributeResponseOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseOperationLocks self = new DescribeInstanceAttributeResponseOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseOperationLocks setLockReason(java.util.List<DescribeInstanceAttributeResponseOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress self = new DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseVpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("NatIpAddress")
        @Validation(required = true)
        public String natIpAddress;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstanceAttributeResponseVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseVpcAttributes self = new DescribeInstanceAttributeResponseVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstanceAttributeResponseVpcAttributes setPrivateIpAddress(DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseEipAddress extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        public static DescribeInstanceAttributeResponseEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseEipAddress self = new DescribeInstanceAttributeResponseEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstanceAttributeResponseEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstanceAttributeResponseEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class DescribeInstanceAttributeResponseDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        @Validation(required = true)
        public String dedicatedHostName;

        public static DescribeInstanceAttributeResponseDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseDedicatedHostAttribute self = new DescribeInstanceAttributeResponseDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeInstanceAttributeResponseDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

    }

    public static class DescribeInstanceAttributeResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeInstanceAttributeResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseSecurityGroupIds self = new DescribeInstanceAttributeResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstanceAttributeResponsePublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponsePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponsePublicIpAddress self = new DescribeInstanceAttributeResponsePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponsePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseInnerIpAddress self = new DescribeInstanceAttributeResponseInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

}
