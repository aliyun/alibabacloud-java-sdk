// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingInstances")
    public java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> scalingInstances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalSpotCount")
    public Integer totalSpotCount;

    public static DescribeScalingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingInstancesResponseBody self = new DescribeScalingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingInstancesResponseBody setScalingInstances(java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> scalingInstances) {
        this.scalingInstances = scalingInstances;
        return this;
    }
    public java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> getScalingInstances() {
        return this.scalingInstances;
    }

    public DescribeScalingInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScalingInstancesResponseBody setTotalSpotCount(Integer totalSpotCount) {
        this.totalSpotCount = totalSpotCount;
        return this;
    }
    public Integer getTotalSpotCount() {
        return this.totalSpotCount;
    }

    public static class DescribeScalingInstancesResponseBodyScalingInstances extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CreationType")
        public String creationType;

        @NameInMap("Entrusted")
        public Boolean entrusted;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScalingInstanceId")
        public String scalingInstanceId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("WarmupState")
        public String warmupState;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeScalingInstancesResponseBodyScalingInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingInstancesResponseBodyScalingInstances self = new DescribeScalingInstancesResponseBodyScalingInstances();
            return TeaModel.build(map, self);
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setEntrusted(Boolean entrusted) {
            this.entrusted = entrusted;
            return this;
        }
        public Boolean getEntrusted() {
            return this.entrusted;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingInstanceId(String scalingInstanceId) {
            this.scalingInstanceId = scalingInstanceId;
            return this;
        }
        public String getScalingInstanceId() {
            return this.scalingInstanceId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setWarmupState(String warmupState) {
            this.warmupState = warmupState;
            return this;
        }
        public String getWarmupState() {
            return this.warmupState;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
