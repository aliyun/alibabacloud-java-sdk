// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsRequest extends TeaModel {
    /**
     * <p>The type of the instances that are managed by the scaling group. Valid values:</p>
     * <br>
     * <p>*   ECS: Elastic Compute Service (ECS) instances.</p>
     * <p>*   ECI: elastic container instances.</p>
     * <br>
     * <p>Default value: ECS.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the scaling group you want to query belongs.</p>
     * <br>
     * <p>> If the specified resource group contains no scaling groups, null is returned.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the scaling groups that you want to query.</p>
     * <br>
     * <p>The query result does not contain the IDs of inactive scaling groups, and no errors are returned.</p>
     */
    @NameInMap("ScalingGroupIds")
    public java.util.List<String> scalingGroupIds;

    /**
     * <p>The name of the scaling group.</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The names of the scaling groups that you want to query.</p>
     * <br>
     * <p>The query result does not contain the names of inactive scaling groups, and no errors are returned.</p>
     */
    @NameInMap("ScalingGroupNames")
    public java.util.List<String> scalingGroupNames;

    public static DescribeScalingGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupsRequest self = new DescribeScalingGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeScalingGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeScalingGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingGroupsRequest setScalingGroupIds(java.util.List<String> scalingGroupIds) {
        this.scalingGroupIds = scalingGroupIds;
        return this;
    }
    public java.util.List<String> getScalingGroupIds() {
        return this.scalingGroupIds;
    }

    public DescribeScalingGroupsRequest setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public DescribeScalingGroupsRequest setScalingGroupNames(java.util.List<String> scalingGroupNames) {
        this.scalingGroupNames = scalingGroupNames;
        return this;
    }
    public java.util.List<String> getScalingGroupNames() {
        return this.scalingGroupNames;
    }

}
