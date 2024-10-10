// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesRequest extends TeaModel {
    /**
     * <p>The instance creation method. Valid values:</p>
     * <ul>
     * <li>AutoCreated: The ECS instances are created by Auto Scaling based on the instance configuration source.</li>
     * <li>Attached: The ECS instances are manually added to the scaling group.</li>
     * <li>Managed: The Alibaba Cloud-managed third-party instances are manually added to the scaling group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoCreated</p>
     */
    @NameInMap("CreationType")
    public String creationType;

    /**
     * <p>The instance creation methods. If you specify this parameter, you cannot specify CreationType.</p>
     */
    @NameInMap("CreationTypes")
    public java.util.List<String> creationTypes;

    /**
     * <p>The health status of the ECS instance in the scaling group. If an ECS instance is not in the Running state, the instance is considered unhealthy. Valid values:</p>
     * <ul>
     * <li>Healthy</li>
     * <li>Unhealthy</li>
     * </ul>
     * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
     * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the lifecycles of the instances. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
     * <blockquote>
     * <p> Make sure that you have sufficient balance within your Alibaba Cloud account. If your Alibaba Cloud account has an overdue payment, all pay-as-you-go ECS instances, including preemptible instances, may be stopped or even released. For information about how the status of ECS instances changes when you have an overdue payment in your Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Healthy</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The IDs of the ECS instances.</p>
     * <p>The IDs of inactive instances are not displayed in the query result, and no errors are returned.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The lifecycle status of the ECS instance in the scaling group. Valid values:</p>
     * <ul>
     * <li>InService: The ECS instance is added to the scaling group and provides services as expected.</li>
     * <li>Pending: The ECS instance is being added to the scaling group. When an ECS instance is being added to the scaling group, Auto Scaling also adds the instance to the backend server groups of the attached load balancers and adds the private IP address of the instance to the IP address whitelists of the attached ApsaraDB RDS instances.</li>
     * <li>Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a scale-out lifecycle hook is in effect, the ECS instance remains in the Pending:Wait state until the timeout period for the lifecycle hook expires.</li>
     * <li>Protected: The ECS instance is protected. Protected ECS instances can continue to provide services as expected, but Auto Scaling does not manage the lifecycles of the ECS instances. You must manually manage the lifecycles of the ECS instances.</li>
     * <li>Standby: The ECS instance is on standby. Standby ECS instances do not provide services as expected, and the weights of the ECS instances as backend servers are reset to zero. Auto Scaling does not manage the lifecycles of the ECS instances. Therefore, you must manually manage the lifecycles of the ECS instances.</li>
     * <li>Stopped: The ECS instance is stopped. Stopped ECS instances no longer provide services.</li>
     * <li>Removing: The ECS instance is being removed from the scaling group. When an ECS instance is being removed from the scaling group, Auto Scaling also removes the instance from the backend server groups of the attached load balancers and removes the private IP address of the instance from the IP address whitelists of the attached ApsaraDB RDS instances.</li>
     * <li>Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a scale-in lifecycle hook is in effect, the ECS instance remains in the Removing:Wait state until the timeout period for the lifecycle hook expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InService</p>
     */
    @NameInMap("LifecycleState")
    public String lifecycleState;

    /**
     * <p>The lifecycle status of the ECS instances in the scaling group. You can specify only one of LifecycleStates and LifecycleState at a time. We recommend that you specify this parameter.</p>
     */
    @NameInMap("LifecycleStates")
    public java.util.List<String> lifecycleStates;

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
     * <p>The number of entries per page. Maximum value: 100.</p>
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
     * <p>The ID of the scaling configuration.</p>
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
