// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponseBody extends TeaModel {
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
     * <p>Details of the scaling groups.</p>
     */
    @NameInMap("ScalingGroups")
    public java.util.List<DescribeScalingGroupsResponseBodyScalingGroups> scalingGroups;

    /**
     * <p>The total number of scaling groups.</p>
     */
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
        /**
         * <p>The ID of the ALB server group.</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number that is used by an ECS instance after Auto Scaling adds the ECS instance to the ALB server group.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an ECS instance after Auto Scaling adds the ECS instance to the ALB server group as a backend server.</p>
         */
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
        /**
         * <p>The instance type. The instance type that is specified by this parameter overrides the instance type that is specified in the launch template.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum bid price of the instance type that is specified by the `InstanceType` parameter. You can specify 1 to 10 instance types by using the Extended Configurations feature of the launch template.</p>
         * <br>
         * <p>> This parameter is available only if you specify the `LaunchTemplateId` parameter.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The value of this parameter indicates the capacity of a single instance of the specified instance type in the scaling group. A greater weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         */
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

    public static class DescribeScalingGroupsResponseBodyScalingGroupsVServerGroupsVServerGroupAttributes extends TeaModel {
        /**
         * <p>The port number that is used by the SLB instance to provide external services.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend vServer group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of the backend vServer group.</p>
         */
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
        /**
         * <p>The ID of the Server Load Balancer (SLB) instance to which the backend vServer group belongs.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend vServer groups.</p>
         */
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
        /**
         * <p>The number of ECS instances that are in the In Service state in the scaling group.</p>
         */
        @NameInMap("ActiveCapacity")
        public Integer activeCapacity;

        /**
         * <p>The ID of the active scaling configuration in the scaling group.</p>
         */
        @NameInMap("ActiveScalingConfigurationId")
        public String activeScalingConfigurationId;

        /**
         * <p>Details of the Application Load Balancer (ALB) server groups.</p>
         */
        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> albServerGroups;

        /**
         * <p>The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. The policy can be applied to pay-as-you-go instances and preemptible instances. This parameter is available only if you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of instances.</p>
         * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>Indicates whether instances in the scaling group are evenly distributed across zones. This parameter is available only if you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AzBalance")
        public Boolean azBalance;

        /**
         * <p>Indicates whether pay-as-you-go instances can be automatically created to meet the requirement on the number of ECS instances when the expected capacity of preemptible instances cannot be provided due to reasons such as cost-related issues and insufficient resources. This parameter is available only if you set the MultiAZPolicy parameter to COST_OPTIMIZED. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The time when the scaling group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("CurrentHostName")
        public String currentHostName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the custom scale-in policy (Function). This parameter is available only if you specify CustomPolicy as the first step to remove instances.</p>
         */
        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        /**
         * <p>The IDs of the ApsaraDB RDS instances that are associated with the scaling group.</p>
         */
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        /**
         * <p>The cooldown period of the scaling group. During the cooldown period, Auto Scaling executes only the scaling activities that are triggered by [CloudMonitor](~~35170~~) event-triggered tasks.</p>
         */
        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        /**
         * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances in the scaling group.</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>Indicates whether deletion protection is enabled for the scaling group. Valid values:</p>
         * <br>
         * <p>*   true: Deletion protection is enabled for the scaling group. This way, the scaling group cannot be deleted.</p>
         * <p>*   false: Deletion protection is disabled for the scaling group.</p>
         */
        @NameInMap("GroupDeletionProtection")
        public Boolean groupDeletionProtection;

        /**
         * <p>The type of the instances that are managed by the scaling group.</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   NONE: Auto Scaling does not perform health checks.</p>
         * <p>*   ECS: Auto Scaling performs health checks on ECS instances in the scaling group.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The number of instances that are in the Initialized state before the instances are added to the scaling group.</p>
         */
        @NameInMap("InitCapacity")
        public Integer initCapacity;

        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        /**
         * <p>The ID of the launch template that is used by the scaling group.</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The information about the instance types that are specified by using the Extended Configurations feature of the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version of the launch template that is used by the scaling group.</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The status of the scaling group. Valid values:</p>
         * <br>
         * <p>*   Active: The scaling group is active. Active scaling groups can receive requests to execute scaling rules and trigger scaling activities.</p>
         * <p>*   Inactive: The scaling group is inactive. Inactive scaling groups cannot receive requests to execute scaling rules.</p>
         * <p>*   Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules. In addition, the parameter settings of the scaling groups cannot be modified.</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> loadBalancerConfigs;

        /**
         * <p>The IDs of the SLB instances that are associated with the scaling group.</p>
         */
        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        /**
         * <p>The maximum life span of an instance in the scaling group. Unit: seconds.</p>
         * <br>
         * <p>Valid values: 0 or from 86400 to the value of the `Integer.maxValue` parameter. If you set this parameter to 0, the instance has an unlimited life span.</p>
         * <br>
         * <p>Default value: null.</p>
         * <br>
         * <p>> This parameter is unavailable for scaling groups that manage elastic container instances or scaling groups whose ScalingPolicy is set to recycle.</p>
         */
        @NameInMap("MaxInstanceLifetime")
        public Integer maxInstanceLifetime;

        /**
         * <p>The maximum number of ECS instances that can be contained in the scaling group.</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The minimum number of ECS instances that must be contained in the scaling group.</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        /**
         * <p>The time when the scaling group was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The ID of the CloudMonitor application group that is associated with the scaling group.</p>
         */
        @NameInMap("MonitorGroupId")
        public String monitorGroupId;

        /**
         * <p>The scaling policy for the multi-zone scaling group that contains ECS instances. Valid values:</p>
         * <br>
         * <p>*   PRIORITY: ECS instances are scaled based on the value of the VSwitchIds.N parameter. If Auto Scaling fails to create ECS instances in the zone where the vSwitch that has the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch that has the next highest priority resides.</p>
         * <br>
         * <p>*   COST_OPTIMIZED: ECS instances are scaled based on the unit price of vCPUs. Auto Scaling preferentially creates ECS instances whose vCPUs have the lowest price. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically create pay-as-you-go instances when preemptible instances cannot be created due to insufficient resources.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note**The COST_OPTIMIZED setting takes effect only when multiple instance types are specified or at least one preemptible instance type is specified.</p>
         * <br>
         * <p>*   BALANCE: ECS instances are evenly distributed across zones that are specified for the scaling group. If ECS instances are unevenly distributed across the specified zones due to insufficient resources, you can call the RebalanceInstance operation to evenly redistribute the ECS instances across the zones.</p>
         */
        @NameInMap("MultiAZPolicy")
        public String multiAZPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be included in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The number of ECS instances that are being added to the scaling group and still being configured.</p>
         */
        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        /**
         * <p>The number of ECS instances that are in the Pending Add state in the scaling group.</p>
         */
        @NameInMap("PendingWaitCapacity")
        public Integer pendingWaitCapacity;

        /**
         * <p>The number of ECS instances that are in the Protected state in the scaling group.</p>
         */
        @NameInMap("ProtectedCapacity")
        public Integer protectedCapacity;

        /**
         * <p>The region ID of the scaling group.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Details of the policies that are used to remove ECS instances from the scaling group. Valid values:</p>
         * <br>
         * <p>*   OldestInstance: ECS instances that are created at the earliest point in time are removed.</p>
         * <p>*   NewestInstance: ECS instances that are created at the most recent point in time are removed.</p>
         * <p>*   OldestScalingConfiguration: ECS instances that are created based on the earliest scaling configuration are removed.</p>
         */
        @NameInMap("RemovalPolicies")
        public java.util.List<String> removalPolicies;

        /**
         * <p>The number of ECS instances that are being removed from the scaling group.</p>
         */
        @NameInMap("RemovingCapacity")
        public Integer removingCapacity;

        /**
         * <p>The number of ECS instances that are in the Pending Remove state in the scaling group.</p>
         */
        @NameInMap("RemovingWaitCapacity")
        public Integer removingWaitCapacity;

        /**
         * <p>The ID of the resource group to which the scaling group belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the scaling group.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The name of the scaling group.</p>
         */
        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        /**
         * <p>The reclaim mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   recycle: economical mode.</p>
         * <p>*   release: release mode.</p>
         */
        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> serverGroups;

        /**
         * <p>The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy of preemptible instances. This parameter is available only if you set the `MultiAZPolicy` parameter to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of preemptible instances.</p>
         * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</p>
         * <br>
         * <p>Default value: priority.</p>
         */
        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        /**
         * <p>The number of instance types that are specified. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest price across zones. Valid values: 0 to 10.</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message which indicates that the preemptible instance is to be reclaimed.</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The number of instances that are in the Standby state in the scaling group.</p>
         */
        @NameInMap("StandbyCapacity")
        public Integer standbyCapacity;

        /**
         * <p>The number of instances that are stopped in Economical Mode in the scaling group.</p>
         */
        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        /**
         * <p>The processes that are suspended. If no process is suspended, null is returned. Valid values:</p>
         * <br>
         * <p>*   ScaleIn: scale-in</p>
         * <p>*   ScaleOut: scale-out</p>
         * <p>*   HealthCheck: health check</p>
         * <p>*   AlarmNotification: event-triggered task</p>
         * <p>*   ScheduledAction: scheduled task</p>
         */
        @NameInMap("SuspendedProcesses")
        public java.util.List<String> suspendedProcesses;

        /**
         * <p>Indicates whether Auto Scaling stops executing scaling activities in the scaling group. Valid values:</p>
         * <br>
         * <p>*   true: If the scaling activities fail for more than seven consecutive days, Auto Scaling stops executing scaling activities in the scaling group. You must modify the scaling group or scaling configuration to resume the execution of the scaling activities.</p>
         * <p>*   false: Auto Scaling does not stop executing scaling activities in the scaling group.</p>
         */
        @NameInMap("SystemSuspended")
        public Boolean systemSuspended;

        /**
         * <p>If the WeightedCapacity parameter is specified, the value of this parameter indicates the total weighted capacity of all ECS instances in the scaling group. In other cases, the value of this parameter indicates the total number of ECS instances in the scaling group.</p>
         */
        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        /**
         * <p>The total number of ECS instances in the scaling group.</p>
         */
        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        /**
         * <p>The backend vServer groups.</p>
         */
        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> VServerGroups;

        /**
         * <p>The ID of the vSwitch that is associated with the scaling group.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The IDs of the vSwitches that are associated with the scaling group. If you specify the VSwitchIds parameter, the VSwitchId parameter is ignored.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the scaling group resides.</p>
         */
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
