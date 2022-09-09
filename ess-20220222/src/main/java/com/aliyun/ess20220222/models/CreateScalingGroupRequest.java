// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateScalingGroupRequest extends TeaModel {
    @NameInMap("AlbServerGroups")
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups;

    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    @NameInMap("AzBalance")
    public Boolean azBalance;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CompensateWithOnDemand")
    public Boolean compensateWithOnDemand;

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    @NameInMap("DBInstanceIds")
    public String DBInstanceIds;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("DesiredCapacity")
    public Integer desiredCapacity;

    @NameInMap("GroupDeletionProtection")
    public Boolean groupDeletionProtection;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("HealthCheckType")
    public String healthCheckType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateOverrides")
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("LifecycleHooks")
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks;

    @NameInMap("LoadBalancerIds")
    public String loadBalancerIds;

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

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemovalPolicies")
    public java.util.List<String> removalPolicies;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupName")
    public String scalingGroupName;

    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    @NameInMap("SpotInstancePools")
    public Integer spotInstancePools;

    @NameInMap("SpotInstanceRemedy")
    public Boolean spotInstanceRemedy;

    @NameInMap("SyncAlarmRuleToCms")
    public Boolean syncAlarmRuleToCms;

    @NameInMap("Tags")
    public java.util.List<CreateScalingGroupRequestTags> tags;

    @NameInMap("VServerGroups")
    public java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static CreateScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupRequest self = new CreateScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupRequest setAlbServerGroups(java.util.List<CreateScalingGroupRequestAlbServerGroups> albServerGroups) {
        this.albServerGroups = albServerGroups;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestAlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
    }

    public CreateScalingGroupRequest setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public CreateScalingGroupRequest setAzBalance(Boolean azBalance) {
        this.azBalance = azBalance;
        return this;
    }
    public Boolean getAzBalance() {
        return this.azBalance;
    }

    public CreateScalingGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateScalingGroupRequest setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
        this.compensateWithOnDemand = compensateWithOnDemand;
        return this;
    }
    public Boolean getCompensateWithOnDemand() {
        return this.compensateWithOnDemand;
    }

    public CreateScalingGroupRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public CreateScalingGroupRequest setDBInstanceIds(String DBInstanceIds) {
        this.DBInstanceIds = DBInstanceIds;
        return this;
    }
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    public CreateScalingGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
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

    public CreateScalingGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateScalingGroupRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateScalingGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScalingGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateScalingGroupRequest setLaunchTemplateOverrides(java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> launchTemplateOverrides) {
        this.launchTemplateOverrides = launchTemplateOverrides;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLaunchTemplateOverrides> getLaunchTemplateOverrides() {
        return this.launchTemplateOverrides;
    }

    public CreateScalingGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateScalingGroupRequest setLifecycleHooks(java.util.List<CreateScalingGroupRequestLifecycleHooks> lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestLifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    public CreateScalingGroupRequest setLoadBalancerIds(String loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public String getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public CreateScalingGroupRequest setMaxInstanceLifetime(Integer maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
        return this;
    }
    public Integer getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }

    public CreateScalingGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public CreateScalingGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public CreateScalingGroupRequest setMultiAZPolicy(String multiAZPolicy) {
        this.multiAZPolicy = multiAZPolicy;
        return this;
    }
    public String getMultiAZPolicy() {
        return this.multiAZPolicy;
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

    public CreateScalingGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScalingGroupRequest setRemovalPolicies(java.util.List<String> removalPolicies) {
        this.removalPolicies = removalPolicies;
        return this;
    }
    public java.util.List<String> getRemovalPolicies() {
        return this.removalPolicies;
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

    public CreateScalingGroupRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    public CreateScalingGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateScalingGroupRequest setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

    public CreateScalingGroupRequest setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
        this.spotInstanceRemedy = spotInstanceRemedy;
        return this;
    }
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    public CreateScalingGroupRequest setSyncAlarmRuleToCms(Boolean syncAlarmRuleToCms) {
        this.syncAlarmRuleToCms = syncAlarmRuleToCms;
        return this;
    }
    public Boolean getSyncAlarmRuleToCms() {
        return this.syncAlarmRuleToCms;
    }

    public CreateScalingGroupRequest setTags(java.util.List<CreateScalingGroupRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestTags> getTags() {
        return this.tags;
    }

    public CreateScalingGroupRequest setVServerGroups(java.util.List<CreateScalingGroupRequestVServerGroups> VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public java.util.List<CreateScalingGroupRequestVServerGroups> getVServerGroups() {
        return this.VServerGroups;
    }

    public CreateScalingGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateScalingGroupRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class CreateScalingGroupRequestAlbServerGroups extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestAlbServerGroups self = new CreateScalingGroupRequestAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public CreateScalingGroupRequestAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateScalingGroupRequestAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestLaunchTemplateOverrides extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static CreateScalingGroupRequestLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLaunchTemplateOverrides self = new CreateScalingGroupRequestLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingGroupRequestLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateScalingGroupRequestLifecycleHooks extends TeaModel {
        @NameInMap("DefaultResult")
        public String defaultResult;

        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        @NameInMap("NotificationArn")
        public String notificationArn;

        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        public static CreateScalingGroupRequestLifecycleHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestLifecycleHooks self = new CreateScalingGroupRequestLifecycleHooks();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestLifecycleHooks setDefaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public String getDefaultResult() {
            return this.defaultResult;
        }

        public CreateScalingGroupRequestLifecycleHooks setHeartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        public CreateScalingGroupRequestLifecycleHooks setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        public CreateScalingGroupRequestLifecycleHooks setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        public CreateScalingGroupRequestLifecycleHooks setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public CreateScalingGroupRequestLifecycleHooks setNotificationMetadata(String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

    }

    public static class CreateScalingGroupRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateScalingGroupRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestTags self = new CreateScalingGroupRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScalingGroupRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScalingGroupRequestVServerGroupsVServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        public static CreateScalingGroupRequestVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroupsVServerGroupAttributes self = new CreateScalingGroupRequestVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public CreateScalingGroupRequestVServerGroupsVServerGroupAttributes setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateScalingGroupRequestVServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        public java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static CreateScalingGroupRequestVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingGroupRequestVServerGroups self = new CreateScalingGroupRequestVServerGroups();
            return TeaModel.build(map, self);
        }

        public CreateScalingGroupRequestVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public CreateScalingGroupRequestVServerGroups setVServerGroupAttributes(java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<CreateScalingGroupRequestVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

}
