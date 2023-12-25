// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the elastic container instances in JSON format. You can specify up to 20 IDs.</p>
     */
    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    /**
     * <p>The name of the elastic container instance.</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The maximum number of resources to return. Default value: 20. Maximum value: 20.</p>
     * <br>
     * <p>>  The number of returned resources is less than or equal to the specified number.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that determines the start point of the query. If this parameter is left empty, all results have been returned.</p>
     * <br>
     * <p>> You do not need to specify this parameter in the first request. Starting from the second request, you can obtain the token from the result returned by the previous request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the elastic container instances belong. If you do not specify a resource group when you create an elastic container instance, the system automatically adds the instance to the default resource group in your account.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the elastic container instance. Valid values:</p>
     * <br>
     * <p>*   Pending: The instance is being started.</p>
     * <p>*   Running: The instance is running.</p>
     * <p>*   Succeeded: The instance runs successfully.</p>
     * <p>*   Failed: The instance fails to run.</p>
     * <p>*   Scheduling: The instance is being created.</p>
     * <p>*   ScheduleFailed: The instance fails to be created.</p>
     * <p>*   Restarting: The instance is being restarted.</p>
     * <p>*   Updating: The instance is being updated.</p>
     * <p>*   Terminating: The instance is being terminated.</p>
     * <p>*   Expired: The instance expires.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag of the instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeContainerGroupsRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the elastic container instances are connected.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specifies whether to return event information.</p>
     */
    @NameInMap("WithEvent")
    public Boolean withEvent;

    /**
     * <p>The ID of the zone in which the elastic container instances are deployed. If you do not specify this parameter, the system selects a zone.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeContainerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsRequest self = new DescribeContainerGroupsRequest();
        return TeaModel.build(map, self);
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

    public DescribeContainerGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeContainerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeContainerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeContainerGroupsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeContainerGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeContainerGroupsRequest setTag(java.util.List<DescribeContainerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeContainerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeContainerGroupsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeContainerGroupsRequest setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
        return this;
    }
    public Boolean getWithEvent() {
        return this.withEvent;
    }

    public DescribeContainerGroupsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeContainerGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instances.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instances.</p>
         */
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
