// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("PrivateIpAddress")
    @Validation(required = true)
    public String privateIpAddress;

    @NameInMap("MacAddress")
    @Validation(required = true)
    public String macAddress;

    @NameInMap("NetworkInterfaceName")
    @Validation(required = true)
    public String networkInterfaceName;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("ServiceID")
    @Validation(required = true)
    public Long serviceID;

    @NameInMap("ServiceManaged")
    @Validation(required = true)
    public Boolean serviceManaged;

    @NameInMap("QueueNumber")
    @Validation(required = true)
    public Integer queueNumber;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public String ownerId;

    @NameInMap("PrivateIpSets")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponsePrivateIpSets privateIpSets;

    @NameInMap("Ipv6Sets")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseIpv6Sets ipv6Sets;

    @NameInMap("Tags")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseTags tags;

    @NameInMap("AssociatedPublicIp")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp associatedPublicIp;

    @NameInMap("Attachment")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseAttachment attachment;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public DescribeNetworkInterfaceAttributeResponseSecurityGroupIds securityGroupIds;

    public static DescribeNetworkInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponse self = new DescribeNetworkInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfaceAttributeResponse setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfaceAttributeResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfaceAttributeResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeNetworkInterfaceAttributeResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeNetworkInterfaceAttributeResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeNetworkInterfaceAttributeResponse setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeNetworkInterfaceAttributeResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public DescribeNetworkInterfaceAttributeResponse setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfaceAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkInterfaceAttributeResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfaceAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInterfaceAttributeResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNetworkInterfaceAttributeResponse setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public DescribeNetworkInterfaceAttributeResponse setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeNetworkInterfaceAttributeResponse setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public DescribeNetworkInterfaceAttributeResponse setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfaceAttributeResponse setPrivateIpSets(DescribeNetworkInterfaceAttributeResponsePrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponsePrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public DescribeNetworkInterfaceAttributeResponse setIpv6Sets(DescribeNetworkInterfaceAttributeResponseIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public DescribeNetworkInterfaceAttributeResponse setTags(DescribeNetworkInterfaceAttributeResponseTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseTags getTags() {
        return this.tags;
    }

    public DescribeNetworkInterfaceAttributeResponse setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp associatedPublicIp) {
        this.associatedPublicIp = associatedPublicIp;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    public DescribeNetworkInterfaceAttributeResponse setAttachment(DescribeNetworkInterfaceAttributeResponseAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseAttachment getAttachment() {
        return this.attachment;
    }

    public DescribeNetworkInterfaceAttributeResponse setSecurityGroupIds(DescribeNetworkInterfaceAttributeResponseSecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseSecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Primary")
        @Validation(required = true)
        public Boolean primary;

        @NameInMap("AssociatedPublicIp")
        @Validation(required = true)
        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponsePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet> privateIpSet;

        public static DescribeNetworkInterfaceAttributeResponsePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponsePrivateIpSets self = new DescribeNetworkInterfaceAttributeResponsePrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponsePrivateIpSets setPrivateIpSet(java.util.List<DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponsePrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        public static DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set self = new DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set> ipv6Set;

        public static DescribeNetworkInterfaceAttributeResponseIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseIpv6Sets self = new DescribeNetworkInterfaceAttributeResponseIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseIpv6Sets setIpv6Set(java.util.List<DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeNetworkInterfaceAttributeResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseTagsTag self = new DescribeNetworkInterfaceAttributeResponseTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeNetworkInterfaceAttributeResponseTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfaceAttributeResponseTagsTag> tag;

        public static DescribeNetworkInterfaceAttributeResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseTags self = new DescribeNetworkInterfaceAttributeResponseTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseTags setTag(java.util.List<DescribeNetworkInterfaceAttributeResponseTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeNetworkInterfaceAttributeResponseTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public String publicIpAddress;

        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        public static DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeNetworkInterfaceAttributeResponseAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds extends TeaModel {
        // MemberNetworkInterfaceId
        @NameInMap("MemberNetworkInterfaceId")
        @Validation(required = true)
        public java.util.List<String> memberNetworkInterfaceId;

        public static DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds self = new DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds setMemberNetworkInterfaceId(java.util.List<String> memberNetworkInterfaceId) {
            this.memberNetworkInterfaceId = memberNetworkInterfaceId;
            return this;
        }
        public java.util.List<String> getMemberNetworkInterfaceId() {
            return this.memberNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseAttachment extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        @Validation(required = true)
        public String trunkNetworkInterfaceId;

        @NameInMap("DeviceIndex")
        @Validation(required = true)
        public Integer deviceIndex;

        @NameInMap("MemberNetworkInterfaceIds")
        @Validation(required = true)
        public DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds;

        public static DescribeNetworkInterfaceAttributeResponseAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseAttachment self = new DescribeNetworkInterfaceAttributeResponseAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfaceAttributeResponseAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

        public DescribeNetworkInterfaceAttributeResponseAttachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public DescribeNetworkInterfaceAttributeResponseAttachment setMemberNetworkInterfaceIds(DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds memberNetworkInterfaceIds) {
            this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseAttachmentMemberNetworkInterfaceIds getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeNetworkInterfaceAttributeResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseSecurityGroupIds self = new DescribeNetworkInterfaceAttributeResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
