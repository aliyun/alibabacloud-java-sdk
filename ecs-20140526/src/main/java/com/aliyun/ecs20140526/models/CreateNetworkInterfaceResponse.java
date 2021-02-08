// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponse extends TeaModel {
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

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("ServiceID")
    @Validation(required = true)
    public Long serviceID;

    @NameInMap("ServiceManaged")
    @Validation(required = true)
    public Boolean serviceManaged;

    @NameInMap("OwnerId")
    @Validation(required = true)
    public String ownerId;

    @NameInMap("PrivateIpSets")
    @Validation(required = true)
    public CreateNetworkInterfaceResponsePrivateIpSets privateIpSets;

    @NameInMap("Tags")
    @Validation(required = true)
    public CreateNetworkInterfaceResponseTags tags;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public CreateNetworkInterfaceResponseSecurityGroupIds securityGroupIds;

    public static CreateNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponse self = new CreateNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkInterfaceResponse setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateNetworkInterfaceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateNetworkInterfaceResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateNetworkInterfaceResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkInterfaceResponse setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNetworkInterfaceResponse setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateNetworkInterfaceResponse setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateNetworkInterfaceResponse setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public CreateNetworkInterfaceResponse setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public CreateNetworkInterfaceResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateNetworkInterfaceResponse setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
    }

    public CreateNetworkInterfaceResponse setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public CreateNetworkInterfaceResponse setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfaceResponse setPrivateIpSets(CreateNetworkInterfaceResponsePrivateIpSets privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public CreateNetworkInterfaceResponsePrivateIpSets getPrivateIpSets() {
        return this.privateIpSets;
    }

    public CreateNetworkInterfaceResponse setTags(CreateNetworkInterfaceResponseTags tags) {
        this.tags = tags;
        return this;
    }
    public CreateNetworkInterfaceResponseTags getTags() {
        return this.tags;
    }

    public CreateNetworkInterfaceResponse setSecurityGroupIds(CreateNetworkInterfaceResponseSecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public CreateNetworkInterfaceResponseSecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static class CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public String privateIpAddress;

        @NameInMap("Primary")
        @Validation(required = true)
        public Boolean primary;

        public static CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet self = new CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

    public static class CreateNetworkInterfaceResponsePrivateIpSets extends TeaModel {
        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public java.util.List<CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet> privateIpSet;

        public static CreateNetworkInterfaceResponsePrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponsePrivateIpSets self = new CreateNetworkInterfaceResponsePrivateIpSets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponsePrivateIpSets setPrivateIpSet(java.util.List<CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet> privateIpSet) {
            this.privateIpSet = privateIpSet;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponsePrivateIpSetsPrivateIpSet> getPrivateIpSet() {
            return this.privateIpSet;
        }

    }

    public static class CreateNetworkInterfaceResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static CreateNetworkInterfaceResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseTagsTag self = new CreateNetworkInterfaceResponseTagsTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateNetworkInterfaceResponseTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateNetworkInterfaceResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<CreateNetworkInterfaceResponseTagsTag> tag;

        public static CreateNetworkInterfaceResponseTags build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseTags self = new CreateNetworkInterfaceResponseTags();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseTags setTag(java.util.List<CreateNetworkInterfaceResponseTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateNetworkInterfaceResponseTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class CreateNetworkInterfaceResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static CreateNetworkInterfaceResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseSecurityGroupIds self = new CreateNetworkInterfaceResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
