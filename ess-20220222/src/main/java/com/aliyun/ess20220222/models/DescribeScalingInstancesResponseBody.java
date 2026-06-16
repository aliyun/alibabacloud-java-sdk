// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B13527BF-1FBD-4334-A512-20F5E9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of ECS instance information.</p>
     */
    @NameInMap("ScalingInstances")
    public java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> scalingInstances;

    /**
     * <p>The total number of ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of running spot instances in the current scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
         * <p>The time when the ECS instance was added to the scaling group. The value is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18T03:11:39Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The time when the ECS instance was added to the scaling group. The value is accurate to the minute.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18T03:11Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The method used to create the ECS instance. Valid values: </p>
         * <ul>
         * <li>AutoCreated: The ECS instance is created by automatic creation based on the instance configuration source in Auto Scaling. </li>
         * <li>Attached: The ECS instance is not created by Auto Scaling but manually added to the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoCreated</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>Indicates whether the manually added instance is managed by the scaling group. A managed manually added instance is released when it is removed from the scaling group (excluding manual removal). Valid values:</p>
         * <ul>
         * <li>true: The instance is managed by the scaling group.</li>
         * <li>false: The instance is not managed by the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Entrusted")
        public Boolean entrusted;

        /**
         * <p>The health check status of the ECS instance in the scaling group. ECS instances that are not in the Running state are considered unhealthy. Valid values: </p>
         * <ul>
         * <li>Healthy: The ECS instance is healthy. </li>
         * <li>Unhealthy: The ECS instance is unhealthy.</li>
         * </ul>
         * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and releases the ECS instances created by automatic creation.</p>
         * <p>Whether a manually added ECS instance is released depends on its managed state. If the instance lifecycle is not managed by the scaling group, the instance is only removed but not released. If the instance lifecycle is managed by the scaling group, the instance is removed and released.</p>
         * <blockquote>
         * <p>Make sure that your account has a sufficient available quota. If your account has an overdue payment, all pay-as-you-go ECS instances (including pay-as-you-go instances and spot instances) are stopped or even released. For information about how the status of ECS instances in a scaling group changes after an overdue payment occurs, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp109k5j3dum1ce6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-m5e3ofjr1zn1aw7****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The version of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The lifecycle state of the ECS instance in the scaling group. Valid values:</p>
         * <ul>
         * <li>InService: The ECS instance is added to the scaling group and provides services in the Normal state. </li>
         * <li>Pending: The ECS instance is being added to the scaling group. During this procedure, the ECS instance is added to the backend server group of the associated load balancing instance and to the access whitelist of the associated ApsaraDB RDS instance.</li>
         * <li>Pending:Wait: The ECS instance is waiting to be added to the scaling group. If a lifecycle hook that applies to scale-out activities is created for the scaling group, the ECS instance is suspended and waits for the lifecycle hook timeout to end.</li>
         * <li>Protected: The ECS instance is protected. The ECS instance provides services as expected, but Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
         * <li>Standby: The ECS instance is in the standby state. The ECS instance does not provide services, the weight of SLB backend server is set to zero, and Auto Scaling does not manage the lifecycle of the ECS instance. You must manually manage the lifecycle.</li>
         * <li>Stopped: The ECS instance is stopped and does not provide services.</li>
         * <li>Removing: The ECS instance is being removed from the scaling group. During this procedure, the ECS instance is removed from the backend server group of the associated load balancing instance and from the access whitelist of the associated ApsaraDB RDS instance. </li>
         * <li>Removing:Wait: The ECS instance is waiting to be removed from the scaling group. If a lifecycle hook that applies to scale-down activities is created for the scaling group, the ECS instance is suspended and waits for the lifecycle hook timeout to end.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InService</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of the load balancing instance.</p>
         * <blockquote>
         * <p>This parameter is deprecated and is not recommended.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The private IP address of the instance in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1**.2*.1**.2**</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("ReplaceStatus")
        public String replaceStatus;

        /**
         * <p>The ID of the scaling activity during which the ECS instance was added to the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp1c9djwrgxjyk31****</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the associated scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1i65jd06v04vdh****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The ID of the scaling group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The instance identity in the scaling group, which has a one-to-one mapping with the ECS instance ID or Elastic Container Instance (ECI) instance identity.</p>
         * 
         * <strong>example:</strong>
         * <p>asi-j6cj1gcte640ekhb****</p>
         */
        @NameInMap("ScalingInstanceId")
        public String scalingInstanceId;

        /**
         * <p>The preemption policy of the spot instance. Valid values:</p>
         * <ul>
         * <li>SpotWithPriceLimit: The spot instance has a maximum price limit.</li>
         * <li>SpotAsPriceGo: The system automatically bids at the current market price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The warmup state of the ECS instance. Valid values: </p>
         * <ul>
         * <li>NoNeedWarmup: No warmup is required.</li>
         * <li>WaitingForInstanceWarmup: The instance is waiting for warmup to complete.</li>
         * <li>InstanceWarmupFinish: Warmup is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoNeedWarmup</p>
         */
        @NameInMap("WarmupState")
        public String warmupState;

        /**
         * <p>The weight of the instance type. The weight indicates the capacity that a single instance of this instance type represents in the scaling group. A higher weight means that fewer instances of this type are required to meet the expected capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        /**
         * <p>The zone ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
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

        public DescribeScalingInstancesResponseBodyScalingInstances setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setReplaceStatus(String replaceStatus) {
            this.replaceStatus = replaceStatus;
            return this;
        }
        public String getReplaceStatus() {
            return this.replaceStatus;
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
