// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Status")
    public String status;

    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("MacAddress")
    public String macAddress;

    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("ServiceID")
    public Long serviceID;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("QueueNumber")
    public Integer queueNumber;

    @NameInMap("SecurityGroupIds")
    public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds securityGroupIds;

    @NameInMap("AssociatedPublicIp")
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp;

    @NameInMap("Attachment")
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment;

    @NameInMap("PrivateIpSets")
    public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets privateIpSets;

    @NameInMap("Ipv6Sets")
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets ipv6Sets;

    @NameInMap("Tags")
    public DescribeNetworkInterfaceAttributeResponseBodyTags tags;

    public static DescribeNetworkInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponseBody self = new DescribeNetworkInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQueuePairNumber(Integer queuePairNumber) {
        this.queuePairNumber = queuePairNumber;
        return this;
    }
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setSecurityGroupIds(DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp) {
        this.associatedPublicIp = associatedPublicIp;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAttachment(DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment getAttachment() {
        return this.attachment;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpSets(DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setIpv6Sets(DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setTags(DescribeNetworkInterfaceAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public static class DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds self = new DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds extends TeaModel {
        @NameInMap("MemberNetworkInterfaceId")
        public java.util.List<String> memberNetworkInterfaceId;

        public static DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds self = new DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds setMemberNetworkInterfaceId(java.util.List<String> memberNetworkInterfaceId) {
            this.memberNetworkInterfaceId = memberNetworkInterfaceId;
            return this;
        }
        public java.util.List<String> getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAttachment extends TeaModel {
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

        @NameInMap("MemberNetworkInterfaceIds")
        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds;

        public static DescribeNetworkInterfaceAttributeResponseBodyAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAttachment self = new DescribeNetworkInterfaceAttributeResponseBodyAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setMemberNetworkInterfaceIds(DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds) {
            this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyAttachmentMemberNetworkInterfaceIds getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeNetworkInterfaceAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyTagsTag self = new DescribeNetworkInterfaceAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> tag;

        public static DescribeNetworkInterfaceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyTags self = new DescribeNetworkInterfaceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTags setTag(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
