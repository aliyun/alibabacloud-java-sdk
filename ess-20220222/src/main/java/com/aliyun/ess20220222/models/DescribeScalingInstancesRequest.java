// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesRequest extends TeaModel {
    /**
     * <p>The method used to create the instance in the scaling group. Valid values: </p>
     * <ul>
     * <li>AutoCreated: The ECS instance is created by automatic creation based on the instance configuration source in Auto Scaling. </li>
     * <li>Attached: The ECS instance is not created by Auto Scaling but manually added to the scaling group.</li>
     * <li>Managed: The managed instance is not created by Auto Scaling but manually added to the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoCreated</p>
     */
    @NameInMap("CreationType")
    public String creationType;

    /**
     * <p>The methods used to create instances in the scaling group. You can specify only one of this parameter and CreationType.</p>
     */
    @NameInMap("CreationTypes")
    public java.util.List<String> creationTypes;

    /**
     * <p>The health check status of the ECS instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values: </p>
     * <ul>
     * <li>Healthy: The ECS instance is healthy. </li>
     * <li>Unhealthy: The ECS instance is unhealthy.</li>
     * </ul>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and releases the ECS instances created by automatic creation.</p>
     * <p>Whether a manually added ECS instance is released depends on its managed state. If the instance lifecycle is not managed by the scaling group, the instance is only removed but not released. If the instance lifecycle is managed by the scaling group, the instance is removed and released.</p>
     * <blockquote>
     * <p>Make sure that your account has a sufficient available quota. If your account has an overdue payment, all pay-as-you-go ECS instances (including pay-as-you-go instances and spot instances) are stopped or even released. For information about how the status of ECS instances in a scaling group changes after an overdue payment occurs, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Healthy</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The IDs of the ECS instances.</p>
     * <p>Invalid InstanceId values are ignored in the query results, and no error is returned.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The lifecycle state of the ECS instance in the scaling group. Valid values:</p>
     * <ul>
     * <li>InService: The ECS instance is added to the scaling group and provides services in the Normal state. </li>
     * <li>Pending: The ECS instance is being added to the scaling group. During this procedure, the ECS instance is added to the backend server group of the associated load balancing instance and to the access whitelist of the associated ApsaraDB RDS instance.</li>
     * <li>Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a lifecycle hook that applies to scale-out activities is created for the scaling group, the ECS instance is suspended and waits for the lifecycle hook timeout to end.</li>
     * <li>Protected: The ECS instance is protected. The ECS instance provides services as expected, but Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
     * <li>Standby: The ECS instance is in the standby state. The ECS instance does not provide services, the weight of SLB backend server is set to zero, and Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
     * <li>Stopped: The ECS instance is stopped and does not provide services.</li>
     * <li>Removing: The ECS instance is being removed from the scaling group. During this procedure, the ECS instance is removed from the backend server group of the associated load balancing instance and from the access whitelist of the associated ApsaraDB RDS instance. </li>
     * <li>Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a lifecycle hook that applies to scale-down activities is created for the scaling group, the ECS instance is suspended and waits for the lifecycle hook timeout to end.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InService</p>
     */
    @NameInMap("LifecycleState")
    public String lifecycleState;

    /**
     * <p>The lifecycle states of ECS instances in the scaling group. You can specify only one of this parameter and LifecycleState. We recommend that you use this parameter.</p>
     */
    @NameInMap("LifecycleStates")
    public java.util.List<String> lifecycleStates;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the ECS instance list. Minimum value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Settings: Maximum value: 100.</p>
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
