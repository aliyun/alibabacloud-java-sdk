// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class InnerDescribeNetworkInterfaceInGroupResponseBody extends TeaModel {
    @NameInMap("NetworkInterfaceSets")
    public NetworkInterfaceSets networkInterfaceSets;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static InnerDescribeNetworkInterfaceInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InnerDescribeNetworkInterfaceInGroupResponseBody self = new InnerDescribeNetworkInterfaceInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public InnerDescribeNetworkInterfaceInGroupResponseBody setNetworkInterfaceSets(NetworkInterfaceSets networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public NetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public InnerDescribeNetworkInterfaceInGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public InnerDescribeNetworkInterfaceInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static AssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            AssociatedPublicIp self = new AssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public AssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public AssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class Attachment extends TeaModel {
        @NameInMap("DeviceIndex")
        public Integer deviceIndex;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TrunkNetworkInterfaceId")
        public String trunkNetworkInterfaceId;

        public static Attachment build(java.util.Map<String, ?> map) throws Exception {
            Attachment self = new Attachment();
            return TeaModel.build(map, self);
        }

        public Attachment setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }
        public Integer getDeviceIndex() {
            return this.deviceIndex;
        }

        public Attachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public Attachment setTrunkNetworkInterfaceId(String trunkNetworkInterfaceId) {
            this.trunkNetworkInterfaceId = trunkNetworkInterfaceId;
            return this;
        }
        public String getTrunkNetworkInterfaceId() {
            return this.trunkNetworkInterfaceId;
        }

    }

    public static class Ipv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static Ipv6Set build(java.util.Map<String, ?> map) throws Exception {
            Ipv6Set self = new Ipv6Set();
            return TeaModel.build(map, self);
        }

        public Ipv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class Ipv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<Ipv6Set> ipv6Set;

        public static Ipv6Sets build(java.util.Map<String, ?> map) throws Exception {
            Ipv6Sets self = new Ipv6Sets();
            return TeaModel.build(map, self);
        }

        public Ipv6Sets setIpv6Set(java.util.List<Ipv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<Ipv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

    public static class PrivateIpSetAssociatedPublicIp extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        public static PrivateIpSetAssociatedPublicIp build(java.util.Map<String, ?> map) throws Exception {
            PrivateIpSetAssociatedPublicIp self = new PrivateIpSetAssociatedPublicIp();
            return TeaModel.build(map, self);
        }

        public PrivateIpSetAssociatedPublicIp setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public PrivateIpSetAssociatedPublicIp setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class PrivateIpSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public PrivateIpSetAssociatedPublicIp associatedPublicIp;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static PrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            PrivateIpSet self = new PrivateIpSet();
            return TeaModel.build(map, self);
        }

        public PrivateIpSet setAssociatedPublicIp(PrivateIpSetAssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public PrivateIpSetAssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public PrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public PrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class PrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<PrivateIpSet> privateIpSet;

        public static PrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            PrivateIpSets self = new PrivateIpSets();
            return TeaModel.build(map, self);
        }

        public PrivateIpSets setPrivateIpSet(java.util.List<PrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<PrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class SecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static SecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupIds self = new SecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public SecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public Tag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

    public static class NetworkInterfaceSet extends TeaModel {
        @NameInMap("AssociatedPublicIp")
        public AssociatedPublicIp associatedPublicIp;

        @NameInMap("Attachment")
        public Attachment attachment;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ipv6Sets")
        public Ipv6Sets ipv6Sets;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("PrivateIpSets")
        public PrivateIpSets privateIpSets;

        @NameInMap("QueueNumber")
        public Integer queueNumber;

        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        public SecurityGroupIds securityGroupIds;

        @NameInMap("ServiceID")
        public Long serviceID;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static NetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterfaceSet self = new NetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

        public NetworkInterfaceSet setAssociatedPublicIp(AssociatedPublicIp associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            return this;
        }
        public AssociatedPublicIp getAssociatedPublicIp() {
            return this.associatedPublicIp;
        }

        public NetworkInterfaceSet setAttachment(Attachment attachment) {
            this.attachment = attachment;
            return this;
        }
        public Attachment getAttachment() {
            return this.attachment;
        }

        public NetworkInterfaceSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public NetworkInterfaceSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public NetworkInterfaceSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public NetworkInterfaceSet setIpv6Sets(Ipv6Sets ipv6Sets) {
            this.ipv6Sets = ipv6Sets;
            return this;
        }
        public Ipv6Sets getIpv6Sets() {
            return this.ipv6Sets;
        }

        public NetworkInterfaceSet setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public NetworkInterfaceSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public NetworkInterfaceSet setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public NetworkInterfaceSet setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public NetworkInterfaceSet setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public NetworkInterfaceSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public NetworkInterfaceSet setPrivateIpSets(PrivateIpSets privateIpSets) {
            this.privateIpSets = privateIpSets;
            return this;
        }
        public PrivateIpSets getPrivateIpSets() {
            return this.privateIpSets;
        }

        public NetworkInterfaceSet setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public NetworkInterfaceSet setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public NetworkInterfaceSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public NetworkInterfaceSet setSecurityGroupIds(SecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public SecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public NetworkInterfaceSet setServiceID(Long serviceID) {
            this.serviceID = serviceID;
            return this;
        }
        public Long getServiceID() {
            return this.serviceID;
        }

        public NetworkInterfaceSet setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public NetworkInterfaceSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public NetworkInterfaceSet setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public NetworkInterfaceSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public NetworkInterfaceSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public NetworkInterfaceSet setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public NetworkInterfaceSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class NetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        public java.util.List<NetworkInterfaceSet> networkInterfaceSet;

        public static NetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterfaceSets self = new NetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public NetworkInterfaceSets setNetworkInterfaceSet(java.util.List<NetworkInterfaceSet> networkInterfaceSet) {
            this.networkInterfaceSet = networkInterfaceSet;
            return this;
        }
        public java.util.List<NetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

    }

}
