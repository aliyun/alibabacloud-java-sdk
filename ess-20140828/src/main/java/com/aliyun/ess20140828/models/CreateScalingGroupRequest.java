// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    @NameInMap("RemovalPolicy")
    public java.util.List<String> removalPolicy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MinSize")
    public Integer minSize;

    @NameInMap("MaxSize")
    public Integer maxSize;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("MultiAZPolicy")
    public String multiAZPolicy;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("LifecycleHook")
    public java.util.List<CreateScalingGroupRequestLifecycleHook> lifecycleHook;

    @NameInMap("VServerGroup")
    public java.util.List<CreateScalingGroupRequestVServerGroup> VServerGroup;

    @NameInMap("Tag")
    public java.util.List<CreateScalingGroupRequestTag> tag;

    @NameInMap("LaunchTemplateOverride")
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride;

    @NameInMap("AlbServerGroup")
    public java.util.List<CreateScalingGroupRequestAlbServerGroup> albServerGroup;

    public static CreateScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupRequest self = new CreateScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupRequest setRemovalPolicy(java.util.List<String> removalPolicy) {
        this.removalPolicy = removalPolicy;
        return this;
    }
    public java.util.List<String> getRemovalPolicy() {
        return this.removalPolicy;
    }

    public CreateScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScalingGroupRequest setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }
    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public CreateScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateScalingGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public CreateScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public CreateScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public CreateScalingGroupRequest setLoadBalancerIds(String loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public CreateScalingGroupRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public CreateScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
    }

    public CreateScalingGroupRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateScalingGroupRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    public CreateScalingGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateScalingGroupRequest setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public CreateScalingGroupRequest setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public CreateScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public CreateScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public CreateScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public CreateScalingGroupRequest setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }
    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    public CreateScalingGroupRequest setGroupDeletionProtection(Boolean groupDeletionProtection) {
        this.groupDeletionProtection = groupDeletionProtection;
        return this;
    }
    public Boolean getGroupDeletionProtection() {
        return this.groupDeletionProtection;
    }

    public CreateScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateScalingGroupRequest setLifecycleHook(java.util.List<CreateScalingGroupRequestLifecycleHook> lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLifecycleHook> getLifecycleHook() {
        return this.lifecycleHook;
    }

    public CreateScalingGroupRequest setVServerGroup(java.util.List<CreateScalingGroupRequestVServerGroup> VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestVServerGroup> getVServerGroup() {
        return this.VServerGroup;
    }

    public CreateScalingGroupRequest setTag(java.util.List<CreateScalingGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateScalingGroupRequest setLaunchTemplateOverride(java.util.List<CreateScalingGroupRequestLaunchTemplateOverride> launchTemplateOverride) {
        this.launchTemplateOverride = launchTemplateOverride;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverride> getLaunchTemplateOverride() {
        return this.launchTemplateOverride;
    }

    public CreateScalingGroupRequest setAlbServerGroup(java.util.List<CreateScalingGroupRequestAlbServerGroup> albServerGroup) {
        this.albServerGroup = albServerGroup;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestAlbServerGroup> getAlbServerGroup() {
        return this.albServerGroup;
    }

    public static class CreateScalingGroupRequestLifecycleHook extends TeaModel {
        @NameInMap("DefaultResult")
        public String defaultResult;

        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        @NameInMap("NotificationArn")
        public String notificationArn;

        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        public static CreateScalingGroupRequestLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLifecycleHook self = new CreateScalingGroupRequestLifecycleHook();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLifecycleHook setDefaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public String getDefaultResult() {
            return this.defaultResult;
        }

        public CreateScalingGroupRequestLifecycleHook setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        public CreateScalingGroupRequestLifecycleHook setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        public CreateScalingGroupRequestLifecycleHook setNotificationMetadata(String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        public CreateScalingGroupRequestLifecycleHook setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public CreateScalingGroupRequestLifecycleHook setHeartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

    }

    public static class CreateScalingGroupRequestVServerGroupVServerGroupAttribute extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Port")
        public Integer port;

        public static CreateScalingGroupRequestVServerGroupVServerGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroupVServerGroupAttribute self = new CreateScalingGroupRequestVServerGroupVServerGroupAttribute();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroupVServerGroupAttribute setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public CreateScalingGroupRequestVServerGroupVServerGroupAttribute setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateScalingGroupRequestVServerGroupVServerGroupAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateScalingGroupRequestVServerGroup extends TeaModel {
        @NameInMap("VServerGroupAttribute")
        public java.util.List<CreateScalingGroupRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static CreateScalingGroupRequestVServerGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroup self = new CreateScalingGroupRequestVServerGroup();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroup setVServerGroupAttribute(java.util.List<CreateScalingGroupRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute) {
            this.VServerGroupAttribute = VServerGroupAttribute;
            return this;
        }
        public java.util.List<CreateScalingGroupRequestVServerGroupVServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public CreateScalingGroupRequestVServerGroup setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class CreateScalingGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateScalingGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestTag self = new CreateScalingGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScalingGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScalingGroupRequestLaunchTemplateOverride extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static CreateScalingGroupRequestLaunchTemplateOverride build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLaunchTemplateOverride self = new CreateScalingGroupRequestLaunchTemplateOverride();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLaunchTemplateOverride setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingGroupRequestLaunchTemplateOverride setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateScalingGroupRequestAlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Port")
        public Integer port;

        public static CreateScalingGroupRequestAlbServerGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestAlbServerGroup self = new CreateScalingGroupRequestAlbServerGroup();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestAlbServerGroup setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public CreateScalingGroupRequestAlbServerGroup setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateScalingGroupRequestAlbServerGroup setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
