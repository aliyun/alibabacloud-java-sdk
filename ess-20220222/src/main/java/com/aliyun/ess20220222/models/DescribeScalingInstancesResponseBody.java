// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the ECS instances.</p>
     */
    @NameInMap("ScalingInstances")
    public java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> scalingInstances;

    /**
     * <p>The total number of the ECS instances in the scaling group.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of preemptible instances that run as expected in the scaling group.</p>
     */
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
        /**
         * <p>The time when the ECS instance was added to the scaling group. The value is accurate to seconds.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The time when the ECS instance was added to the scaling group. The value is accurate to minutes.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The method that is used to create the ECS instance. Valid values:</p>
         * <br>
         * <p>*   AutoCreated: The ECS instance is automatically created by Auto Scaling based on the instance configuration source of the scaling group.</p>
         * <p>*   Attached: The ECS instance is manually added to the scaling group.</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>Indicates whether the lifecycles of the ECS instances that are manually added to the scaling group are managed by the scaling group. If the scaling group manages the lifecycles of the ECS instances that are manually added, Auto Scaling releases the ECS instances after Auto Scaling removes the ECS instances from the scaling group. The release rule does not apply to ECS instances that are manually removed from the scaling group. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Entrusted")
        public Boolean entrusted;

        /**
         * <p>The health status of the ECS instance in the scaling group. If the ECS instance does not run as expected, Auto Scaling considers the ECS instance unhealthy. Valid values:</p>
         * <br>
         * <p>*   Healthy</p>
         * <p>*   Unhealthy</p>
         * <br>
         * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
         * <br>
         * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of the instance lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
         * <br>
         * <p>>  Make sure that you have sufficient balance within your Alibaba Cloud account. If you have overdue payments within your Alibaba Cloud account, pay-as-you-go and preemptible instances are stopped or released. For information about how the states of ECS instances change when you have overdue payments within your Alibaba Cloud account, see [Overdue payments](~~170589~~).</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the launch template.</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The version number of the launch template.</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The lifecycle state of the ECS instance in the scaling group. Valid values:</p>
         * <br>
         * <p>*   InService: The ECS instance is added to the scaling group and provides services as expected.</p>
         * <p>*   Pending: The ECS instance is being added to the scaling group. During this process, Auto Scaling adds the ECS instance to the backend server groups of the associated CLB instance and adds the private IP address of the ECS instance to the IP address whitelist of the associated ApsaraDB RDS instance.</p>
         * <p>*   Pending:Wait: The ECS instance is pending to be added to the scaling group. If a lifecycle hook that applies to scale-out activities is created for the scaling group, the ECS instance enters the Pending:Wait state. The ECS instance is added to the scaling group only after the lifecycle hook times out.</p>
         * <p>*   Protected: The ECS instance is being protected. The ECS instance can provide services as expected. However, Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.</p>
         * <p>*   Standby: The ECS instance is on standby. The ECS instance is out of service and the weight of the ECS instance as a backend server is set to zero. Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle of the ECS instance.</p>
         * <p>*   Stopped: The ECS instance is stopped. The ECS instance is stopped and cannot provide services.</p>
         * <p>*   Removing: The ECS instance is being removed from the scaling group. During this process, Auto Scaling removes the ECS instance from the backend server groups of the associated CLB instance and removes the IP address of the ECS instance from the IP address whitelist of the associated ApsaraDB RDS instance.</p>
         * <p>*   Removing:Wait: The ECS instance is being removed from the scaling group and enters the Removing:Wait state. If a lifecycle hook that applies to scale-in activities is created for the scaling group, the ECS instance enters the Removing:Wait state. The ECS instance is removed from the scaling group only after the lifecycle hook times out.</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the ECS instance as a backend server.</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The ID of the scaling activity during which the ECS instance is added to the scaling group.</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the associated scaling configuration.</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The ID of the scaling group to which the ECS instance belongs.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The bidding policy for the preemptible instance. Valid values:</p>
         * <br>
         * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The warmup state of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   NoNeedWarmup: The instance does not need to be warmed up.</p>
         * <p>*   WaitingForInstanceWarmup: The instance is being warmed up.</p>
         * <p>*   InstanceWarmupFinish: The instance is warmed up.</p>
         */
        @NameInMap("WarmupState")
        public String warmupState;

        /**
         * <p>The weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        /**
         * <p>The zone ID of the ECS instance.</p>
         */
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
