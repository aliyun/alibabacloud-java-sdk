// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    @NameInMap("Status")
    public String status;

    @NameInMap("VkClientVersion")
    public String vkClientVersion;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("WithEvent")
    public Boolean withEvent;

    @NameInMap("Tag")
    public java.util.List<DescribeContainerGroupsRequestTag> tag;

    public static DescribeContainerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsRequest self = new DescribeContainerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeContainerGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeContainerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeContainerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerGroupsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeContainerGroupsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeContainerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeContainerGroupsRequest setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        return this;
    }
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    public DescribeContainerGroupsRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public DescribeContainerGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeContainerGroupsRequest setVkClientVersion(String vkClientVersion) {
        this.vkClientVersion = vkClientVersion;
        return this;
    }
    public String getVkClientVersion() {
        return this.vkClientVersion;
    }

    public DescribeContainerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeContainerGroupsRequest setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
        return this;
    }
    public Boolean getWithEvent() {
        return this.withEvent;
    }

    public DescribeContainerGroupsRequest setTag(java.util.List<DescribeContainerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeContainerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeContainerGroupsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeContainerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsRequestTag self = new DescribeContainerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
