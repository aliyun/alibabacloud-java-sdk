// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesRequest extends TeaModel {
    /**
     * <p>The creation type of the instances in the scaling group. Valid values: </p>
     * <ul>
     * <li>AutoCreated: The ECS instance is created by Auto Scaling through automatic creation based on the instance configuration source. </li>
     * <li>Attached: The ECS instance is not created by Auto Scaling, but is manually added to the scaling group.</li>
     * <li>Managed: The managed instance is not created by Auto Scaling, but is manually added to the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoCreated</p>
     */
    @NameInMap("CreationType")
    public String creationType;

    /**
     * <p>The creation types of the instances in the scaling group. You can specify only one of the CreationTypes and CreationType parameters at a time.</p>
     */
    @NameInMap("CreationTypes")
    public java.util.List<String> creationTypes;

    /**
     * <p>The health status of the ECS instances in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values: </p>
     * <ul>
     * <li>Healthy: The ECS instance is healthy. </li>
     * <li>Unhealthy: The ECS instance is unhealthy.</li>
     * </ul>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and releases ECS instances created through automatic creation.</p>
     * <p>Whether to release manually added ECS instances depends on their managed state. If the instance lifecycle is not managed by the scaling group, the instance is only removed but not released. If the instance lifecycle is managed by the scaling group, the instance is removed and released.</p>
     * <blockquote>
     * <p>Make sure that your account has sufficient active balance. If your account has overdue payments, all pay-as-you-go ECS instances, including pay-as-you-go instances and spot instances, are stopped or even released. For more information about the instance status changes of ECS instances in a scaling group after overdue payments, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Healthy</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The IDs of the ECS instances.</p>
     * <p>Invalid InstanceIds are ignored in the returned query results, and no error is reported.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The lifecycle state of the ECS instances in the scaling group. Valid values:</p>
     * <ul>
     * <li>InService: The ECS instance is added to the scaling group and provides services normally. </li>
     * <li>Pending: The ECS instance is being added to the scaling group. The procedure of adding an ECS instance to a scaling group includes adding the instance to the backend server group of a load balancing instance and adding the IP address of the instance to the access whitelist of an ApsaraDB RDS instance.</li>
     * <li>Pending:Wait: The addition of the ECS instance to the scaling group is suspended. If a lifecycle hook applicable to scale-out activities is created in the scaling group, the ECS instance is suspended when it is added to the scaling group and waits for the hook timeout to end.</li>
     * <li>Protected: The ECS instance provides services normally, but Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
     * <li>Standby: The ECS instance does not provide services, the weight of SLB backend server is set to zero, and Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
     * <li>Stopped: The ECS instance is stopped and does not provide services.</li>
     * <li>Removing: The ECS instance is being removed from the scaling group. The procedure of removing an ECS instance from a scaling group includes removing the instance from the backend server group of a load balancing instance and removing the IP address of the instance from the access whitelist of an ApsaraDB RDS instance. </li>
     * <li>Removing:Wait: The removal of the ECS instance from the scaling group is suspended. If a lifecycle hook applicable to scale-down activities is created in the scaling group, the ECS instance is suspended when it is removed from the scaling group and waits for the hook timeout to end.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InService</p>
     */
    @NameInMap("LifecycleState")
    public String lifecycleState;

    /**
     * <p>The lifecycle statuses of the ECS instances in the scaling group. You can specify only one of the LifecycleStates and LifecycleState parameters at a time. We recommend that you use this parameter.</p>
     */
    @NameInMap("LifecycleStates")
    public java.util.List<String> lifecycleStates;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the ECS instance list. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page in a paging query. Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the scaling group belongs.</p>
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
     * <p>The ID of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1c9djwrgxjyk31****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    /**
     * <p>The ID of the associated scaling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp1i65jd06v04vdh****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The ID of the scaling group.</p>
     * 
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
