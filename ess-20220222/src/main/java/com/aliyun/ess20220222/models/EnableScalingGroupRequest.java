// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class EnableScalingGroupRequest extends TeaModel {
    /**
     * <p>The ID of the scaling configuration that you want to enable in the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp1ffogfdauy0nu5****</p>
     */
    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    /**
     * <p>The IDs of the ECS instances that you want to add to the scaling group after the scaling group is enabled.</p>
     * <p>Before you add ECS instances to the scaling group, make sure that the instances meet the following requirements:</p>
     * <ul>
     * <li>The instances must reside in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances do not belong to another scaling group.</li>
     * <li>The instances are billed on a subscription or pay-as-you-go basis, or the instances are preemptible instances.</li>
     * <li>If you specify VswitchID for the scaling group, the instances must share the same VPC as the scaling group.</li>
     * <li>If you do not specify VswitchID for the scaling group, the instances must use the classic network.</li>
     * </ul>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the launch template that is used by Auto Scaling to create ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The information about the instance types that you want to extend in the launch template.</p>
     */
    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    /**
     * <p>The version number of the launch template. Valid values:</p>
     * <ul>
     * <li>A fixed template version number.</li>
     * <li>Default: The default template version is always used.</li>
     * <li>Latest: The latest template version is always used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The weights of ECS instances or elastic container instances as backend servers.</p>
     * <p>Default value: 50.</p>
     */
    @NameInMap("LoadBalancerWeights")
    public java.util.List<Integer> loadBalancerWeights;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
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
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp14wlu85wrpchm0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static EnableScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableScalingGroupRequest self = new EnableScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public EnableScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public EnableScalingGroupRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public EnableScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public EnableScalingGroupRequest setLaunchTemplateOverrides(java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public EnableScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public EnableScalingGroupRequest setLoadBalancerWeights(java.util.List<Integer> loadBalancerWeights) {
        this.loadBalancerWeights = loadBalancerWeights;
        return this;
    }
    public java.util.List<Integer> getLoadBalancerWeights() {
        return this.loadBalancerWeights;
    }

    public EnableScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableScalingGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class EnableScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The instance type. If you want to scale instances based on instance type weights in the scaling group, you must specify <code>LaunchTemplateOverrides.WeightedCapacity</code> after you specify this parameter.</p>
         * <p>The instance type specified by using this parameter overwrites the instance type of the launch template.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you specify LaunchTemplateId.</p>
         * </blockquote>
         * <p>You can use this parameter to specify any instance types that are available for purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The weight of the instance type. If you want to scale instances based on instance type weights in the scaling group, you must specify this parameter after you specify <code>LaunchTemplateOverrides.InstanceType</code>.</p>
         * <p>The weight specifies the capacity of an instance of the specified instance type in the scaling group. A higher weight specifies that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * <p>Performance metrics such as the number of vCPUs and the memory size of each instance type may vary. You can specify different weights for different instance types based on your business requirements.</p>
         * <p>Example:</p>
         * <ul>
         * <li>Current capacity: 0</li>
         * <li>Expected capacity: 6</li>
         * <li>Capacity of ecs.c5.xlarge: 4</li>
         * </ul>
         * <p>To reach the expected capacity, Auto Scaling must scale out two instances of ecs.c5.xlarge.</p>
         * <blockquote>
         * <p> The total capacity of the scaling group is constrained and cannot surpass the combined total of the maximum group size defined by MaxSize and the highest weight assigned to any instance type.</p>
         * </blockquote>
         * <p>Valid values of WeightedCapacity: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static EnableScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            EnableScalingGroupRequestLaunchTemplateOverrides self = new EnableScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public EnableScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public EnableScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
