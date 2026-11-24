// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupDetailResponseBody extends TeaModel {
    /**
     * <p>The output details of the ECI scaling group. Currently, only the Kubernetes Deployment YAML format is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: apps/v1
     * kind: Deployment
     * metadata:
     *   name: nginx-deployment
     *   labels:
     *     app: nginx
     *   spec:
     *     replicas: 3
     *     selector:
     *        matchLabels:
     *         app: nginx
     *     template:
     *       metadata:
     *         labels:
     *           app: nginx
     *         annotations:
     *           k8s.aliyun.com/eip-bandwidth: 10
     *           k8s.aliyun.com/eci-with-eip: true
     *         spec:
     *           containers:
     *           - name: nginx
     *             image: nginx:1.14.2
     *             ports:
     *             - containerPort: 80</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Auto Scaling group.</p>
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
         * <p>The ID of the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the instance after Auto Scaling adds the instance to the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The specified instance type, which overrides the instance type in the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price for the spot instance type specified by LaunchTemplateOverride.InstanceType.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type, which indicates the capacity of a single instance of this instance type in the scaling group. A greater weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The ID of the load balancing CLB (formerly SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zein3ytoeq49cmkbyxr0</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The port number used by the instance after Auto Scaling adds the instance to the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-i9ouakeaerr*****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the load balancing server group. Valid values:</p>
         * <ul>
         * <li>ALB: Application Load Balancer (ALB).</li>
         * <li>NLB: Network Load Balancer (NLB).</li>
         * <li>GWLB: Gateway Load Balancer (GWLB).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>Indicates whether the tag is propagated. Valid values:</p>
         * <ul>
         * <li>true: Tags on the scaling group are propagated only to newly created instances, and not to instances that are already running in the scaling group.</li>
         * <li>false: Tags on the scaling group are not propagated to instances.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>The tag key of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance</p>
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
         * <p>The Server Port of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp12bjrny****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of the backend server group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ID of the traditional load balancing CLB (formerly SLB) instance to which the virtual server group (virtual service) belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>147b46d767c-cn-qingdao-cm5****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend server group.</p>
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

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy extends TeaModel {
        /**
         * <p>The health check behavior in impaired zones. Valid values: </p>
         * <ul>
         * <li>ReplaceUnhealthy: Unhealthy instances in all zones are replaced as usual. </li>
         * <li>IgnoreUnhealthy: Unhealthy instances in impaired zones are not replaced, while healthy zones are not affected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReplaceUnhealthy</p>
         */
        @NameInMap("ImpairedZoneHealthCheckBehavior")
        public String impairedZoneHealthCheckBehavior;

        /**
         * <p>Blocks scale-in activities triggered by specified types of scaling rules to prevent false scale-in caused by fake improvement of monitoring metrics due to unreachable instances in impaired zones. The blocking scope applies to all zones in the scaling group, not just impaired zones. Valid values: </p>
         * <ul>
         * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
         * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
         * <li>None: Does not block scale-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StepScalingRule</p>
         */
        @NameInMap("ScaleInBlockedRuleTypes")
        public java.util.List<String> scaleInBlockedRuleTypes;

        /**
         * <p>Specifies whether scale-out creates instances only in healthy zones during the zone shift. Valid values: </p>
         * <ul>
         * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
         * <li>false: Scale-out can create instances in any zone under the scaling group without zone restrictions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleOutInHealthyZonesOnly")
        public Boolean scaleOutInHealthyZonesOnly;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy self = new DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy setImpairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
            this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
            return this;
        }
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy setScaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
            this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
            return this;
        }
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy setScaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
            this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
            return this;
        }
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions extends TeaModel {
        /**
         * <p>The expiration time of the zone shift. After the expiration time, the system automatically ends the shift and restores the related zones. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T12:05Z</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The list of impaired zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ImpairedZoneIds")
        public java.util.List<String> impairedZoneIds;

        /**
         * <p>The behavior policy of the scaling group during the zone shift.</p>
         */
        @NameInMap("ZoneShiftPolicy")
        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy zoneShiftPolicy;

        public static DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions self = new DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions setImpairedZoneIds(java.util.List<String> impairedZoneIds) {
            this.impairedZoneIds = impairedZoneIds;
            return this;
        }
        public java.util.List<String> getImpairedZoneIds() {
            return this.impairedZoneIds;
        }

        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions setZoneShiftPolicy(DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy zoneShiftPolicy) {
            this.zoneShiftPolicy = zoneShiftPolicy;
            return this;
        }
        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptionsZoneShiftPolicy getZoneShiftPolicy() {
            return this.zoneShiftPolicy;
        }

    }

    public static class DescribeScalingGroupDetailResponseBodyScalingGroup extends TeaModel {
        /**
         * <p>The number of ECS instances that have been added to the scaling group and are running properly.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ActiveCapacity")
        public Integer activeCapacity;

        /**
         * <p>The ID of the active scaling configuration in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-bp1et2qekq3ojr33****</p>
         */
        @NameInMap("ActiveScalingConfigurationId")
        public String activeScalingConfigurationId;

        /**
         * <p>The information about the Application Load Balancer (ALB) server groups.</p>
         */
        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupAlbServerGroups> albServerGroups;

        /**
         * <p>The allocation strategy that determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit price of vCPUs from low to high.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>priority</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>true: The capacity of the scaling group is evenly distributed across multiple zones.</li>
         * <li>false: The capacity of the scaling group is not evenly distributed across multiple zones.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AzBalance")
        public Boolean azBalance;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when the number of spot instances cannot be met due to insufficient inventory or price limits. This parameter takes effect only when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The time when the scaling group was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>hostname</p>
         */
        @NameInMap("CurrentHostName")
        public String currentHostName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy in RemovalPolicies is set to CustomPolicy.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        /**
         * <p>The IDs of the ApsaraDB RDS instances associated with the scaling group.</p>
         */
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        /**
         * <p>The cooldown time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        /**
         * <p>The expected number of instances in the scaling group. The scaling group automatically maintains the number of ECS instances at this expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>Indicates whether the expected number of instances feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The expected number of instances feature is enabled.</li>
         * <li>false: The expected number of instances feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDesiredCapacity")
        public Boolean enableDesiredCapacity;

        /**
         * <p>Specifies whether deletion protection is enabled for the scaling group. Valid values:</p>
         * <ul>
         * <li>true: Deletion protection is enabled. The scaling group cannot be deleted.</li>
         * <li>false: Deletion protection is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GroupDeletionProtection")
        public Boolean groupDeletionProtection;

        /**
         * <p>The type of instances managed by the scaling group. Valid values:</p>
         * <ul>
         * <li>ECS: The scaling group manages ECS instances.</li>
         * <li>ECI: The scaling group manages ECI instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>NONE: No health check is performed.</li>
         * <li>ECS: Health checks are performed on instances in the scaling group. This value applies to both ECS and Elastic Container Instance (ECI) scaling groups.</li>
         * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (the CLB load balancing type is currently not supported).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>NONE: No health check is performed.</li>
         * <li>ECS: Health checks are performed on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
         * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (CLB load balancing is currently not supported).</li>
         * </ul>
         */
        @NameInMap("HealthCheckTypes")
        public java.util.List<String> healthCheckTypes;

        /**
         * <p>The number of instances in the scaling group that are in the initialization state before scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InitCapacity")
        public Integer initCapacity;

        /**
         * <p>This parameter is not available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        /**
         * <p>The ID of the launch template used by the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-m5e3ofjr1zn1aw7****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The instance type overrides for the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The lifecycle state of the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: The scaling group is active. Only active scaling groups can accept requests to execute scaling rules and trigger a scaling activity.</li>
         * <li>Inactive: The scaling group is inactive. Inactive scaling groups do not accept any requests to execute scaling rules.</li>
         * <li>Deleting: The scaling group is being deleted. Scaling groups in the Deleting state do not accept any requests to execute scaling rules, and their parameters cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The list of load balancing configurations.</p>
         */
        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupLoadBalancerConfigs> loadBalancerConfigs;

        /**
         * <p>The IDs of the load balancing instances associated with the scaling group.</p>
         */
        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        /**
         * <p>The maximum lifetime of instances in the scaling group. Unit: seconds.
         * Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the MaxInstanceLifetime value is cleared, which means MaxInstanceLifetime is not configured.
         * Default value: null.</p>
         * <blockquote>
         * <p>This parameter is not supported for ECI scaling groups or scaling groups that have the economical mode enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("MaxInstanceLifetime")
        public Integer maxInstanceLifetime;

        /**
         * <p>The maximum number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The minimum number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        /**
         * <p>The time when the scaling group was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The ID of the CloudMonitor application group associated with the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1497****</p>
         */
        @NameInMap("MonitorGroupId")
        public String monitorGroupId;

        /**
         * <p>The scale-out and scale-in policy for ECS instances in a multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li>PRIORITY: Scales instances based on the defined vSwitches (VSwitchIds). If ECS instances cannot be created in the active zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</li>
         * <li>COST_OPTIMIZED: Attempts to create instances based on the unit price of vCPUs from low to high. If the scaling configuration settings specify multiple instance types that use the spot billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory.<blockquote>
         * <p>COST_OPTIMIZED is active only when the scaling configuration settings specify multiple instance types or use spot instances.</p>
         * </blockquote>
         * </li>
         * <li>BALANCE: Evenly allocates ECS instances across the active zones specified for the scaling group. If the distribution across active zones becomes unbalanced due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("MultiAZPolicy")
        public String multiAZPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. When the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances to create when the number of instances exceeds the base capacity specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The number of ECS instances that are being added to the scaling group but have not completed the relevant configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        /**
         * <p>The number of ECS instances that are in the Pending Wait state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PendingWaitCapacity")
        public Integer pendingWaitCapacity;

        /**
         * <p>The number of ECS instances that are in the Protected state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectedCapacity")
        public Integer protectedCapacity;

        /**
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The scale-in policies used to remove instances from the scaling group.</p>
         */
        @NameInMap("RemovalPolicies")
        public java.util.List<String> removalPolicies;

        /**
         * <p>The number of ECS instances that are being removed from the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemovingCapacity")
        public Integer removingCapacity;

        /**
         * <p>The number of ECS instances that are in the Removing Wait state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemovingWaitCapacity")
        public Integer removingWaitCapacity;

        /**
         * <p>The ID of the resource group to which the new scaling group belongs.</p>
         * <blockquote>
         * <p>Assigns the new scaling group to the specified resource group. If this parameter is not specified, the scaling group belongs to the default resource group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2epf32c4uyji</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp14wlu85wrpchm0****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The name of the scaling group. The name must be unique within a region. It must be 2 to 64 characters in length and start with a digit, a letter, or a Chinese character. It can contain digits, underscores (_), hyphens (-), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>dyrSuvBOtO1dEdIlIbp****</p>
         */
        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        /**
         * <p>The reclaim mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>recycle: The scaling group uses the shutdown reclaim mode.</li>
         * <li>release: The scaling group uses the release mode.</li>
         * <li>forcerelease: The scaling group uses the force release mode.</li>
         * <li>forcerecycle: The scaling group uses the force shutdown reclaim mode.
         * For more information about the actions on removed instances, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>recycle</p>
         */
        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        /**
         * <p>The information about the load balancing server groups.</p>
         * <blockquote>
         * <p>You can use this parameter to obtain information about the ALB service groups, NLB server groups, and GWLB service groups associated with the scaling group.</p>
         * </blockquote>
         */
        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupServerGroups> serverGroups;

        /**
         * <p>The allocation strategy that determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit price of vCPUs from low to high.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lowestPrice</p>
         */
        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        /**
         * <p>The number of available instance types. The scaling group creates spot instances of multiple instance types that have the lowest costs and distributes the instances evenly. Valid values: 0 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>Specifies whether to enable the spot instance replenishment feature. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The number of instances that are in the Standby state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandbyCapacity")
        public Integer standbyCapacity;

        /**
         * <p>The number of instances in the scaling group that are in the economical mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        /**
         * <p>The suspended processes. If no process is suspended, an empty value is returned. Valid values:</p>
         * <ul>
         * <li>ScaleIn: The scale-in process.</li>
         * <li>ScaleOut: The scale-out process.</li>
         * <li>HealthCheck: The health check process.</li>
         * <li>AlarmNotification: The event-triggered task process.</li>
         * <li>ScheduledAction: The scheduled task process.</li>
         * </ul>
         */
        @NameInMap("SuspendedProcesses")
        public java.util.List<String> suspendedProcesses;

        /**
         * <p>Specifies whether Auto Scaling stops executing the scaling activity in the scaling group. Valid values:</p>
         * <ul>
         * <li><p>true: Auto Scaling stops executing the scaling activity in the scaling group. This indicates that the scaling group has failed to execute scale-out and scale-in for more than 7 consecutive days. You must modify the scaling group or scaling configuration to recover the execution of the scaling activity.</p>
         * </li>
         * <li><p>false: Auto Scaling executes the scaling activity in the scaling group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SystemSuspended")
        public Boolean systemSuspended;

        /**
         * <p>The collection of tags for the scaling group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupTags> tags;

        /**
         * <p>The total weighted capacity of all instances in the scaling group if instance type weights are configured. Otherwise, this parameter indicates the total number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        /**
         * <p>The total number of ECS instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        /**
         * <p>The list of backend server groups.</p>
         */
        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupDetailResponseBodyScalingGroupVServerGroups> VServerGroups;

        /**
         * <p>The ID of the vSwitch associated with the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1whw2u46cn8zubm****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The IDs of the vSwitches associated with the scaling group. If you specify the VSwitchIds parameter, the VSwitchId parameter is ignored.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9fcq97y1vqkd8bijcq6</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone shift options.</p>
         */
        @NameInMap("ZoneShiftOptions")
        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions zoneShiftOptions;

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

        public DescribeScalingGroupDetailResponseBodyScalingGroup setZoneShiftOptions(DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions zoneShiftOptions) {
            this.zoneShiftOptions = zoneShiftOptions;
            return this;
        }
        public DescribeScalingGroupDetailResponseBodyScalingGroupZoneShiftOptions getZoneShiftOptions() {
            return this.zoneShiftOptions;
        }

    }

}
