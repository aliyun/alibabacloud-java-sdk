// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("Attachment")
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment;

    @NameInMap("MacAddress")
    public String macAddress;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("ServiceID")
    public Long serviceID;

    @NameInMap("Type")
    public String type;

    @NameInMap("QueueNumber")
    public Integer queueNumber;

    @NameInMap("Ipv6Sets")
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets> ipv6Sets;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AssociatedPublicIp")
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("Tags")
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTags> tags;

    @NameInMap("PrivateIpSets")
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets> privateIpSets;

    public static DescribeNetworkInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeResponseBody self = new DescribeNetworkInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeNetworkInterfaceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAttachment(DescribeNetworkInterfaceAttributeResponseBodyAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAttachment getAttachment() {
        return this.attachment;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setIpv6Sets(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets> ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets> getIpv6Sets() {
        return this.ipv6Sets;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp associatedPublicIp) {
        this.associatedPublicIp = associatedPublicIp;
        return this;
    }
    public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp getAssociatedPublicIp() {
        return this.associatedPublicIp;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setTags(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeNetworkInterfaceAttributeResponseBody setPrivateIpSets(java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets> privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public java.util.List<DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets> getPrivateIpSets() {
        return this.privateIpSets;
    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAttachment extends TeaModel {
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MemberNetworkInterfaceIds")
        public java.util.List<String> memberNetworkInterfaceIds;

        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

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

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setMemberNetworkInterfaceIds(java.util.List<String> memberNetworkInterfaceIds) {
            this.memberNetworkInterfaceIds = memberNetworkInterfaceIds;
            return this;
        }
        public java.util.List<String> getMemberNetworkInterfaceIds() {
            return this.memberNetworkInterfaceIds;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAttachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets self = new DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyIpv6Sets setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeNetworkInterfaceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyTags self = new DescribeNetworkInterfaceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets self = new DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets setAssociatedPublicIp(DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSetsAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeNetworkInterfaceAttributeResponseBodyPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

}
