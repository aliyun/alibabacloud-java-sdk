// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeInstancesResponseBodyInstancesDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static DescribeInstancesResponseBodyInstancesDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesDedicatedHostAttribute self = new DescribeInstancesResponseBodyInstancesDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeInstancesResponseBodyInstancesDedicatedHostAttribute setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeInstancesResponseBodyInstancesDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockMsg")
        public String lockMsg;

        public static DescribeInstancesResponseBodyInstancesOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesOperationLocks self = new DescribeInstancesResponseBodyInstancesOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeInstancesResponseBodyInstancesOperationLocks setLockMsg(String lockMsg) {
            this.lockMsg = lockMsg;
            return this;
        }
        public String getLockMsg() {
            return this.lockMsg;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesTags self = new DescribeInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeInstancesResponseBodyInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesMetadataOptions extends TeaModel {
        @NameInMap("HttpPutResponseHopLimit")
        public Integer httpPutResponseHopLimit;

        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        @NameInMap("HttpTokens")
        public String httpTokens;

        public static DescribeInstancesResponseBodyInstancesMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesMetadataOptions self = new DescribeInstancesResponseBodyInstancesMetadataOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesMetadataOptions setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        public DescribeInstancesResponseBodyInstancesMetadataOptions setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeInstancesResponseBodyInstancesMetadataOptions setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesEipAddress extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("IsSupportUnassociate")
        public Boolean isSupportUnassociate;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        public static DescribeInstancesResponseBodyInstancesEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesEipAddress self = new DescribeInstancesResponseBodyInstancesEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstancesResponseBodyInstancesEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstancesResponseBodyInstancesEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstancesResponseBodyInstancesEipAddress setIsSupportUnassociate(Boolean isSupportUnassociate) {
            this.isSupportUnassociate = isSupportUnassociate;
            return this;
        }
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

        public DescribeInstancesResponseBodyInstancesEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute extends TeaModel {
        @NameInMap("Affinity")
        public String affinity;

        @NameInMap("Tenancy")
        public String tenancy;

        public static DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute self = new DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesCpuOptions extends TeaModel {
        @NameInMap("Numa")
        public String numa;

        @NameInMap("CoreCount")
        public Integer coreCount;

        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static DescribeInstancesResponseBodyInstancesCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesCpuOptions self = new DescribeInstancesResponseBodyInstancesCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public DescribeInstancesResponseBodyInstancesCpuOptions setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Integer getCoreCount() {
            return this.coreCount;
        }

        public DescribeInstancesResponseBodyInstancesCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesVpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("PrivateIpAddress")
        public java.util.List<String> privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesVpcAttributes self = new DescribeInstancesResponseBodyInstancesVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesVpcAttributes setPrivateIpAddress(java.util.List<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public java.util.List<String> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr extends TeaModel {
        @NameInMap("CapacityReservationPreference")
        public String capacityReservationPreference;

        @NameInMap("CapacityReservationId")
        public String capacityReservationId;

        public static DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr self = new DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr setCapacityReservationPreference(String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

        public DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr setCapacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets self = new DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets self = new DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesNetworkInterfaces extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("Ipv6Sets")
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets> ipv6Sets;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("PrivateIpSets")
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets> privateIpSets;

        public static DescribeInstancesResponseBodyInstancesNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesNetworkInterfaces self = new DescribeInstancesResponseBodyInstancesNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setIpv6Sets(java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets> ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesIpv6Sets> getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesNetworkInterfaces setPrivateIpSets(java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets> privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfacesPrivateIpSets> getPrivateIpSets() {
            return this.privateIpSets;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("DedicatedHostAttribute")
        public DescribeInstancesResponseBodyInstancesDedicatedHostAttribute dedicatedHostAttribute;

        @NameInMap("OperationLocks")
        public java.util.List<DescribeInstancesResponseBodyInstancesOperationLocks> operationLocks;

        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> tags;

        @NameInMap("MetadataOptions")
        public DescribeInstancesResponseBodyInstancesMetadataOptions metadataOptions;

        @NameInMap("SaleCycle")
        public String saleCycle;

        @NameInMap("PublicIpAddress")
        public java.util.List<String> publicIpAddress;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("DeviceAvailable")
        public Boolean deviceAvailable;

        @NameInMap("EipAddress")
        public DescribeInstancesResponseBodyInstancesEipAddress eipAddress;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("SpotDuration")
        public Integer spotDuration;

        @NameInMap("OSNameEn")
        public String OSNameEn;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("DeploymentSetGroupNo")
        public Integer deploymentSetGroupNo;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DedicatedInstanceAttribute")
        public DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute dedicatedInstanceAttribute;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("InnerIpAddress")
        public java.util.List<String> innerIpAddress;

        @NameInMap("StoppedMode")
        public String stoppedMode;

        @NameInMap("GPUAmount")
        public Integer GPUAmount;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Recyclable")
        public Boolean recyclable;

        @NameInMap("CreditSpecification")
        public String creditSpecification;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Status")
        public String status;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("CpuOptions")
        public DescribeInstancesResponseBodyInstancesCpuOptions cpuOptions;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("Description")
        public String description;

        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("VlanId")
        public String vlanId;

        @NameInMap("VpcAttributes")
        public DescribeInstancesResponseBodyInstancesVpcAttributes vpcAttributes;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("EcsCapacityReservationAttr")
        public DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr ecsCapacityReservationAttr;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("RdmaIpAddress")
        public java.util.List<String> rdmaIpAddress;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("NetworkInterfaces")
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfaces> networkInterfaces;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyInstances setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeInstancesResponseBodyInstances setDedicatedHostAttribute(DescribeInstancesResponseBodyInstancesDedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesDedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        public DescribeInstancesResponseBodyInstances setOperationLocks(java.util.List<DescribeInstancesResponseBodyInstancesOperationLocks> operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesOperationLocks> getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeInstancesResponseBodyInstances setTags(java.util.List<DescribeInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstances setMetadataOptions(DescribeInstancesResponseBodyInstancesMetadataOptions metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesMetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        public DescribeInstancesResponseBodyInstances setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeInstancesResponseBodyInstances setPublicIpAddress(java.util.List<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<String> getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseBodyInstances setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeInstancesResponseBodyInstances setDeviceAvailable(Boolean deviceAvailable) {
            this.deviceAvailable = deviceAvailable;
            return this;
        }
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        public DescribeInstancesResponseBodyInstances setEipAddress(DescribeInstancesResponseBodyInstancesEipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesEipAddress getEipAddress() {
            return this.eipAddress;
        }

        public DescribeInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstances setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeInstancesResponseBodyInstances setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeInstancesResponseBodyInstances setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeInstancesResponseBodyInstances setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeInstancesResponseBodyInstances setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseBodyInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstances setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        public DescribeInstancesResponseBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstances setDedicatedInstanceAttribute(DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute dedicatedInstanceAttribute) {
            this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesDedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        public DescribeInstancesResponseBodyInstances setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstancesResponseBodyInstances setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeInstancesResponseBodyInstances setInnerIpAddress(java.util.List<String> innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public java.util.List<String> getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseBodyInstances setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseBodyInstances setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstancesResponseBodyInstances setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstances setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstances setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseBodyInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstancesResponseBodyInstances setRecyclable(Boolean recyclable) {
            this.recyclable = recyclable;
            return this;
        }
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        public DescribeInstancesResponseBodyInstances setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeInstancesResponseBodyInstances setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstances setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeInstancesResponseBodyInstances setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeInstancesResponseBodyInstances setCpuOptions(DescribeInstancesResponseBodyInstancesCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public DescribeInstancesResponseBodyInstances setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstances setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeInstancesResponseBodyInstances setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstances setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribeInstancesResponseBodyInstances setVpcAttributes(DescribeInstancesResponseBodyInstancesVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public DescribeInstancesResponseBodyInstances setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeInstancesResponseBodyInstances setEcsCapacityReservationAttr(DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr ecsCapacityReservationAttr) {
            this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesEcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        public DescribeInstancesResponseBodyInstances setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseBodyInstances setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseBodyInstances setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstances setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeInstancesResponseBodyInstances setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstances setRdmaIpAddress(java.util.List<String> rdmaIpAddress) {
            this.rdmaIpAddress = rdmaIpAddress;
            return this;
        }
        public java.util.List<String> getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

        public DescribeInstancesResponseBodyInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstances setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstancesResponseBodyInstances setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeInstancesResponseBodyInstances setNetworkInterfaces(java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfaces> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesNetworkInterfaces> getNetworkInterfaces() {
            return this.networkInterfaces;
        }

    }

}
