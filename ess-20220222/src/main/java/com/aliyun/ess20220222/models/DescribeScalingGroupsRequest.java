// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsRequest extends TeaModel {
    /**
     * <p>The type of instances that are managed by the scaling group. Valid values:</p>
     * <ul>
     * <li>ECS: Elastic Compute Service (ECS) instances.</li>
     * <li>ECI: elastic container instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the scaling group that you want to query belongs.</p>
     * <blockquote>
     * <p> If no scaling group belongs to the specified resource group, the query result is empty and no error is reported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-123******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the scaling groups that you want to query.</p>
     * <p>The IDs of inactive scaling groups are not included in the query results, and no error is returned.</p>
     */
    @NameInMap("ScalingGroupIds")
    public java.util.List<String> scalingGroupIds;

    /**
     * <p>The name of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>scalinggroup****</p>
     */
    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    /**
     * <p>The names of the scaling groups that you want to query.</p>
     * <p>The names of inactive scaling groups are not displayed in the query results, and no error is reported.</p>
     */
    @NameInMap("ScalingGroupNames")
    public java.util.List<String> scalingGroupNames;

    /**
     * <p>The tags of the scaling group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeScalingGroupsRequestTags> tags;

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

    public DescribeScalingGroupsRequest setTags(java.util.List<DescribeScalingGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeScalingGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeScalingGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeScalingGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsRequestTags self = new DescribeScalingGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeScalingGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
