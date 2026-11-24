// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeEciScalingConfigurationsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the scaling configuration list. Pages start from 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Settings for paging: Maximum value: 50.</p>
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
     * <p>The IDs of the scaling configurations to be queried. You can specify 1 to 10 IDs.</p>
     * <p>The query results include both active and inactive scaling configurations, which are identified by the LifecycleState response parameter.</p>
     */
    @NameInMap("ScalingConfigurationIds")
    public java.util.List<String> scalingConfigurationIds;

    /**
     * <p>The names of the scaling configurations to be queried. You can specify 1 to 10 names.</p>
     * <p>Invalid scaling configuration names are ignored in the query results, and no error is reported.</p>
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

    public static DescribeEciScalingConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciScalingConfigurationsRequest self = new DescribeEciScalingConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEciScalingConfigurationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEciScalingConfigurationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEciScalingConfigurationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEciScalingConfigurationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEciScalingConfigurationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEciScalingConfigurationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEciScalingConfigurationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEciScalingConfigurationsRequest setScalingConfigurationIds(java.util.List<String> scalingConfigurationIds) {
        this.scalingConfigurationIds = scalingConfigurationIds;
        return this;
    }
    public java.util.List<String> getScalingConfigurationIds() {
        return this.scalingConfigurationIds;
    }

    public DescribeEciScalingConfigurationsRequest setScalingConfigurationNames(java.util.List<String> scalingConfigurationNames) {
        this.scalingConfigurationNames = scalingConfigurationNames;
        return this;
    }
    public java.util.List<String> getScalingConfigurationNames() {
        return this.scalingConfigurationNames;
    }

    public DescribeEciScalingConfigurationsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
