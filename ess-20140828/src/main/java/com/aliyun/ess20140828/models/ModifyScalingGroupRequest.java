// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupRequest extends TeaModel {
    @NameInMap("RemovalPolicy")
    public java.util.List<String> removalPolicy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    @NameInMap("MinSize")
    public Integer minSize;

    @NameInMap("MaxSize")
    public Integer maxSize;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("OnDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    @NameInMap("OnDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("LaunchTemplateOverride")
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride;

    public static ModifyScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupRequest self = new ModifyScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupRequest setRemovalPolicy(java.util.List<String> removalPolicy) {
        this.removalPolicy = removalPolicy;
        return this;
    }
    public java.util.List<String> getRemovalPolicy() {
        return this.removalPolicy;
    }

    public ModifyScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public ModifyScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public ModifyScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public ModifyScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public ModifyScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public ModifyScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
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

    public ModifyScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public ModifyScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public ModifyScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
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

    public ModifyScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    public ModifyScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public ModifyScalingGroupRequest setLaunchTemplateOverride(java.util.List<ModifyScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride) {
        this.launchTemplateOverride = launchTemplateOverride;
        return this;
    }
    public java.util.List<ModifyScalingGroupRequestLaunchTemplateOverride> getLaunchTemplateOverride() {
        return this.launchTemplateOverride;
    }

    public static class ModifyScalingGroupRequestLaunchTemplateOverride extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingGroupRequestLaunchTemplateOverride build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingGroupRequestLaunchTemplateOverride self = new ModifyScalingGroupRequestLaunchTemplateOverride();
            return TeaModel.build(map, self);
        }

        public ModifyScalingGroupRequestLaunchTemplateOverride setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingGroupRequestLaunchTemplateOverride setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
