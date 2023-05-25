// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The description of the ENI.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("Ipv4PrefixSets")
    public CreateNetworkInterfaceResponseBodyIpv4PrefixSets ipv4PrefixSets;

    /**
     * <p>> This parameter is in invitational preview and is unavailable.</p>
     */
    @NameInMap("Ipv6PrefixSets")
    public CreateNetworkInterfaceResponseBodyIpv6PrefixSets ipv6PrefixSets;

    /**
     * <p>The IPv6 addresses assigned to the ENI.</p>
     */
    @NameInMap("Ipv6Sets")
    public CreateNetworkInterfaceResponseBodyIpv6Sets ipv6Sets;

    /**
     * <p>The media access control (MAC) address of the ENI.</p>
     */
    @NameInMap("MacAddress")
    public String macAddress;

    /**
     * <p>The ENI ID.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The ID of the account to which the ENI belongs.</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The private IP address of the ENI.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Details about the private IP addresses.</p>
     */
    @NameInMap("PrivateIpSets")
    public CreateNetworkInterfaceResponseBodyPrivateIpSets privateIpSets;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the ENI belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the security groups to which the ENI belongs.</p>
     */
    @NameInMap("SecurityGroupIds")
    public CreateNetworkInterfaceResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The ID of the distributor to which the ENI belongs.</p>
     */
    @NameInMap("ServiceID")
    public Long serviceID;

    /**
     * <p>Indicates whether the user of the ENI is an Alibaba Cloud service or a distributor.</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The state of the ENI.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the ENI.</p>
     */
    @NameInMap("Tags")
    public CreateNetworkInterfaceResponseBodyTags tags;

    /**
     * <p>The type of the ENI.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vSwitch with which the ENI is associated.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the ENI belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone in which the ENI resides.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponseBody self = new CreateNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceResponseBody setIpv4PrefixSets(CreateNetworkInterfaceResponseBodyIpv4PrefixSets ipv4PrefixSets) {
        this.ipv4PrefixSets = ipv4PrefixSets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyIpv4PrefixSets getIpv4PrefixSets() {
        return this.ipv4PrefixSets;
    }

    public CreateNetworkInterfaceResponseBody setIpv6PrefixSets(CreateNetworkInterfaceResponseBodyIpv6PrefixSets ipv6PrefixSets) {
        this.ipv6PrefixSets = ipv6PrefixSets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyIpv6PrefixSets getIpv6PrefixSets() {
        return this.ipv6PrefixSets;
    }

    public CreateNetworkInterfaceResponseBody setIpv6Sets(CreateNetworkInterfaceResponseBodyIpv6Sets ipv6Sets) {
        this.ipv6Sets = ipv6Sets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyIpv6Sets getIpv6Sets() {
        return this.ipv6Sets;
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

    public CreateNetworkInterfaceResponseBody setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public CreateNetworkInterfaceResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpSets(CreateNetworkInterfaceResponseBodyPrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyPrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public CreateNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkInterfaceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateNetworkInterfaceResponseBody setSecurityGroupIds(CreateNetworkInterfaceResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public CreateNetworkInterfaceResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateNetworkInterfaceResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public CreateNetworkInterfaceResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public CreateNetworkInterfaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateNetworkInterfaceResponseBody setTags(CreateNetworkInterfaceResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public CreateNetworkInterfaceResponseBodyTags getTags() {
        return this.tags;
    }

    public CreateNetworkInterfaceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNetworkInterfaceResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNetworkInterfaceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkInterfaceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("Ipv4Prefix")
        public String ipv4Prefix;

        public static CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet self = new CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet setIpv4Prefix(String ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        public String getIpv4Prefix() {
            return this.ipv4Prefix;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv4PrefixSets extends TeaModel {
        @NameInMap("Ipv4PrefixSet")
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet;

        public static CreateNetworkInterfaceResponseBodyIpv4PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv4PrefixSets self = new CreateNetworkInterfaceResponseBodyIpv4PrefixSets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv4PrefixSets setIpv4PrefixSet(java.util.List<CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet> ipv4PrefixSet) {
            this.ipv4PrefixSet = ipv4PrefixSet;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv4PrefixSetsIpv4PrefixSet> getIpv4PrefixSet() {
            return this.ipv4PrefixSet;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet extends TeaModel {
        /**
         * <p>> This parameter is in invitational preview and is unavailable.</p>
         */
        @NameInMap("Ipv6Prefix")
        public String ipv6Prefix;

        public static CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet self = new CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet setIpv6Prefix(String ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }
        public String getIpv6Prefix() {
            return this.ipv6Prefix;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv6PrefixSets extends TeaModel {
        @NameInMap("Ipv6PrefixSet")
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet;

        public static CreateNetworkInterfaceResponseBodyIpv6PrefixSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyIpv6PrefixSets self = new CreateNetworkInterfaceResponseBodyIpv6PrefixSets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyIpv6PrefixSets setIpv6PrefixSet(java.util.List<CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet> ipv6PrefixSet) {
            this.ipv6PrefixSet = ipv6PrefixSet;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseBodyIpv6PrefixSetsIpv6PrefixSet> getIpv6PrefixSet() {
            return this.ipv6PrefixSet;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyIpv6SetsIpv6Set extends TeaModel {
        /**
         * <p>The IPv6 address.</p>
         */
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

    public static class CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet extends TeaModel {
        /**
         * <p>Indicates whether the private IP address is the primary private IP address.</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The private IP address of the instance to which the ENI is attached.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet self = new CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
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

    public static class CreateNetworkInterfaceResponseBodyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateNetworkInterfaceResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyTagsTag self = new CreateNetworkInterfaceResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateNetworkInterfaceResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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

}
