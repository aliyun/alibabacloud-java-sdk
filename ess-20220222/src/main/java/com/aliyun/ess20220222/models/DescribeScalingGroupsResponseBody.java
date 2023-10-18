// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingGroups")
    public java.util.List<DescribeScalingGroupsResponseBodyScalingGroups> scalingGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupsResponseBody self = new DescribeScalingGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupsResponseBody setScalingGroups(java.util.List<DescribeScalingGroupsResponseBodyScalingGroups> scalingGroups) {
        this.scalingGroups = scalingGroups;
        return this;
    }
    public java.util.List<DescribeScalingGroupsResponseBodyScalingGroups> getScalingGroups() {
        return this.scalingGroups;
    }

    public DescribeScalingGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups self = new DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides self = new DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs self = new DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsServerGroups extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupsResponseBodyScalingGroupsServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsServerGroups self = new DescribeScalingGroupsResponseBodyScalingGroupsServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeScalingGroupsResponseBodyScalingGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsTags self = new DescribeScalingGroupsResponseBodyScalingGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes self = new DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups self = new DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups setVServerGroupAttributes(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroups extends TeaModel {
        @NameInMap("ActiveCapacity")
        public Integer activeCapacity;

        @NameInMap("ActiveScalingConfigurationId")
        public String activeScalingConfigurationId;

        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> albServerGroups;

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

        @NameInMap("InitCapacity")
        public Integer initCapacity;

        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> launchTemplateOverrides;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> loadBalancerConfigs;

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
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> serverGroups;

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
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsTags> tags;

        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> VServerGroups;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeScalingGroupsResponseBodyScalingGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroups self = new DescribeScalingGroupsResponseBodyScalingGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setActiveCapacity(Integer activeCapacity) {
            this.activeCapacity = activeCapacity;
            return this;
        }
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setActiveScalingConfigurationId(String activeScalingConfigurationId) {
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setAlbServerGroups(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> albServerGroups) {
            this.albServerGroups = albServerGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> getAlbServerGroups() {
            return this.albServerGroups;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setAzBalance(Boolean azBalance) {
            this.azBalance = azBalance;
            return this;
        }
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setCurrentHostName(String currentHostName) {
            this.currentHostName = currentHostName;
            return this;
        }
        public String getCurrentHostName() {
            return this.currentHostName;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setCustomPolicyARN(String customPolicyARN) {
            this.customPolicyARN = customPolicyARN;
            return this;
        }
        public String getCustomPolicyARN() {
            return this.customPolicyARN;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setDBInstanceIds(java.util.List<String> DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public java.util.List<String> getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setDefaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setDesiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            return this;
        }
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setEnableDesiredCapacity(Boolean enableDesiredCapacity) {
            this.enableDesiredCapacity = enableDesiredCapacity;
            return this;
        }
        public Boolean getEnableDesiredCapacity() {
            return this.enableDesiredCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setGroupDeletionProtection(Boolean groupDeletionProtection) {
            this.groupDeletionProtection = groupDeletionProtection;
            return this;
        }
        public Boolean getGroupDeletionProtection() {
            return this.groupDeletionProtection;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setInitCapacity(Integer initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public Integer getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setIsElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
            this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
            return this;
        }
        public Boolean getIsElasticStrengthInAlarm() {
            return this.isElasticStrengthInAlarm;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLaunchTemplateOverrides(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> launchTemplateOverrides) {
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLoadBalancerConfigs(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> loadBalancerConfigs) {
            this.loadBalancerConfigs = loadBalancerConfigs;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> getLoadBalancerConfigs() {
            return this.loadBalancerConfigs;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }
        public java.util.List<String> getLoadBalancerIds() {
            return this.loadBalancerIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setMaxInstanceLifetime(Integer maxInstanceLifetime) {
            this.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }
        public Integer getMaxInstanceLifetime() {
            return this.maxInstanceLifetime;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setMonitorGroupId(String monitorGroupId) {
            this.monitorGroupId = monitorGroupId;
            return this;
        }
        public String getMonitorGroupId() {
            return this.monitorGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setMultiAZPolicy(String multiAZPolicy) {
            this.multiAZPolicy = multiAZPolicy;
            return this;
        }
        public String getMultiAZPolicy() {
            return this.multiAZPolicy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setPendingCapacity(Integer pendingCapacity) {
            this.pendingCapacity = pendingCapacity;
            return this;
        }
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setPendingWaitCapacity(Integer pendingWaitCapacity) {
            this.pendingWaitCapacity = pendingWaitCapacity;
            return this;
        }
        public Integer getPendingWaitCapacity() {
            return this.pendingWaitCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setProtectedCapacity(Integer protectedCapacity) {
            this.protectedCapacity = protectedCapacity;
            return this;
        }
        public Integer getProtectedCapacity() {
            return this.protectedCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setRemovalPolicies(java.util.List<String> removalPolicies) {
            this.removalPolicies = removalPolicies;
            return this;
        }
        public java.util.List<String> getRemovalPolicies() {
            return this.removalPolicies;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setRemovingCapacity(Integer removingCapacity) {
            this.removingCapacity = removingCapacity;
            return this;
        }
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setRemovingWaitCapacity(Integer removingWaitCapacity) {
            this.removingWaitCapacity = removingWaitCapacity;
            return this;
        }
        public Integer getRemovingWaitCapacity() {
            return this.removingWaitCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setScalingGroupName(String scalingGroupName) {
            this.scalingGroupName = scalingGroupName;
            return this;
        }
        public String getScalingGroupName() {
            return this.scalingGroupName;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setServerGroups(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> getServerGroups() {
            return this.serverGroups;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setSpotAllocationStrategy(String spotAllocationStrategy) {
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }
        public String getSpotAllocationStrategy() {
            return this.spotAllocationStrategy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setSpotInstancePools(Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setStandbyCapacity(Integer standbyCapacity) {
            this.standbyCapacity = standbyCapacity;
            return this;
        }
        public Integer getStandbyCapacity() {
            return this.standbyCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setStoppedCapacity(Integer stoppedCapacity) {
            this.stoppedCapacity = stoppedCapacity;
            return this;
        }
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setSuspendedProcesses(java.util.List<String> suspendedProcesses) {
            this.suspendedProcesses = suspendedProcesses;
            return this;
        }
        public java.util.List<String> getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setSystemSuspended(Boolean systemSuspended) {
            this.systemSuspended = systemSuspended;
            return this;
        }
        public Boolean getSystemSuspended() {
            return this.systemSuspended;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setTags(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsTags> getTags() {
            return this.tags;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setTotalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setTotalInstanceCount(Integer totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setVServerGroups(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> VServerGroups) {
            this.VServerGroups = VServerGroups;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> getVServerGroups() {
            return this.VServerGroups;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
