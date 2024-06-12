// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDetailResponseBody extends TeaModel {
    /**
     * <p>The output details of the scaling group of the Elastic Container Instance type. Currently, the output is displayed in a Kubernetes Deployment YAML file.</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the scaling groups.</p>
     */
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
        /**
         * <p>The ID of the Application Load Balancer (ALB) server group.</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by an ECS instance as a backend server in the ALB server group.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an ECS instance as a backend server in the ALB server group.</p>
         */
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
        /**
         * <p>The instance type. The instance type that is specified by using this parameter overwrites the instance type of the launch template.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum bid price of the instance type that is specified by `LaunchTemplateOverride.InstanceType`.</p>
         * <br>
         * <p>>  This parameter takes effect only if you specify `LaunchTemplateId`.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The value of this parameter indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
         */
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
        /**
         * <p>The ID of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of a backend server.</p>
         */
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
        /**
         * <p>The port number used by an ECS instance as a backend server in the server group.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <br>
         * <p>*   ALB</p>
         * <p>*   NLB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of an ECS instance as a backend server in the server group.</p>
         */
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
        /**
         * <p>Indicates whether the tags of the scaling group can be propagated to instances. Valid values:</p>
         * <br>
         * <p>*   true: The tags of the scaling group can be propagated to only instances that are newly created.</p>
         * <p>*   false: The tags of the scaling group cannot be propagated to any instances.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The tag key of the scaling group.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the scaling group.</p>
         */
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
        /**
         * <p>The port number of a backend vServer.</p>
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
        /**
         * <p>The ID of the Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instance to which the backend vServer group belongs.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend vServer group.</p>
         */
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
         * <p>The information about the Application Load Balancer (ALB) server groups.</p>
         */
        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups> albServerGroups;

        /**
         * <p>The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. You can apply the policy to pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</p>
         * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>Indicates whether instances in the scaling group are evenly distributed across zones. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("AzBalance")
        public Boolean azBalance;

        /**
         * <p>Indicates whether pay-as-you-go ECS instances can be automatically created to reach the required number of ECS instances when preemptible ECS instances cannot be created due to high prices or insufficient inventory of resources. This parameter takes effect when you set `MultiAZPolicy` to `COST_OPTIMIZED`. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The time when the scaling group was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>>  This parameter is not available for use.</p>
         */
        @NameInMap("CurrentHostName")
        public String currentHostName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the function that is specified in the custom scale-in policy. This parameter takes effect only if you set the first value of RemovalPolicies to CustomPolicy.</p>
         */
        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        /**
         * <p>The IDs of the ApsaraDB RDS instances that are associated with the scaling group.</p>
         */
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        /**
         * <p>The cooldown period of the scaling group. Unit: seconds.</p>
         */
        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        /**
         * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances.</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>Indicates whether the Expected Number of Instances feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("EnableDesiredCapacity")
        public Boolean enableDesiredCapacity;

        /**
         * <p>Indicates whether Deletion Protection is enabled for the scaling group. Valid values:</p>
         * <br>
         * <p>*   true: Deletion Protection is enabled for the scaling group. This way, the scaling group cannot be deleted.</p>
         * <p>*   false: Deletion Protection is disabled for the scaling group.</p>
         */
        @NameInMap("GroupDeletionProtection")
        public Boolean groupDeletionProtection;

        /**
         * <p>The type of the instances that are managed by the scaling group. Valid values:</p>
         * <br>
         * <p>*   ECS: ECS instances</p>
         * <p>*   ECI: elastic container instances</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   NONE: Auto Scaling does not perform health checks in the scaling group.</p>
         * <p>*   ECS: Auto Scaling performs health checks on ECS instances in the scaling group.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The health check types.</p>
         */
        @NameInMap("HealthCheckTypes")
        public java.util.List<String> healthCheckTypes;

        /**
         * <p>The number of instances that are in the Initialized state and not added to the scaling group.</p>
         */
        @NameInMap("InitCapacity")
        public Integer initCapacity;

        /**
         * <p>>  This parameter is not available for use.</p>
         */
        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        /**
         * <p>The ID of the launch template that is used by the scaling group.</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The information about the instance types that are extended in the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version number of the launch template.</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The status of the scaling group. Valid values:</p>
         * <br>
         * <p>*   Active: The scaling group is in the Enabled state. Enabled scaling groups can receive requests to execute scaling rules and trigger scaling activities.</p>
         * <p>*   Inactive: The scaling group is in the Disabled state. Disabled scaling groups cannot receive requests to execute scaling rules.</p>
         * <p>*   Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules, and the parameter settings of the scaling groups cannot be modified.</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The CLB configurations.</p>
         */
        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs> loadBalancerConfigs;

        /**
         * <p>The IDs of the SLB instances that are associated with the scaling group.</p>
         */
        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        /**
         * <p>The maximum life span of an instance in the scaling group. Unit: seconds.</p>
         * <br>
         * <p>Valid values: 0 or from 86400 to `Integer.maxValue`. A value of 0 for MaxInstanceLifetime indicates that any previously set limit has been removed, which effectively disables the maximum instance lifetime constraint.</p>
         * <br>
         * <p>Default value: null.</p>
         * <br>
         * <p>>  This parameter is not supported by scaling groups of the Elastic Container Instance type and scaling groups whose ScalingPolicy is set to Recycle.</p>
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
         * <p>The time when the scaling group was modified.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The ID of the CloudMonitor application group that is associated with the scaling group.</p>
         */
        @NameInMap("MonitorGroupId")
        public String monitorGroupId;

        /**
         * <p>The scaling policy of the ECS instances in the multi-zone scaling group. Valid values:</p>
         * <br>
         * <p>*   PRIORITY: ECS instances are created based on the value of VSwitchIds. If Auto Scaling cannot create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch of the next highest priority resides.</p>
         * <br>
         * <p>*   COST_OPTIMIZED: ECS instances are created based on the unit prices of their vCPUs. Auto Scaling preferentially creates ECS instances that use the lowest-priced vCPUs. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances in the case that preemptible instances cannot be created due to insufficient inventory of preemptible instance types.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note** The COST_OPTIMIZED setting takes effect only if you specified multiple instance types or preemptible instance types in your scaling configuration.</p>
         * <br>
         * <p>*   BALANCE: ECS instances are evenly distributed across the zones of the scaling group. If ECS instance are unevenly distributed across the specified zones due to insufficient inventory of instance types, you can call the RebalanceInstance operation to rebalance the distribution of the ECS instances.</p>
         */
        @NameInMap("MultiAZPolicy")
        public String multiAZPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances in the scaling group is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The number of ECS instances that are being added to the scaling group and configured.</p>
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
         * <p>The instance removal policies.</p>
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
         * <br>
         * <p>>  If you specify this parameter, new scaling groups are added to the specified resource group. If you do not specify this parameter, new scaling groups are added to the default resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the scaling group.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The name of the scaling group. The name of each scaling group must be unique in a region.</p>
         * <br>
         * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or digit.</p>
         */
        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        /**
         * <p>The reclaim mode of the scaling group. Valid values:</p>
         * <br>
         * <p>*   recycle: economical mode</p>
         * <p>*   release: release mode</p>
         * <p>*   forcerelease: forced release mode</p>
         * <p>*   forcerecycle: forced recycle mode</p>
         * <br>
         * <p>For more information, see [RemoveInstances](https://help.aliyun.com/document_detail/25955.html).</p>
         */
        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        /**
         * <p>The information about the server groups.</p>
         * <br>
         * <p>>  You can use this parameter to obtain information about ALB server groups and Network Load Balancer (NLB) server groups attached to your scaling group.</p>
         */
        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups> serverGroups;

        /**
         * <p>The allocation policy of preemptible instances. Auto Scaling selects instance types based on the allocation policy to create the required number of preemptible instances. You can apply the policy to pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:</p>
         * <br>
         * <p>*   priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</p>
         * <p>*   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</p>
         */
        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        /**
         * <p>The number of instance types that are specified. Preemptible instances of multiple lowest-priced instance types are evenly distributed across the zones of the scaling group. Valid values: 0 to 10.</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message which indicates that the preemptible instance is to be reclaimed.</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The number of ECS instances that are in the Standby state in the scaling group.</p>
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
         * <p>*   true: Auto Scaling stops executing scaling activities in the scaling group if the scaling activities failed for more than seven consecutive days in the scaling group. You must modify the scaling group or scaling configuration to resume the execution of the scaling activities.</p>
         * <p>*   false: Auto Scaling does not stop executing scaling activities in the scaling group.</p>
         */
        @NameInMap("SystemSuspended")
        public Boolean systemSuspended;

        /**
         * <p>The tags of the scaling group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupTags> tags;

        /**
         * <p>The total weighted capacity of all ECS instances in the scaling group if Weighted is specified. In other cases, the value of this parameter indicates the total number of ECS instances in the scaling group.</p>
         */
        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        /**
         * <p>The total number of Elastic Compute Service (ECS) instances in the scaling group.</p>
         */
        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        /**
         * <p>The backend vServer groups.</p>
         */
        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups> VServerGroups;

        /**
         * <p>The vSwitch ID of the scaling group.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The IDs of the vSwitches that are associated with the scaling group. If you specify VSwitchIds, VSwitchId is ignored.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The virtual private cloud (VPC) ID of the scaling group.</p>
         */
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
