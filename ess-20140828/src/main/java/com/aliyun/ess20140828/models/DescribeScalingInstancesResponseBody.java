// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalSpotCount")
    public Integer totalSpotCount;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ScalingInstances")
    public DescribeScalingInstancesResponseBodyScalingInstances scalingInstances;

    public static DescribeScalingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingInstancesResponseBody self = new DescribeScalingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingInstancesResponseBody setTotalSpotCount(Integer totalSpotCount) {
        this.totalSpotCount = totalSpotCount;
        return this;
    }
    public Integer getTotalSpotCount() {
        return this.totalSpotCount;
    }

    public DescribeScalingInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScalingInstancesResponseBody setScalingInstances(DescribeScalingInstancesResponseBodyScalingInstances scalingInstances) {
        this.scalingInstances = scalingInstances;
        return this;
    }
    public DescribeScalingInstancesResponseBodyScalingInstances getScalingInstances() {
        return this.scalingInstances;
    }

    public static class DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("WarmupState")
        public String warmupState;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("CreationType")
        public String creationType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        @NameInMap("Entrusted")
        public Boolean entrusted;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        public static DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance self = new DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance();
            return TeaModel.build(map, self);
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setWarmupState(String warmupState) {
            this.warmupState = warmupState;
            return this;
        }
        public String getWarmupState() {
            return this.warmupState;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setEntrusted(Boolean entrusted) {
            this.entrusted = entrusted;
            return this;
        }
        public Boolean getEntrusted() {
            return this.entrusted;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

    }

    public static class DescribeScalingInstancesResponseBodyScalingInstances extends TeaModel {
        @NameInMap("ScalingInstance")
        public java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> scalingInstance;

        public static DescribeScalingInstancesResponseBodyScalingInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingInstancesResponseBodyScalingInstances self = new DescribeScalingInstancesResponseBodyScalingInstances();
            return TeaModel.build(map, self);
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingInstance(java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> scalingInstance) {
            this.scalingInstance = scalingInstance;
            return this;
        }
        public java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> getScalingInstance() {
            return this.scalingInstance;
        }

    }

}
