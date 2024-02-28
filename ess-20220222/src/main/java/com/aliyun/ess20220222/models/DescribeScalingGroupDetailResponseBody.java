// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDetailResponseBody extends TeaModel {
    @NameInMap("Output")
    public String output;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingGroup")
    public DescribeScalingGroupDetailResponseBodyScalingGroup scalingGroup;

    public static DescribeScalingGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupDetailResponseBody self = new DescribeScalingGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupDetailResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeScalingGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupDetailResponseBody setScalingGroup(DescribeScalingGroupDetailResponseBodyScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public DescribeScalingGroupDetailResponseBodyScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups self = new DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides self = new DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs self = new DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups self = new DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupTags extends TeaModel {
        @NameInMap("Propagate")
        public Boolean propagate;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupTags self = new DescribeScalingGroupDetailResponseBodyScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupTags setPropagate(Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        public Boolean getPropagate() {
            return this.propagate;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes self = new DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups self = new DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups setVServerGroupAttributes(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroup extends TeaModel {
        @NameInMap("ActiveCapacity")
        public Integer activeCapacity;

        @NameInMap("ActiveScalingConfigurationId")
        public String activeScalingConfigurationId;

        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups> albServerGroups;

        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        @NameInMap("AzBalance")
        public Boolean azBalance;

        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CurrentHostName")
        public String currentHostName;

        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        @NameInMap("EnableDesiredCapacity")
        public Boolean enableDesiredCapacity;

        @NameInMap("GroupDeletionProtection")
        public Boolean groupDeletionProtection;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("HealthCheckType")
        public String healthCheckType;

        @NameInMap("HealthCheckTypes")
        public java.util.List<String> healthCheckTypes;

        @NameInMap("InitCapacity")
        public Integer initCapacity;

        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides> launchTemplateOverrides;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs> loadBalancerConfigs;

        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        @NameInMap("MaxInstanceLifetime")
        public Integer maxInstanceLifetime;

        @NameInMap("MaxSize")
        public Integer maxSize;

        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("MonitorGroupId")
        public String monitorGroupId;

        @NameInMap("MultiAZPolicy")
        public String multiAZPolicy;

        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        @NameInMap("PendingWaitCapacity")
        public Integer pendingWaitCapacity;

        @NameInMap("ProtectedCapacity")
        public Integer protectedCapacity;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemovalPolicies")
        public java.util.List<String> removalPolicies;

        @NameInMap("RemovingCapacity")
        public Integer removingCapacity;

        @NameInMap("RemovingWaitCapacity")
        public Integer removingWaitCapacity;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups> serverGroups;

        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        @NameInMap("StandbyCapacity")
        public Integer standbyCapacity;

        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        @NameInMap("SuspendedProcesses")
        public java.util.List<String> suspendedProcesses;

        @NameInMap("SystemSuspended")
        public Boolean systemSuspended;

        @NameInMap("Tags")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupTags> tags;

        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups> VServerGroups;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeScalingGroupDetailResponseBodyScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroup self = new DescribeScalingGroupDetailResponseBodyScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setActiveCapacity(Integer activeCapacity) {
            this.activeCapacity = activeCapacity;
            return this;
        }
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setActiveScalingConfigurationId(String activeScalingConfigurationId) {
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setAlbServerGroups(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups> albServerGroups) {
            this.albServerGroups = albServerGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups> getAlbServerGroups() {
            return this.albServerGroups;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setAzBalance(Boolean azBalance) {
            this.azBalance = azBalance;
            return this;
        }
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setCurrentHostName(String currentHostName) {
            this.currentHostName = currentHostName;
            return this;
        }
        public String getCurrentHostName() {
            return this.currentHostName;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setCustomPolicyARN(String customPolicyARN) {
            this.customPolicyARN = customPolicyARN;
            return this;
        }
        public String getCustomPolicyARN() {
            return this.customPolicyARN;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setDBInstanceIds(java.util.List<String> DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public java.util.List<String> getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setDefaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setDesiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setEnableDesiredCapacity(Boolean enableDesiredCapacity) {
            this.enableDesiredCapacity = enableDesiredCapacity;
            return this;
        }
        public Boolean getEnableDesiredCapacity() {
            return this.enableDesiredCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setGroupDeletionProtection(Boolean groupDeletionProtection) {
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }
        public Boolean getGroupDeletionProtection() {
            return this.groupDeletionProtection;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setHealthCheckTypes(java.util.List<String> healthCheckTypes) {
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }
        public java.util.List<String> getHealthCheckTypes() {
            return this.healthCheckTypes;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setInitCapacity(Integer initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Integer getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setIsElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
            this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
            return this;
        }
        public Boolean getIsElasticStrengthInAlarm() {
            return this.isElasticStrengthInAlarm;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLaunchTemplateOverrides(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides> launchTemplateOverrides) {
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLoadBalancerConfigs(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs> loadBalancerConfigs) {
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs> getLoadBalancerConfigs() {
            return this.loadBalancerConfigs;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }
        public java.util.List<String> getLoadBalancerIds() {
            return this.loadBalancerIds;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setMaxInstanceLifetime(Integer maxInstanceLifetime) {
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }
        public Integer getMaxInstanceLifetime() {
            return this.maxInstanceLifetime;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setMonitorGroupId(String monitorGroupId) {
            this.monitorGroupId = monitorGroupId;
            return this;
        }
        public String getMonitorGroupId() {
            return this.monitorGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setMultiAZPolicy(String multiAZPolicy) {
            this.multiAZPolicy = multiAZPolicy;
            return this;
        }
        public String getMultiAZPolicy() {
            return this.multiAZPolicy;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setPendingCapacity(Integer pendingCapacity) {
            this.pendingCapacity = pendingCapacity;
            return this;
        }
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setPendingWaitCapacity(Integer pendingWaitCapacity) {
            this.pendingWaitCapacity = pendingWaitCapacity;
            return this;
        }
        public Integer getPendingWaitCapacity() {
            return this.pendingWaitCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setProtectedCapacity(Integer protectedCapacity) {
            this.protectedCapacity = protectedCapacity;
            return this;
        }
        public Integer getProtectedCapacity() {
            return this.protectedCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setRemovalPolicies(java.util.List<String> removalPolicies) {
            this.removalPolicies = removalPolicies;
            return this;
        }
        public java.util.List<String> getRemovalPolicies() {
            return this.removalPolicies;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setRemovingCapacity(Integer removingCapacity) {
            this.removingCapacity = removingCapacity;
            return this;
        }
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setRemovingWaitCapacity(Integer removingWaitCapacity) {
            this.removingWaitCapacity = removingWaitCapacity;
            return this;
        }
        public Integer getRemovingWaitCapacity() {
            return this.removingWaitCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setScalingGroupName(String scalingGroupName) {
            this.scalingGroupName = scalingGroupName;
            return this;
        }
        public String getScalingGroupName() {
            return this.scalingGroupName;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setServerGroups(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups> getServerGroups() {
            return this.serverGroups;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setSpotAllocationStrategy(String spotAllocationStrategy) {
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }
        public String getSpotAllocationStrategy() {
            return this.spotAllocationStrategy;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setSpotInstancePools(Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setStandbyCapacity(Integer standbyCapacity) {
            this.standbyCapacity = standbyCapacity;
            return this;
        }
        public Integer getStandbyCapacity() {
            return this.standbyCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setStoppedCapacity(Integer stoppedCapacity) {
            this.stoppedCapacity = stoppedCapacity;
            return this;
        }
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setSuspendedProcesses(java.util.List<String> suspendedProcesses) {
            this.suspendedProcesses = suspendedProcesses;
            return this;
        }
        public java.util.List<String> getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setSystemSuspended(Boolean systemSuspended) {
            this.systemSuspended = systemSuspended;
            return this;
        }
        public Boolean getSystemSuspended() {
            return this.systemSuspended;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setTags(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupTags> getTags() {
            return this.tags;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setTotalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setTotalInstanceCount(Integer totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setVServerGroups(java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups> VServerGroups) {
            this.VServerGroups = VServerGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups> getVServerGroups() {
            return this.VServerGroups;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
