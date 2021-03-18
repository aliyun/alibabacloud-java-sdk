// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("NetworkInterfaceSets")
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets;

    public static DescribeNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponseBody self = new DescribeNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkInterfacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesResponseBody setNetworkInterfaceSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> tag;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags setTag(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment extends TeaModel {
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setAssociatedPublicIp(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("Tags")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags tags;

        @NameInMap("Attachment")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment attachment;

        @NameInMap("ServiceID")
        public Long serviceID;

        @NameInMap("Ipv6Sets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("SecurityGroupIds")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("QueueNumber")
        public Integer queueNumber;

        @NameInMap("PrivateIpSets")
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setTags(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetTags getTags() {
            return this.tags;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setAttachment(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment attachment) {
            this.attachment = attachment;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAttachment getAttachment() {
            return this.attachment;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setServiceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Long getServiceID() {
            return this.serviceID;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setIpv6Sets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetIpv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setSecurityGroupIds(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setAssociatedPublicIp(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet setPrivateIpSets(DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSetPrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

    }

    public static class DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet;

        public static DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets self = new DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseBodyNetworkInterfaceSets setNetworkInterfaceSet(java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet) {
            this.networkInterfaceSet = networkInterfaceSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseBodyNetworkInterfaceSetsNetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

    }

}
