// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnableScalingGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ActiveScalingConfigurationId")
    public String activeScalingConfigurationId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("LoadBalancerWeight")
    public java.util.List<Integer> loadBalancerWeight;

    @NameInMap("LaunchTemplateOverride")
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride;

    public static EnableScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableScalingGroupRequest self = new EnableScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public EnableScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public EnableScalingGroupRequest setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
        return this;
    }
    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public EnableScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public EnableScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public EnableScalingGroupRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public EnableScalingGroupRequest setLoadBalancerWeight(java.util.List<Integer> loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public java.util.List<Integer> getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public EnableScalingGroupRequest setLaunchTemplateOverride(java.util.List<EnableScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride) {
        this.launchTemplateOverride = launchTemplateOverride;
        return this;
    }
    public java.util.List<EnableScalingGroupRequestLaunchTemplateOverride> getLaunchTemplateOverride() {
        return this.launchTemplateOverride;
    }

    public static class EnableScalingGroupRequestLaunchTemplateOverride extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static EnableScalingGroupRequestLaunchTemplateOverride build(java.util.Map<String, ?> map) throws Exception {
            EnableScalingGroupRequestLaunchTemplateOverride self = new EnableScalingGroupRequestLaunchTemplateOverride();
            return TeaModel.build(map, self);
        }

        public EnableScalingGroupRequestLaunchTemplateOverride setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public EnableScalingGroupRequestLaunchTemplateOverride setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
