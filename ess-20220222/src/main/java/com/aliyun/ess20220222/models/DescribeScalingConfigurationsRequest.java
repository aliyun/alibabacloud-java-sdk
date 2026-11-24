// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the scaling configuration list. The starting value is 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page set in the paging Settings for a paged query. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group to which the scaling configuration belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling configuration to be queried.</p>
     * <p>The query results include both active and inactive scaling configurations. The response parameter LifecycleState identifies the state.</p>
     */
    @NameInMap("ScalingConfigurationIds")
    public java.util.List<String> scalingConfigurationIds;

    /**
     * <p>The name of the scaling configuration to be queried.</p>
     * <p>The query results ignore invalid scaling configuration names and do not return an error.</p>
     */
    @NameInMap("ScalingConfigurationNames")
    public java.util.List<String> scalingConfigurationNames;

    /**
     * <p>The ID of the scaling group. You can query all scaling configurations in the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp17pelvl720x3v7****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeScalingConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsRequest self = new DescribeScalingConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingConfigurationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingConfigurationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingConfigurationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingConfigurationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingConfigurationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingConfigurationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingConfigurationsRequest setScalingConfigurationIds(java.util.List<String> scalingConfigurationIds) {
        this.scalingConfigurationIds = scalingConfigurationIds;
        return this;
    }
    public java.util.List<String> getScalingConfigurationIds() {
        return this.scalingConfigurationIds;
    }

    public DescribeScalingConfigurationsRequest setScalingConfigurationNames(java.util.List<String> scalingConfigurationNames) {
        this.scalingConfigurationNames = scalingConfigurationNames;
        return this;
    }
    public java.util.List<String> getScalingConfigurationNames() {
        return this.scalingConfigurationNames;
    }

    public DescribeScalingConfigurationsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
