// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupRequest extends TeaModel {
    /**
     * <p>The ID of the auto provisioning group.</p>
     */
    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    /**
     * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The billing method of supplemental instances. The target capacity of the auto provisioning group must be at least the sum of the capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter and the capacity of preemptible instances specified by the SpotTargetCapacity parameter. Valid values:</p>
     * <br>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     * <p>*   Spot: preemptible instance</p>
     */
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    /**
     * <p>Specifies whether to release scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:</p>
     * <br>
     * <p>*   termination: releases the scaled-in instances.</p>
     * <p>*   no-termination: removes the scaled-in instances from the auto provisioning group but not releases the instances.</p>
     */
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    /**
     * <p>The extended configurations of launch template.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The maximum price of preemptible instances in the auto provisioning group.</p>
     * <br>
     * <p>>  If both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the maximum price is the lower value of the two parameters. The LaunchTemplateConfig.N.MaxPrice parameter is set when the auto provisioning group is created, and cannot be modified.</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>The region ID of the auto provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The target capacity of preemptible instances in the auto provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>Specifies whether to release instances in the auto provisioning group when the auto provisioning group expires. Valid values:</p>
     * <br>
     * <p>*   true: releases instances in the auto provisioning group.</p>
     * <p>*   false: removes the instances in the group from the auto provisioning group but not releases the instances.</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The target capacity of the auto provisioning group. The parameter value is a positive integer.</p>
     * <br>
     * <p>The target capacity of the auto provisioning group must be at least the sum of the capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter and the capacity of preemptible instances specified by the SpotTargetCapacity parameter.</p>
     */
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
        /**
         * <p>The instance type of extended configuration N. Valid values of N: 1 to 20. For more information about valid values of this parameter, see [Instance families](~~25378~~).</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price of preemptible instances in extended configuration N.</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <p>The priority of extended configuration N. A value of 0 indicates the highest priority. This parameter value must be greater than 0.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configurations is determined by the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type specified in extended configuration N. A greater weight indicates that a single instance has more computing power, and as a result fewer instances are required. This parameter value must be greater than 0.</p>
         * <br>
         * <p>The weight is calculated based on the computing power of the specified instance type and the minimum computing power of a single node of the cluster. For example, if the minimum computing power of a single node is 8 vCPUs and 60 GiB:</p>
         * <br>
         * <p>*   The weight of the instance type with 8 vCPUs and 60 GiB can be set to 1.</p>
         * <p>*   The weight of the instance type with 16 vCPUs and 120 GiB can be set to 2.</p>
         */
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
