// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupRequest extends TeaModel {
    // The ID of the auto provisioning group.
    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    // The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    // The billing method of supplemental instances. The target capacity of the auto provisioning group must be at least the sum of the capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter and the capacity of preemptible instances specified by the SpotTargetCapacity parameter. Valid values:
    // 
    // *   PayAsYouGo: pay-as-you-go
    // *   Spot: preemptible instance
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    // Specifies whether to release scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:
    // 
    // *   termination: releases the scaled-in instances.
    // *   no-termination: removes the scaled-in instances from the auto provisioning group but not releases the instances.
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    // The extended configurations of launch template.
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    // The maximum price of preemptible instances in the auto provisioning group.
    // 
    // >  If both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the maximum price is the lower value of the two parameters. The LaunchTemplateConfig.N.MaxPrice parameter is set when the auto provisioning group is created, and cannot be modified.
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The target capacity of pay-as-you-go instances in the auto provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    // The region ID of the auto provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The target capacity of preemptible instances in the auto provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    // Specifies whether to release instances in the auto provisioning group when the auto provisioning group expires. Valid values:
    // 
    // *   true: releases instances in the auto provisioning group.
    // *   false: removes the instances in the group from the auto provisioning group but not releases the instances.
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    // The target capacity of the auto provisioning group. The parameter value is a positive integer.
    // 
    // The target capacity of the auto provisioning group must be at least the sum of the capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter and the capacity of preemptible instances specified by the SpotTargetCapacity parameter.
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    public static ModifyAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupRequest self = new ModifyAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoProvisioningGroupRequest setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public ModifyAutoProvisioningGroupRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public ModifyAutoProvisioningGroupRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public ModifyAutoProvisioningGroupRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public ModifyAutoProvisioningGroupRequest setLaunchTemplateConfig(java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public ModifyAutoProvisioningGroupRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public ModifyAutoProvisioningGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoProvisioningGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoProvisioningGroupRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public ModifyAutoProvisioningGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoProvisioningGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoProvisioningGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAutoProvisioningGroupRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public ModifyAutoProvisioningGroupRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public ModifyAutoProvisioningGroupRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public static class ModifyAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        // The instance type of extended configuration N. Valid values of N: 1 to 20. For more information about valid values of this parameter, see [Instance families](~~25378~~).
        @NameInMap("InstanceType")
        public String instanceType;

        // The maximum price of preemptible instances in extended configuration N.
        @NameInMap("MaxPrice")
        public Double maxPrice;

        // The priority of extended configuration N. A value of 0 indicates the highest priority. This parameter value must be greater than 0.
        @NameInMap("Priority")
        public Integer priority;

        // The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configurations is determined by the vSwitch.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The weight of the instance type specified in extended configuration N. A greater weight indicates that a single instance has more computing power, and as a result fewer instances are required. This parameter value must be greater than 0.
        // 
        // The weight is calculated based on the computing power of the specified instance type and the minimum computing power of a single node of the cluster. For example, if the minimum computing power of a single node is 8 vCPUs and 60 GiB:
        // 
        // *   The weight of the instance type with 8 vCPUs and 60 GiB can be set to 1.
        // *   The weight of the instance type with 16 vCPUs and 120 GiB can be set to 2.
        @NameInMap("WeightedCapacity")
        public Double weightedCapacity;

        public static ModifyAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoProvisioningGroupRequestLaunchTemplateConfig self = new ModifyAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
