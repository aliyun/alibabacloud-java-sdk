// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupRequest extends TeaModel {
    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    @NameInMap("AzBalance")
    public Boolean azBalance;

    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    @NameInMap("CustomPolicyARN")
    public String customPolicyARN;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("MaxInstanceLifetime")
    public Integer maxInstanceLifetime;

    @NameInMap("MaxSize")
    public Integer maxSize;

    @NameInMap("MinSize")
    public Integer minSize;

    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static ModifyScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupRequest self = new ModifyScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public ModifyScalingGroupRequest setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public ModifyScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public ModifyScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public ModifyScalingGroupRequest setCustomPolicyARN(String customPolicyARN) {
        this.customPolicyARN = customPolicyARN;
        return this;
    }
    public String getCustomPolicyARN() {
        return this.customPolicyARN;
    }

    public ModifyScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public ModifyScalingGroupRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public ModifyScalingGroupRequest setGroupDeletionProtection(Boolean groupDeletionProtection) {
        this.groupDeletionProtection = groupDeletionProtection;
        return this;
    }
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    public ModifyScalingGroupRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public ModifyScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyScalingGroupRequest setLaunchTemplateOverrides(java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public ModifyScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public ModifyScalingGroupRequest setMaxInstanceLifetime(Integer maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
        return this;
    }
    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    public ModifyScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public ModifyScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public ModifyScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    public ModifyScalingGroupRequest setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public ModifyScalingGroupRequest setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public ModifyScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingGroupRequest setRemovalPolicies(java.util.List<String> removalPolicies) {
        this.removalPolicies = removalPolicies;
        return this;
    }
    public java.util.List<String> getRemovalPolicies() {
        return this.removalPolicies;
    }

    public ModifyScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingGroupRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ModifyScalingGroupRequest setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public ModifyScalingGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public ModifyScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public ModifyScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public ModifyScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class ModifyScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingGroupRequestLaunchTemplateOverrides self = new ModifyScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public ModifyScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
