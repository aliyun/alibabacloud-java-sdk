// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("MacAddress")
    public String macAddress;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("ServiceID")
    public Long serviceID;

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

    @NameInMap("SecurityGroupIds")
    public CreateNetworkInterfaceResponseBodySecurityGroupIds securityGroupIds;

    @NameInMap("PrivateIpSets")
    public CreateNetworkInterfaceResponseBodyPrivateIpSets privateIpSets;

    @NameInMap("Tags")
    public CreateNetworkInterfaceResponseBodyTags tags;

    @NameInMap("Ipv6Sets")
    public CreateNetworkInterfaceResponseBodyIpv6Sets ipv6Sets;

    public static CreateNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponseBody self = new CreateNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateNetworkInterfaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNetworkInterfaceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkInterfaceResponseBody setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public CreateNetworkInterfaceResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public CreateNetworkInterfaceResponseBody setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateNetworkInterfaceResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public CreateNetworkInterfaceResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfaceResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public CreateNetworkInterfaceResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkInterfaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateNetworkInterfaceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateNetworkInterfaceResponseBody setSecurityGroupIds(CreateNetworkInterfaceResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public CreateNetworkInterfaceResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpSets(CreateNetworkInterfaceResponseBodyPrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyPrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public CreateNetworkInterfaceResponseBody setTags(CreateNetworkInterfaceResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyTags getTags() {
        return this.tags;
    }

    public CreateNetworkInterfaceResponseBody setIpv6Sets(CreateNetworkInterfaceResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
    }

    public static class CreateNetworkInterfaceResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static CreateNetworkInterfaceResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodySecurityGroupIds self = new CreateNetworkInterfaceResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("Primary")
        public Boolean primary;

        public static CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet self = new CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyPrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        public java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet;

        public static CreateNetworkInterfaceResponseBodyPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyPrivateIpSets self = new CreateNetworkInterfaceResponseBodyPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSets setPrivateIpSet(java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static CreateNetworkInterfaceResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyTagsTag self = new CreateNetworkInterfaceResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public CreateNetworkInterfaceResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<CreateNetworkInterfaceResponseBodyTagsTag> tag;

        public static CreateNetworkInterfaceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyTags self = new CreateNetworkInterfaceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyTags setTag(java.util.List<CreateNetworkInterfaceResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set extends TeaModel {
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set self = new CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv6Sets extends TeaModel {
        @NameInMap("Ipv6Set")
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set> ipv6Set;

        public static CreateNetworkInterfaceResponseBodyIpv6Sets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv6Sets self = new CreateNetworkInterfaceResponseBodyIpv6Sets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv6Sets setIpv6Set(java.util.List<CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set> ipv6Set) {
            this.ipv6Set = ipv6Set;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set> getIpv6Set() {
            return this.ipv6Set;
        }

    }

}
