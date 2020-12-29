// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

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

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
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

    public static class DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute self = new DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockMsg")
        public String lockMsg;

        public static DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason self = new DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason setLockMsg(String lockMsg) {
            this.lockMsg = lockMsg;
            return this;
        }
        public String getLockMsg() {
            return this.lockMsg;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> lockReason;

        public static DescribeInstancesResponseBodyInstancesInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceOperationLocks self = new DescribeInstancesResponseBodyInstancesInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks setLockReason(java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeInstancesResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTagsTag self = new DescribeInstancesResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag;

        public static DescribeInstancesResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTags self = new DescribeInstancesResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTags setTag(java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceMetadataOptions extends TeaModel {
        @NameInMap("HttpPutResponseHopLimit")
        public Integer httpPutResponseHopLimit;

        @NameInMap("HttpEndpoint")
        public String httpEndpoint;

        @NameInMap("HttpTokens")
        public String httpTokens;

        public static DescribeInstancesResponseBodyInstancesInstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceMetadataOptions self = new DescribeInstancesResponseBodyInstancesInstanceMetadataOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Integer getHttpPutResponseHopLimit() {
            return this.httpPutResponseHopLimit;
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }
        public String getHttpEndpoint() {
            return this.httpEndpoint;
        }

        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions setHttpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }
        public String getHttpTokens() {
            return this.httpTokens;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceEipAddress extends TeaModel {
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

        public static DescribeInstancesResponseBodyInstancesInstanceEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceEipAddress self = new DescribeInstancesResponseBodyInstancesInstanceEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setIsSupportUnassociate(Boolean isSupportUnassociate) {
            this.isSupportUnassociate = isSupportUnassociate;
            return this;
        }
        public Boolean getIsSupportUnassociate() {
            return this.isSupportUnassociate;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute extends TeaModel {
        @NameInMap("Affinity")
        public String affinity;

        @NameInMap("Tenancy")
        public String tenancy;

        public static DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute self = new DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceCpuOptions extends TeaModel {
        @NameInMap("Numa")
        public String numa;

        @NameInMap("CoreCount")
        public Integer coreCount;

        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static DescribeInstancesResponseBodyInstancesInstanceCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceCpuOptions self = new DescribeInstancesResponseBodyInstancesInstanceCpuOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setCoreCount(Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Integer getCoreCount() {
            return this.coreCount;
        }

        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceVpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("PrivateIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceVpcAttributes self = new DescribeInstancesResponseBodyInstancesInstanceVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes setPrivateIpAddress(DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr extends TeaModel {
        @NameInMap("CapacityReservationPreference")
        public String capacityReservationPreference;

        @NameInMap("CapacityReservationId")
        public String capacityReservationId;

        public static DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr self = new DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr setCapacityReservationPreference(String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }
        public String getCapacityReservationPreference() {
            return this.capacityReservationPreference;
        }

        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr setCapacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> ipv6Set;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets setIpv6Set(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets setPrivateIpSet(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("Ipv6Sets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets ipv6Sets;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("PrivateIpSets")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets privateIpSets;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setIpv6Sets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfaceIpv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface setPrivateIpSets(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterfacePrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces self = new DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces setNetworkInterface(java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceNetworkInterfacesNetworkInterface> getNetworkInterface() {
            return this.networkInterface;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("DedicatedHostAttribute")
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute;

        @NameInMap("OperationLocks")
        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks operationLocks;

        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesInstanceTags tags;

        @NameInMap("MetadataOptions")
        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions metadataOptions;

        @NameInMap("SaleCycle")
        public String saleCycle;

        @NameInMap("PublicIpAddress")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("DeviceAvailable")
        public Boolean deviceAvailable;

        @NameInMap("EipAddress")
        public DescribeInstancesResponseBodyInstancesInstanceEipAddress eipAddress;

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
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        @NameInMap("InnerIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress;

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
        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions cpuOptions;

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
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("EcsCapacityReservationAttr")
        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("SecurityGroupIds")
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("RdmaIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress rdmaIpAddress;

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
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces networkInterfaces;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDedicatedHostAttribute(DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute) {
            this.dedicatedHostAttribute = dedicatedHostAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedHostAttribute getDedicatedHostAttribute() {
            return this.dedicatedHostAttribute;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOperationLocks(DescribeInstancesResponseBodyInstancesInstanceOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeInstancesResponseBodyInstancesInstance setTags(DescribeInstancesResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMetadataOptions(DescribeInstancesResponseBodyInstancesInstanceMetadataOptions metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceMetadataOptions getMetadataOptions() {
            return this.metadataOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddress(DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeviceAvailable(Boolean deviceAvailable) {
            this.deviceAvailable = deviceAvailable;
            return this;
        }
        public Boolean getDeviceAvailable() {
            return this.deviceAvailable;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEipAddress(DescribeInstancesResponseBodyInstancesInstanceEipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceEipAddress getEipAddress() {
            return this.eipAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
            this.deploymentSetGroupNo = deploymentSetGroupNo;
            return this;
        }
        public Integer getDeploymentSetGroupNo() {
            return this.deploymentSetGroupNo;
        }

        public DescribeInstancesResponseBodyInstancesInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDedicatedInstanceAttribute(DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute) {
            this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDedicatedInstanceAttribute getDedicatedInstanceAttribute() {
            return this.dedicatedInstanceAttribute;
        }

        public DescribeInstancesResponseBodyInstancesInstance setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeInstancesResponseBodyInstancesInstance setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInnerIpAddress(DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseBodyInstancesInstance setGPUAmount(Integer GPUAmount) {
            this.GPUAmount = GPUAmount;
            return this;
        }
        public Integer getGPUAmount() {
            return this.GPUAmount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRecyclable(Boolean recyclable) {
            this.recyclable = recyclable;
            return this;
        }
        public Boolean getRecyclable() {
            return this.recyclable;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpuOptions(DescribeInstancesResponseBodyInstancesInstanceCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public DescribeInstancesResponseBodyInstancesInstance setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setVpcAttributes(DescribeInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEcsCapacityReservationAttr(DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr) {
            this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceEcsCapacityReservationAttr getEcsCapacityReservationAttr() {
            return this.ecsCapacityReservationAttr;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSecurityGroupIds(DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesInstance setRdmaIpAddress(DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress rdmaIpAddress) {
            this.rdmaIpAddress = rdmaIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceRdmaIpAddress getRdmaIpAddress() {
            return this.rdmaIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeInstancesResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstancesResponseBodyInstancesInstance setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeInstancesResponseBodyInstancesInstance setNetworkInterfaces(DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkInterfaces getNetworkInterfaces() {
            return this.networkInterfaces;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstance(java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
