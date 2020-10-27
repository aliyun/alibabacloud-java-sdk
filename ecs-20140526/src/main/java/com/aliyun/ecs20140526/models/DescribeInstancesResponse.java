// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeInstancesResponseInstances instances;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponse setInstances(DescribeInstancesResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseInstances getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("MacAddress")
        @Validation(required = true)
        public String macAddress;

        @NameInMap("PrimaryIpAddress")
        @Validation(required = true)
        public String primaryIpAddress;

        public static DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface self = new DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeInstancesResponseInstancesInstanceNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceNetworkInterfaces self = new DescribeInstancesResponseInstancesInstanceNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceNetworkInterfaces setNetworkInterface(java.util.List<DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("LockMsg")
        @Validation(required = true)
        public String lockMsg;

        public static DescribeInstancesResponseInstancesInstanceOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceOperationLocksLockReason self = new DescribeInstancesResponseInstancesInstanceOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeInstancesResponseInstancesInstanceOperationLocksLockReason setLockMsg(String lockMsg) {
            this.lockMsg = lockMsg;
            return this;
        }
        public String getLockMsg() {
            return this.lockMsg;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceOperationLocksLockReason> lockReason;

        public static DescribeInstancesResponseInstancesInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceOperationLocks self = new DescribeInstancesResponseInstancesInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceOperationLocks setLockReason(java.util.List<DescribeInstancesResponseInstancesInstanceOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstanceOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeInstancesResponseInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceTagsTag self = new DescribeInstancesResponseInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInstancesResponseInstancesInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceTagsTag> tag;

        public static DescribeInstancesResponseInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceTags self = new DescribeInstancesResponseInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceTags setTag(java.util.List<DescribeInstancesResponseInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress self = new DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceVpcAttributes extends TeaModel {
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
        public DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstancesResponseInstancesInstanceVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceVpcAttributes self = new DescribeInstancesResponseInstancesInstanceVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseInstancesInstanceVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseInstancesInstanceVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstancesResponseInstancesInstanceVpcAttributes setPrivateIpAddress(DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceEipAddress extends TeaModel {
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

        @NameInMap("IsSupportUnassociate")
        @Validation(required = true)
        public Boolean isSupportUnassociate;

        public static DescribeInstancesResponseInstancesInstanceEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceEipAddress self = new DescribeInstancesResponseInstancesInstanceEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstancesResponseInstancesInstanceEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstancesResponseInstancesInstanceEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstancesResponseInstancesInstanceEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseInstancesInstanceEipAddress setIsSupportUnassociate(Boolean isSupportUnassociate) {
            this.isSupportUnassociate = isSupportUnassociate;
            return this;
        }
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        @Validation(required = true)
        public String dedicatedHostName;

        @NameInMap("DedicatedHostClusterId")
        @Validation(required = true)
        public String dedicatedHostClusterId;

        public static DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute self = new DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr extends TeaModel {
        @NameInMap("CapacityReservationId")
        @Validation(required = true)
        public String capacityReservationId;

        @NameInMap("CapacityReservationPreference")
        @Validation(required = true)
        public String capacityReservationPreference;

        public static DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr self = new DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr setCapacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        public DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr setCapacityReservationPreference(String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute extends TeaModel {
        @NameInMap("Tenancy")
        @Validation(required = true)
        public String tenancy;

        @NameInMap("Affinity")
        @Validation(required = true)
        public String affinity;

        public static DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute self = new DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

        public DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceCpuOptions extends TeaModel {
        @NameInMap("CoreCount")
        @Validation(required = true)
        public Integer coreCount;

        @NameInMap("ThreadsPerCore")
        @Validation(required = true)
        public Integer threadsPerCore;

        @NameInMap("Numa")
        @Validation(required = true)
        public String numa;

        public static DescribeInstancesResponseInstancesInstanceCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceCpuOptions self = new DescribeInstancesResponseInstancesInstanceCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceCpuOptions setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Integer getCoreCount() {
            return this.coreCount;
        }

        public DescribeInstancesResponseInstancesInstanceCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public DescribeInstancesResponseInstancesInstanceCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceMetadataOptions extends TeaModel {
        @NameInMap("HttpEndpoint")
        @Validation(required = true)
        public String httpEndpoint;

        @NameInMap("HttpTokens")
        @Validation(required = true)
        public String httpTokens;

        @NameInMap("HttpPutResponseHopLimit")
        @Validation(required = true)
        public Integer httpPutResponseHopLimit;

        public static DescribeInstancesResponseInstancesInstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceMetadataOptions self = new DescribeInstancesResponseInstancesInstanceMetadataOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceMetadataOptions setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeInstancesResponseInstancesInstanceMetadataOptions setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
        }

        public DescribeInstancesResponseInstancesInstanceMetadataOptions setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceSecurityGroupIds extends TeaModel {
        // SecurityGroupId
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePublicIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePublicIpAddress self = new DescribeInstancesResponseInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceInnerIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceRdmaIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceRdmaIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceRdmaIpAddress self = new DescribeInstancesResponseInstancesInstanceRdmaIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceRdmaIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("OSName")
        @Validation(required = true)
        public String OSName;

        @NameInMap("OSNameEn")
        @Validation(required = true)
        public String OSNameEn;

        @NameInMap("OSType")
        @Validation(required = true)
        public String OSType;

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

        @NameInMap("DeploymentSetId")
        @Validation(required = true)
        public String deploymentSetId;

        @NameInMap("DeploymentSetGroupNo")
        @Validation(required = true)
        public Integer deploymentSetGroupNo;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

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

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("SaleCycle")
        @Validation(required = true)
        public String saleCycle;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("AutoReleaseTime")
        @Validation(required = true)
        public String autoReleaseTime;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public Boolean ioOptimized;

        @NameInMap("DeviceAvailable")
        @Validation(required = true)
        public Boolean deviceAvailable;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        @Validation(required = true)
        public Integer localStorageAmount;

        @NameInMap("GPUAmount")
        @Validation(required = true)
        public Integer GPUAmount;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("SpotPriceLimit")
        @Validation(required = true)
        public Float spotPriceLimit;

        @NameInMap("SpotDuration")
        @Validation(required = true)
        public Integer spotDuration;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("KeyPairName")
        @Validation(required = true)
        public String keyPairName;

        @NameInMap("Recyclable")
        @Validation(required = true)
        public Boolean recyclable;

        @NameInMap("HpcClusterId")
        @Validation(required = true)
        public String hpcClusterId;

        @NameInMap("StoppedMode")
        @Validation(required = true)
        public String stoppedMode;

        @NameInMap("CreditSpecification")
        @Validation(required = true)
        public String creditSpecification;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("NetworkInterfaces")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceNetworkInterfaces networkInterfaces;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceOperationLocks operationLocks;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceTags tags;

        @NameInMap("VpcAttributes")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceVpcAttributes vpcAttributes;

        @NameInMap("EipAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceEipAddress eipAddress;

        @NameInMap("DedicatedHostAttribute")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute;

        @NameInMap("EcsCapacityReservationAttr")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr;

        @NameInMap("DedicatedInstanceAttribute")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute;

        @NameInMap("CpuOptions")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceCpuOptions cpuOptions;

        @NameInMap("MetadataOptions")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceMetadataOptions metadataOptions;

        @NameInMap("SecurityGroupIds")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstancePublicIpAddress publicIpAddress;

        @NameInMap("InnerIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceInnerIpAddress innerIpAddress;

        @NameInMap("RdmaIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceRdmaIpAddress rdmaIpAddress;

        public static DescribeInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstance self = new DescribeInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseInstancesInstance setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeInstancesResponseInstancesInstance setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeInstancesResponseInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstancesResponseInstancesInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseInstancesInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseInstancesInstance setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeInstancesResponseInstancesInstance setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        public DescribeInstancesResponseInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseInstancesInstance setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeInstancesResponseInstancesInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseInstancesInstance setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseInstancesInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseInstancesInstance setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribeInstancesResponseInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseInstancesInstance setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeInstancesResponseInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseInstancesInstance setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeInstancesResponseInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeInstancesResponseInstancesInstance setDeviceAvailable(Boolean deviceAvailable) {
            this.deviceAvailable = deviceAvailable;
            return this;
        }
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstancesResponseInstancesInstance setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstancesResponseInstancesInstance setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstancesResponseInstancesInstance setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstancesResponseInstancesInstance setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstancesResponseInstancesInstance setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeInstancesResponseInstancesInstance setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeInstancesResponseInstancesInstance setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeInstancesResponseInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseInstancesInstance setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeInstancesResponseInstancesInstance setRecyclable(Boolean recyclable) {
            this.recyclable = recyclable;
            return this;
        }
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        public DescribeInstancesResponseInstancesInstance setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeInstancesResponseInstancesInstance setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseInstancesInstance setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeInstancesResponseInstancesInstance setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeInstancesResponseInstancesInstance setNetworkInterfaces(DescribeInstancesResponseInstancesInstanceNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

        public DescribeInstancesResponseInstancesInstance setOperationLocks(DescribeInstancesResponseInstancesInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeInstancesResponseInstancesInstance setTags(DescribeInstancesResponseInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseInstancesInstance setVpcAttributes(DescribeInstancesResponseInstancesInstanceVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public DescribeInstancesResponseInstancesInstance setEipAddress(DescribeInstancesResponseInstancesInstanceEipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceEipAddress getEipAddress() {
            return this.eipAddress;
        }

        public DescribeInstancesResponseInstancesInstance setDedicatedHostAttribute(DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        public DescribeInstancesResponseInstancesInstance setEcsCapacityReservationAttr(DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr) {
            this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        public DescribeInstancesResponseInstancesInstance setDedicatedInstanceAttribute(DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute) {
            this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        public DescribeInstancesResponseInstancesInstance setCpuOptions(DescribeInstancesResponseInstancesInstanceCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public DescribeInstancesResponseInstancesInstance setMetadataOptions(DescribeInstancesResponseInstancesInstanceMetadataOptions metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceMetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        public DescribeInstancesResponseInstancesInstance setSecurityGroupIds(DescribeInstancesResponseInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseInstancesInstance setPublicIpAddress(DescribeInstancesResponseInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseInstancesInstance setInnerIpAddress(DescribeInstancesResponseInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseInstancesInstance setRdmaIpAddress(DescribeInstancesResponseInstancesInstanceRdmaIpAddress rdmaIpAddress) {
            this.rdmaIpAddress = rdmaIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceRdmaIpAddress getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstance> instance;

        public static DescribeInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstances self = new DescribeInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstances setInstance(java.util.List<DescribeInstancesResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
