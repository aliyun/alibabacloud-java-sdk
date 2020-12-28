// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponseBody extends TeaModel {
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

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

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

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Tags")
    public java.util.List<CreateNetworkInterfaceResponseBodyTags> tags;

    @NameInMap("PrivateIpSets")
    public java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSets> privateIpSets;

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

    public CreateNetworkInterfaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateNetworkInterfaceResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
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

    public CreateNetworkInterfaceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateNetworkInterfaceResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
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

    public CreateNetworkInterfaceResponseBody setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateNetworkInterfaceResponseBody setServiceID(Long serviceID) {
        this.serviceID = serviceID;
        return this;
    }
    public Long getServiceID() {
        return this.serviceID;
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

    public CreateNetworkInterfaceResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfaceResponseBody setTags(java.util.List<CreateNetworkInterfaceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateNetworkInterfaceResponseBodyTags> getTags() {
        return this.tags;
    }

    public CreateNetworkInterfaceResponseBody setPrivateIpSets(java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSets> privateIpSets) {
        this.privateIpSets = privateIpSets;
        return this;
    }
    public java.util.List<CreateNetworkInterfaceResponseBodyPrivateIpSets> getPrivateIpSets() {
        return this.privateIpSets;
    }

    public static class CreateNetworkInterfaceResponseBodyTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static CreateNetworkInterfaceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyTags self = new CreateNetworkInterfaceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public CreateNetworkInterfaceResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class CreateNetworkInterfaceResponseBodyPrivateIpSets extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static CreateNetworkInterfaceResponseBodyPrivateIpSets build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceResponseBodyPrivateIpSets self = new CreateNetworkInterfaceResponseBodyPrivateIpSets();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSets setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public CreateNetworkInterfaceResponseBodyPrivateIpSets setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

}
