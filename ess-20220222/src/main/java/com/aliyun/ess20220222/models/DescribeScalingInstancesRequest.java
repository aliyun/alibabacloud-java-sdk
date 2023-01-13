// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesRequest extends TeaModel {
    /**
     * <p>The method that is used to create the ECS instance. Valid values:</p>
     * <br>
     * <p>*   AutoCreated: The ECS instance is automatically created by Auto Scaling based on the instance configuration source of the scaling group.</p>
     * <p>*   Attached: The ECS instance is manually added to the scaling group.</p>
     */
    @NameInMap("CreationType")
    public String creationType;

    /**
     * <p>The health status of the ECS instance in the scaling group. If ECS instances do not run as expected, Auto Scaling considers the ECS instances unhealthy. Valid values:</p>
     * <br>
     * <p>*   Healthy</p>
     * <p>*   Unhealthy</p>
     * <br>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
     * <br>
     * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
     * <br>
     * <p>>  Make sure that you have sufficient balance within your Alibaba Cloud account. If you have overdue payments within your Alibaba Cloud account, pay-as-you-go and preemptible instances are stopped or released. For information about how the states of ECS instances change when you have overdue payments within your Alibaba Cloud account, see [Overdue payments](~~170589~~).</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The IDs of the ECS instances.</p>
     * <br>
     * <p>Invalid instance IDs are not displayed in the query result, and no error is reported.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The lifecycle state of the ECS instance in the scaling group. Valid values:</p>
     * <br>
     * <p>*   InService: The ECS instance is added to the scaling group and provides services as expected.</p>
     * <p>*   Pending: The ECS instance is being added to the scaling group. During this process, Auto Scaling adds the ECS instance to the backend server groups of the associated CLB instance and adds the private IP address of the ECS instance to the IP address whitelist of the associated ApsaraDB RDS instance.</p>
     * <p>*   Pending:Wait: The ECS instance is pending to be added to the scaling group. If a lifecycle hook that applies to scale-out activities is created for the scaling group, the ECS instance enters the Pending:Wait state. The ECS instance is added to the scaling group only after the lifecycle hook times out.</p>
     * <p>*   Protected: The ECS instance is being protected. The ECS instance can provide services as expected. However, Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.</p>
     * <p>*   Standby: The ECS instance is on standby. The ECS instance is out of service and the weight of the ECS instance as a backend server is set to zero. Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.</p>
     * <p>*   Stopped: The ECS instance is stopped. The ECS instance is stopped and cannot provide services.</p>
     * <p>*   Removing: The ECS instance is being removed from the scaling group. During this process, Auto Scaling removes the ECS instance from the backend server groups of the associated CLB instance and removes the IP address of the ECS instance from the IP address whitelist of the associated ApsaraDB RDS instance.</p>
     * <p>*   Removing:Wait: The ECS instance is being removed from the scaling group and enters the Removing:Wait state. If a lifecycle hook that applies to scale-in activities is created for the scaling group, the ECS instance enters the Removing:Wait state. The ECS instance is removed from the scaling group only after the lifecycle hook times out.</p>
     */
    @NameInMap("LifecycleState")
    public String lifecycleState;

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
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling activity.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    /**
     * <p>The ID of the associated scaling configuration.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The ID of the scaling group.</p>
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
