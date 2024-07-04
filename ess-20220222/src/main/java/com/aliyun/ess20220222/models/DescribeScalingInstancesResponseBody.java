// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B13527BF-1FBD-4334-A512-20F5E9D3FB4D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the ECS instances.</p>
     */
    @NameInMap("ScalingInstances")
    public java.util.List<DescribeScalingInstancesResponseBodyScalingInstances> scalingInstances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
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
         * <p>The time when the ECS instances were added to the scaling group. The value is accurate to seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18T03:11:39Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The time when the ECS instances were added to the scaling group. The value is accurate to the minute.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18T03:11Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance creation method. Valid values:</p>
         * <ul>
         * <li>AutoCreated: Auto Scaling created the ECS instances based on the instance configuration source.</li>
         * <li>Attached: You manually added the ECS instances to the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoCreated</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>Indicates whether the scaling group is allowed to manage the instance lifecycles when the ECS instances are added manually. If the scaling group is allowed to manage the instance lifecycles, Auto Scaling can release the ECS instances when they are automatically removed from the scaling group. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Entrusted")
        public Boolean entrusted;

        /**
         * <p>The health status of the ECS instances in the scaling group. If an ECS instance is not in the Running state, it is deemed as unhealthy. Valid values:</p>
         * <ul>
         * <li>Healthy</li>
         * <li>Unhealthy</li>
         * </ul>
         * <p>Auto Scaling automatically removes unhealthy ECS instances from the scaling group and then releases the automatically created instances among the unhealthy instances.</p>
         * <p>Unhealthy ECS instances that are manually added to the scaling group are released based on the management mode of their lifecycles. If the lifecycles of the ECS instances are not managed by the scaling group, Auto Scaling removes the instances from the scaling group but does not release the instances. If the lifecycles of the ECS instances are managed by the scaling group, Auto Scaling removes the instances from the scaling group and releases the instances.</p>
         * <blockquote>
         * <p> Make sure that you have sufficient balance within your Alibaba Cloud account. If your account has an overdue payment, all pay-as-you-go ECS instances, including preemptible instances, may be stopped or even released. For information about how the status of ECS instances changes when you have an overdue payment in your Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/170589.html">Overdue payments</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The IDs of the ECS instances.</p>
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
         * <p>The version number of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The lifecycle status of the ECS instances in the scaling group. Valid values:</p>
         * <ul>
         * <li>InService: The ECS instances have been successfully added to the scaling group and are providing the intended services.</li>
         * <li>Pending: The ECS instances are in the process of being added to the scaling group. When an ECS instance is being added to the scaling group, Auto Scaling also adds it to the backend server groups of the attached load balancers and adds its private IP address to the IP address whitelists of the attached ApsaraDB RDS instances.</li>
         * <li>Pending:Wait: The ECS instances are awaiting addition to the scaling group. If a scale-out lifecycle hook is in effect, ECS instances will remain in the Pending:Wait state until the timeout period for the lifecycle hook expires.</li>
         * <li>Protected: The ECS instances are being safeguarded. Protected ECS instances can continue to provide services as expected, but Auto Scaling does not manage their lifecycles. You must manually manage the lifecycles of the ECS instances.</li>
         * <li>Standby: The ECS instances are on standby. Standby ECS instances do not provide services as expected, and their weights as backend servers are reset to zero. Auto Scaling does not manage their lifecycles. Therefore, you must manually manage the lifecycles of the ECS instances.</li>
         * <li>Stopped: The ECS instances are stopped. Stopped ECS instances do not provide services anymore.</li>
         * <li>Removing: The ECS instances are in the process of being removed from the scaling group. When an ECS instance is being removed from the scaling group, Auto Scaling also removes it from the backend server groups of the attached load balancers and removes its private IP address from the IP address whitelists of the attached ApsaraDB RDS instances.</li>
         * <li>Removing:Wait: The ECS instances are awaiting removal from the scaling group. If a scale-in lifecycle hook is in effect, ECS instances will remain in the Removing:Wait state until the timeout period for the lifecycle hook expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InService</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The weight of each ECS instance as a backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        /**
         * <p>The private IP address of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1**.2*.1**.2**</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the scaling activity during which the ECS instances were added to the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp1c9djwrgxjyk31****</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1i65jd06v04vdh****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The ID of the ECS instance or elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>asi-j6cj1gcte640ekhb****</p>
         */
        @NameInMap("ScalingInstanceId")
        public String scalingInstanceId;

        /**
         * <p>The bidding policy for the preemptible instances. Valid values:</p>
         * <ul>
         * <li>SpotWithPriceLimit: The instances were created as preemptible instances with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instances were preemptible instances for which the market price at the time of purchase was automatically used as the bidding price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The warm-up status of the ECS instances. Valid values:</p>
         * <ul>
         * <li>NoNeedWarmup: The ECS instances do not need to go through a warm-up period.</li>
         * <li>WaitingForInstanceWarmup: The ECS instances are undergoing the warm-up process.</li>
         * <li>InstanceWarmupFinish: The warm-up process for the ECS instances is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoNeedWarmup</p>
         */
        @NameInMap("WarmupState")
        public String warmupState;

        /**
         * <p>The weight of the instance type. The weight indicates the capacity of a single instance of the specified instance type in the scaling group. A greater weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        /**
         * <p>The zone ID of the ECS instances.</p>
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
