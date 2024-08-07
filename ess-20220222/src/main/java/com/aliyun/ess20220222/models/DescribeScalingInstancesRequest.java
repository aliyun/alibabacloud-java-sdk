// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AutoCreated</p>
     */
    @NameInMap("CreationType")
    public String creationType;

    @NameInMap("CreationTypes")
    public java.util.List<String> creationTypes;

    /**
     * <strong>example:</strong>
     * <p>Healthy</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>InService</p>
     */
    @NameInMap("LifecycleState")
    public String lifecycleState;

    /**
     * <p>The lifecycle states of the ECS instance in the scaling group. You can specify only one of the LifecycleStates and LifecycleState parameters at the same time. We recommend that you specify this parameter.</p>
     */
    @NameInMap("LifecycleStates")
    public java.util.List<String> lifecycleStates;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>asa-bp1c9djwrgxjyk31****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    /**
     * <strong>example:</strong>
     * <p>asc-bp1i65jd06v04vdh****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeScalingInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingInstancesRequest self = new DescribeScalingInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingInstancesRequest setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public DescribeScalingInstancesRequest setCreationTypes(java.util.List<String> creationTypes) {
        this.creationTypes = creationTypes;
        return this;
    }
    public java.util.List<String> getCreationTypes() {
        return this.creationTypes;
    }

    public DescribeScalingInstancesRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public DescribeScalingInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeScalingInstancesRequest setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }
    public String getLifecycleState() {
        return this.lifecycleState;
    }

    public DescribeScalingInstancesRequest setLifecycleStates(java.util.List<String> lifecycleStates) {
        this.lifecycleStates = lifecycleStates;
        return this;
    }
    public java.util.List<String> getLifecycleStates() {
        return this.lifecycleStates;
    }

    public DescribeScalingInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScalingInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingInstancesRequest setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public DescribeScalingInstancesRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public DescribeScalingInstancesRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
