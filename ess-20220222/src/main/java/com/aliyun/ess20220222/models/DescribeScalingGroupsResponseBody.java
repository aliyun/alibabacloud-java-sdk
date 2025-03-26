// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling groups.</p>
     */
    @NameInMap("ScalingGroups")
    public java.util.List<DescribeScalingGroupsResponseBodyScalingGroups> scalingGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by an ECS instance as a backend server in the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an ECS instance as a backend server in the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

    public static class DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions extends TeaModel {
        /**
         * <p>Indicates whether pay-as-you-go ECS instances can be automatically created to reach the required number of ECS instances when preemptible ECS instances cannot be created due to high prices or insufficient inventory of resources. This parameter takes effect when you set <code>MultiAZPolicy</code> to <code>COST_OPTIMIZED</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. When the actual number of pay-as-you-go instances drops below the minimum threshold, Auto Scaling preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances is reached. <code>OnDemandBaseCapacity</code> specifies the minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>Indicates how prices are compared. Valid values:</p>
         * <ul>
         * <li><p>PricePerUnit: Prices are compared based on the price per instance capacity.</p>
         * <p>Capacity is determined by the weights assigned to instance types in the scaling group. If no weight is specified, a default weight of 1 is used, meaning each instance is assigned a capacity of 1.</p>
         * </li>
         * <li><p>PricePerVCpu: Prices are compared based on the price per vCPU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PricePerUnit</p>
         */
        @NameInMap("PriceComparisonMode")
        public String priceComparisonMode;

        /**
         * <p>Specifies whether to replace pay-as-you-go ECS instances with preemptible ECS instances. If you specify <code>CompensateWithOnDemand</code>, it may result in a higher percentage of pay-as-you-go instances compared to the value of <code>OnDemandPercentageAboveBaseCapacity</code>. In this scenario, Auto Scaling will try to deploy preemptible ECS instances to replace the surplus pay-as-you-go ECS instances. When <code>CompensateWithOnDemand</code> is specified, Auto Scaling creates pay-as-you-go ECS instances if there are not enough preemptible instance types available. To avoid keeping these pay-as-you-go ECS instances for long periods, Auto Scaling tries to replace them with preemptible instances as soon as enough of preemptible instance types become available. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SpotAutoReplaceOnDemand")
        public Boolean spotAutoReplaceOnDemand;

        public static DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions self = new DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions setPriceComparisonMode(String priceComparisonMode) {
            this.priceComparisonMode = priceComparisonMode;
            return this;
        }
        public String getPriceComparisonMode() {
            return this.priceComparisonMode;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions setSpotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
            this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
            return this;
        }
        public Boolean getSpotAutoReplaceOnDemand() {
            return this.spotAutoReplaceOnDemand;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsDBInstances extends TeaModel {
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eqju85s45mu0***</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The IDs of the security groups that are added to the security group whitelist of the attached database.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li>RDS.</li>
         * <li>Redis.</li>
         * <li>MongoDB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeScalingGroupsResponseBodyScalingGroupsDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsDBInstances self = new DescribeScalingGroupsResponseBodyScalingGroupsDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsDBInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsDBInstances setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsDBInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>The instance type. The instance type that is specified by this parameter overrides the instance type that is specified in the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum bid price of the instance type that is specified by <code>LaunchTemplateOverride.InstanceType</code>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you use <code>LaunchTemplateId</code> to specify a launch template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The weight of the instance type. The value of this parameter indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zep8alpq5zq1a2xwyxxx</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of an ECS instance as a backend server in the CLB server group. An increase in the weight of an ECS instance indicates an increase in the number of access requests that are forwarded to the ECS instance. If you set the weight of an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The port number used by an ECS instance as a backend server in the server group.</p>
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
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li>ALB</li>
         * <li>NLB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of an ECS instance as a backend server in the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>Indicates whether the tags of the scaling group can be propagated to instances. Valid values:</p>
         * <ul>
         * <li>true: The tags of the scaling group can be propagated only to new instances.</li>
         * <li>false: The tags of the scaling group cannot be propagated to instances.</li>
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

        public static DescribeScalingGroupsResponseBodyScalingGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsTags self = new DescribeScalingGroupsResponseBodyScalingGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsTags setPropagate(Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        public Boolean getPropagate() {
            return this.propagate;
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
        /**
         * <p>The port number that is used by the load balancer to provide external services.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp12bjrny****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of the backend vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ID of the load balancer to which the backend vServer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>147b46d767c-cn-qingdao-cm5****</p>
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
         * <p>The Application Load Balancer (ALB) server groups.</p>
         */
        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> albServerGroups;

        /**
         * <p>The instance allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of preemptible instances. The policy is suitable for pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
         * <ul>
         * <li>priority: Auto Scaling adopts the predefined instance type sequence to create the required number of preemptible instances.</li>
         * <li>lowestPrice: Auto Scaling selects instance types that have the most economical vCPU pricing to create the required number of instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>priority</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>Indicates whether instances in the scaling group are evenly distributed across the specified zones. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AzBalance")
        public Boolean azBalance;

        /**
         * <p>The capacity options.</p>
         */
        @NameInMap("CapacityOptions")
        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions capacityOptions;

        /**
         * <p>Indicates whether Auto Scaling can create pay-as-you-go instances to supplement preemptible instances if preemptible instances cannot be created due to price-related factors or insufficient inventory when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The time when the scaling group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <blockquote>
         * <p> This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hostname</p>
         */
        @NameInMap("CurrentHostName")
        public String currentHostName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the function that is specified in the custom scale-in policy. This parameter takes effect only if you set the first value of RemovalPolicies to CustomPolicy.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
         */
        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        /**
         * <p>The IDs of the ApsaraDB RDS instances that are attached to the scaling group.</p>
         */
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        /**
         * <p>The databases that are attached to the scaling group.</p>
         */
        @NameInMap("DBInstances")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsDBInstances> DBInstances;

        /**
         * <p>The cooldown period of the scaling group. During the cooldown period, Auto Scaling does not execute the scaling activities that are triggered by <a href="https://help.aliyun.com/document_detail/35170.html">CloudMonitor</a> event-triggered tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        /**
         * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>Indicates whether the Expected Number of Instances feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableDesiredCapacity")
        public Boolean enableDesiredCapacity;

        /**
         * <p>Indicates whether the Deletion Protection feature is enabled for the scaling group. Valid values:</p>
         * <ul>
         * <li>true: The Deletion Protection feature is enabled for the scaling group. The scaling group cannot be deleted.</li>
         * <li>false: The Deletion Protection feature is disabled for the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GroupDeletionProtection")
        public Boolean groupDeletionProtection;

        /**
         * <p>The type of instances that are managed by the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The health check mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>NONE: Auto Scaling does not perform health checks.</li>
         * <li>ECS: Auto Scaling checks the health status of instances in the scaling group. If you want to enable instance health check, you can set the value to ECS, regardless of whether the scaling group is of ECS type or Elastic Container Instance type.</li>
         * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB) instances are not supported as the health check basis for instances in the scaling group.</li>
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
         * <li>NONE: Auto Scaling does not perform health checks.</li>
         * <li>ECS: Auto Scaling checks the health status of instances in the scaling group. If you want to enable instance health check, you can set the value to ECS, regardless of whether the scaling group is of ECS type or Elastic Container Instance type.</li>
         * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.</li>
         * </ul>
         */
        @NameInMap("HealthCheckTypes")
        public java.util.List<String> healthCheckTypes;

        /**
         * <p>The number of instances that are initialized before they are added into the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InitCapacity")
        public Integer initCapacity;

        /**
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsElasticStrengthInAlarm")
        public Boolean isElasticStrengthInAlarm;

        /**
         * <p>The ID of the launch template that is used by the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-m5e3ofjr1zn1aw7****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The instance types that are extended in the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version of the launch template that is used by the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The status of the scaling group. Valid values:</p>
         * <ul>
         * <li>Active: The scaling group is active. Active scaling groups can receive requests to execute scaling rules and trigger scaling activities.</li>
         * <li>Inactive: The scaling group is in the Disabled state. Disabled scaling groups cannot receive requests to execute scaling rules.</li>
         * <li>Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules, and the parameter settings of the scaling groups cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The load balancer configurations.</p>
         */
        @NameInMap("LoadBalancerConfigs")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> loadBalancerConfigs;

        /**
         * <p>The IDs of the load balancers that are attached to the scaling group.</p>
         */
        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        /**
         * <p>The maximum life span of each ECS instance in the scaling group. Unit: seconds.</p>
         * <p>Valid values: 0 or <code>[86400, Integer.maxValue]</code>. A value of 0 for MaxInstanceLifetime indicates that a previously set limit has been removed. This effectively disables the maximum instance lifetime constraint.</p>
         * <p>Default value: null.</p>
         * <blockquote>
         * <p> This parameter is not supported by scaling groups of the Elastic Container Instance type and scaling groups whose ScalingPolicy is set to Recycle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MaxInstanceLifetime")
        public Integer maxInstanceLifetime;

        /**
         * <p>The maximum number of ECS instances that can be contained in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The minimum number of ECS instances that must be contained in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinSize")
        public Integer minSize;

        /**
         * <p>The time when the scaling group was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-08-14T10:58Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The ID of the CloudMonitor application group that is associated with the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1497****</p>
         */
        @NameInMap("MonitorGroupId")
        public String monitorGroupId;

        /**
         * <p>The scaling policy of the ECS instances in the multi-zone scaling group. Valid values:</p>
         * <ul>
         * <li><p>PRIORITY: ECS instances are created based on the value of VSwitchIds. If Auto Scaling cannot create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch of the next highest priority resides.</p>
         * </li>
         * <li><p>COST_OPTIMIZED: ECS instances are created based on the unit prices of their vCPUs. Auto Scaling preferentially creates ECS instances whose vCPUs are provided at the lowest price. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances if preemptible instances cannot be created due to limited stock.</p>
         * <p>**</p>
         * <p><strong>Note</strong> The COST_OPTIMIZED setting takes effect only if your scaling configuration contains multiple instance types or contains preemptible instance types.</p>
         * </li>
         * <li><p>BALANCE: ECS instances are evenly distributed across the zones that are specified for the scaling group. If ECS instances become unevenly distributed across the specified zones due to limited instance type availability, you can call the RebalanceInstance operation to balance the distribution of the ECS instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("MultiAZPolicy")
        public String multiAZPolicy;

        /**
         * <p>The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances in excess when the minimum number of pay-as-you-go instances reaches the threshold. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The number of ECS instances that are being added to the scaling group and configured.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        /**
         * <p>The number of ECS instances that are in the Pending Add state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance removal policies. Valid values:</p>
         * <ul>
         * <li>OldestInstance: Auto Scaling removes ECS instances that are added at the earliest point in time to the scaling group.</li>
         * <li>NewestInstance: Auto Scaling removes ECS instances that are most recently added to the scaling group.</li>
         * <li>OldestScalingConfiguration: Auto Scaling removes ECS instances that are created from the earliest scaling configuration.</li>
         * </ul>
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
         * <p>The number of ECS instances that are in the Pending Remove state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemovingWaitCapacity")
        public Integer removingWaitCapacity;

        /**
         * <p>The ID of the resource group to which the scaling group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123****</p>
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
         * <p>The name of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>dyrSuvBOtO1dEdIlIbp****</p>
         */
        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        /**
         * <p>The instance reclaim mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>recycle: economical mode.</li>
         * <li>release: release mode.</li>
         * <li>forcerelease: forced release mode.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>recycle</p>
         */
        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        /**
         * <p>The server groups.</p>
         * <blockquote>
         * <p> You can use this parameter to obtain information about ALB server groups and Network Load Balancer (NLB) server groups attached to the scaling group.</p>
         * </blockquote>
         */
        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> serverGroups;

        /**
         * <p>The allocation policy of preemptible instances. This parameter indicates the manner in which Auto Scaling selects instance types to create the required number of preemptible instances. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
         * <ul>
         * <li>priority: Auto Scaling adopts the predefined instance type sequence to create the required number of preemptible instances.</li>
         * <li>lowestPrice: Auto Scaling selects instance types that have the most economical vCPU pricing to create the required number of preemptible instances.</li>
         * </ul>
         * <p>Default value: priority.</p>
         * 
         * <strong>example:</strong>
         * <p>lowestPrice</p>
         */
        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        /**
         * <p>The number of preemptible instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpotCapacity")
        public Integer spotCapacity;

        /**
         * <p>The number of instance types in the scaling group. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest price across the zones of the scaling group. Valid values: 0 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling proactively creates instances to replace the preemptible instances for reclamation when Auto Scaling receives a system notification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The number of ECS instances that are in the Standby state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandbyCapacity")
        public Integer standbyCapacity;

        /**
         * <p>The period of time that is required by the Elastic Compute Service (ECS) instance to enter the Stopped state during the scale-in process. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("StopInstanceTimeout")
        public Integer stopInstanceTimeout;

        /**
         * <p>The number of instances that was stopped in Economical Mode in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        /**
         * <p>The processes that are suspended. If no process is suspended, null is returned. Valid values:</p>
         * <ul>
         * <li>ScaleIn: scale-in processes.</li>
         * <li>ScaleOut: scale-out processes.</li>
         * <li>HealthCheck: health check processes.</li>
         * <li>AlarmNotification: event-triggered task processes.</li>
         * <li>ScheduledAction: scheduled task processes.</li>
         * </ul>
         */
        @NameInMap("SuspendedProcesses")
        public java.util.List<String> suspendedProcesses;

        /**
         * <p>Indicates whether Auto Scaling stops executing scaling activities in the scaling group. Valid values:</p>
         * <ul>
         * <li>true: Auto Scaling stops executing scaling activities in the scaling group if the scaling activities failed for more than seven consecutive days in the scaling group. In this case, you must modify the scaling group or scaling configuration to resume the scaling activities.</li>
         * <li>false: Auto Scaling does not stop executing scaling activities in the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SystemSuspended")
        public Boolean systemSuspended;

        /**
         * <p>The tags of the scaling group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsTags> tags;

        /**
         * <p>The total weighted capacity of all ECS instances in the scaling group if Weighted is specified. In other cases, this parameter specifies the total number of ECS instances in the scaling group.</p>
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
         * <p>The backend vServer groups.</p>
         */
        @NameInMap("VServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> VServerGroups;

        /**
         * <p>The vSwitch ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1whw2u46cn8zubm****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The IDs of the vSwitches that are associated with the scaling group. If you specify VSwitchIds, VSwitchId is ignored.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the scaling group resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
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

        public DescribeScalingGroupsResponseBodyScalingGroups setCapacityOptions(DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions capacityOptions) {
            this.capacityOptions = capacityOptions;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions getCapacityOptions() {
            return this.capacityOptions;
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

        public DescribeScalingGroupsResponseBodyScalingGroups setDBInstances(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsDBInstances> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsDBInstances> getDBInstances() {
            return this.DBInstances;
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

        public DescribeScalingGroupsResponseBodyScalingGroups setHealthCheckTypes(java.util.List<String> healthCheckTypes) {
            this.healthCheckTypes = healthCheckTypes;
            return this;
        }
        public java.util.List<String> getHealthCheckTypes() {
            return this.healthCheckTypes;
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

        public DescribeScalingGroupsResponseBodyScalingGroups setSpotCapacity(Integer spotCapacity) {
            this.spotCapacity = spotCapacity;
            return this;
        }
        public Integer getSpotCapacity() {
            return this.spotCapacity;
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

        public DescribeScalingGroupsResponseBodyScalingGroups setStopInstanceTimeout(Integer stopInstanceTimeout) {
            this.stopInstanceTimeout = stopInstanceTimeout;
            return this;
        }
        public Integer getStopInstanceTimeout() {
            return this.stopInstanceTimeout;
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
