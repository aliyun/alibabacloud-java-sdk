// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
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
     * <p>The total number of scaling groups.</p>
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
         * <p>The port number used by the ECS instance after Auto Scaling adds the ECS instance to the ALB server group.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the ALB server group.</p>
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
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CompensateWithOnDemand")
        public Boolean compensateWithOnDemand;

        /**
         * <p>The minimum number of pay-as-you-go instances required in the scaling group. If the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The price comparison mode of the cost optimization strategy for the scaling group. Valid values:</p>
         * <ul>
         * <li><p>PricePerUnit: Compares prices based on the price per unit of capacity.</p>
         * <p>The capacity of an instance in the scaling group is equal to the weight set for the instance type. The default weight is 1, which means one ECS instance occupies one unit of capacity.</p>
         * </li>
         * <li><p>PricePerVCpu: Compares prices based on the price per vCPU.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PricePerUnit</p>
         */
        @NameInMap("PriceComparisonMode")
        public String priceComparisonMode;

        /**
         * <p>Specifies whether to use spot instances to replace pay-as-you-go capacity when CompensateWithOnDemand is enabled and the percentage of pay-as-you-go instances exceeds the value of OnDemandPercentageAboveBaseCapacity. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this feature attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term retention of pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed.</li>
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
         * <p>The database instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5eqju85s45mu0***</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The list of security group whitelists added to the database by the scaling group.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li>RDS</li>
         * <li>Redis</li>
         * <li>MongoDB</li>
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
         * <p>The specified instance type, which overrides the instance type in the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price for the instance type specified in the launch template override (namely LaunchTemplateOverride.InstanceType).</p>
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
         * <p>The weight of the specified instance type, which indicates the capacity of a single instance of this type in the scaling group. A higher weight indicates that fewer instances of this type are required to meet the expected capacity.</p>
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
         * <p>The ID of the Classic Load Balancer (CLB) instance for load balancing.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zep8alpq5zq1a2xwyxxx</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the SLB server group. A higher weight indicates that more access requests are distributed to the ECS instance. If the weight is 0, the ECS instance does not receive access requests. Valid values: 0 to 100.</p>
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
         * <p>The port number used by the ECS instance after Auto Scaling adds the ECS instance to the server group.</p>
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
         * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the server group.</p>
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
         * <p>Specifies whether the tag is propagated. Valid values:</p>
         * <ul>
         * <li>true: Tags on the scaling group are propagated only to newly created instances, but not to existing instances in the scaling group.</li>
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
         * <p>The port number used by the load balancing instance to provide services.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The attributes of the backend server group.</p>
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
         * <p>The ID of the load balancing instance to which the backend server group belongs.</p>
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

    public static class DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions extends TeaModel {
        /**
         * <p>The expected number of pre-warmed instances to cover. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DesiredGroupPreparedCapacity")
        public Integer desiredGroupPreparedCapacity;

        /**
         * <p>The minimum number of instances in the warm pool. The system always retains no less than this number of pre-warmed instances in the warm pool to ensure rapid scale-out from the warm pool at any time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCapacity")
        public Integer minCapacity;

        public static DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions self = new DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions setDesiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
            this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
            return this;
        }
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy extends TeaModel {
        /**
         * <p>Specifies whether instances are returned to the warm pool when the scaling group scales in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReuseOnScaleIn")
        public Boolean reuseOnScaleIn;

        public static DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy self = new DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy setReuseOnScaleIn(Boolean reuseOnScaleIn) {
            this.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }
        public Boolean getReuseOnScaleIn() {
            return this.reuseOnScaleIn;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration extends TeaModel {
        /**
         * <p>The capacity configuration of the warm pool.</p>
         */
        @NameInMap("CapacityOptions")
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions capacityOptions;

        /**
         * <p>The instance reuse policy.</p>
         */
        @NameInMap("InstanceReusePolicy")
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy instanceReusePolicy;

        /**
         * <p>The state of instances in the warm pool. Valid values:</p>
         * <ul>
         * <li><p>Running: The instances are in the running state. Scale-out is faster, but you are charged for the full cost of the instances.</p>
         * </li>
         * <li><p>Stopped: The instances are in the economical mode. You are charged only for resources such as cloud disks, elastic IP addresses (EIPs), and snapshots of the instances. However, instance startup may fail during scale-out due to insufficient inventory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("PoolState")
        public String poolState;

        /**
         * <p>The status of the warm pool. Valid values:</p>
         * <ul>
         * <li><p>Active: Active.</p>
         * </li>
         * <li><p>Deleting: Deleting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration self = new DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration setCapacityOptions(DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions capacityOptions) {
            this.capacityOptions = capacityOptions;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationCapacityOptions getCapacityOptions() {
            return this.capacityOptions;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration setInstanceReusePolicy(DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy instanceReusePolicy) {
            this.instanceReusePolicy = instanceReusePolicy;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfigurationInstanceReusePolicy getInstanceReusePolicy() {
            return this.instanceReusePolicy;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration setPoolState(String poolState) {
            this.poolState = poolState;
            return this;
        }
        public String getPoolState() {
            return this.poolState;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy extends TeaModel {
        /**
         * <p>The health check behavior in impaired zones. Valid values: </p>
         * <ul>
         * <li>ReplaceUnhealthy: Unhealthy instances in all zones are replaced normally.</li>
         * <li>IgnoreUnhealthy: Unhealthy instances in impaired zones are not replaced. Healthy zones are not affected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReplaceUnhealthy</p>
         */
        @NameInMap("ImpairedZoneHealthCheckBehavior")
        public String impairedZoneHealthCheckBehavior;

        /**
         * <p>Blocks scale-in triggered by specified types of scaling rules. The blocking scope covers all zones under the scaling group, not just the impaired zones. This prevents false scale-in caused by seemingly improved monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
         * <ul>
         * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
         * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
         * <li>None: No blocking.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StepScalingRule</p>
         */
        @NameInMap("ScaleInBlockedRuleTypes")
        public java.util.List<String> scaleInBlockedRuleTypes;

        /**
         * <p>Specifies whether scale-out creates instances only in healthy zones during the shift. Valid values: </p>
         * <ul>
         * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
         * <li>false: Scale-out is not restricted by zone and can create instances in any zone under the scaling group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScaleOutInHealthyZonesOnly")
        public Boolean scaleOutInHealthyZonesOnly;

        public static DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy self = new DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy setImpairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
            this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
            return this;
        }
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy setScaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
            this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
            return this;
        }
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy setScaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
            this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
            return this;
        }
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions extends TeaModel {
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
        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy zoneShiftPolicy;

        public static DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions self = new DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions setImpairedZoneIds(java.util.List<String> impairedZoneIds) {
            this.impairedZoneIds = impairedZoneIds;
            return this;
        }
        public java.util.List<String> getImpairedZoneIds() {
            return this.impairedZoneIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions setZoneShiftPolicy(DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy zoneShiftPolicy) {
            this.zoneShiftPolicy = zoneShiftPolicy;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptionsZoneShiftPolicy getZoneShiftPolicy() {
            return this.zoneShiftPolicy;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroups extends TeaModel {
        /**
         * <p>The number of ECS instances that have been added to the scaling group and are running normally.</p>
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
         * <p>The collection of information about Application Load Balancer (ALB) server groups.</p>
         */
        @NameInMap("AlbServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsAlbServerGroups> albServerGroups;

        /**
         * <p>The capacity allocation strategy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit vCPU price of the instance types in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>priority</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for the zone balance scaling group. Valid values:</p>
         * <ul>
         * <li>false: Automatic balancing for the scaling group is disabled.</li>
         * <li>true: Automatic balancing for the scaling group is enabled. The scaling group automatically detects the capacity across zones. If the capacity is unbalanced, the scaling group proactively scales in or out to rebalance the capacity across zones.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRebalance")
        public Boolean autoRebalance;

        /**
         * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
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
         * <p>The zone balance mode. This parameter takes effect only when the zone balance mode is enabled. Valid values:</p>
         * <ul>
         * <li><p>BalancedBestEffort: If resource creation fails in a zone, the system falls back to other zones to ensure best-effort delivery of resources.</p>
         * </li>
         * <li><p>BalancedOnly: If resource creation fails in a zone, the system does not fall back to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BalancedBestEffort</p>
         */
        @NameInMap("BalanceMode")
        public String balanceMode;

        /**
         * <p>The capacity options.</p>
         */
        @NameInMap("CapacityOptions")
        public DescribeScalingGroupsResponseBodyScalingGroupsCapacityOptions capacityOptions;

        /**
         * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirement for the number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and spot instances cannot be created due to price or inventory issues. Valid values:</p>
         * <ul>
         * <li>true: Allowed.</li>
         * <li>false: Not allowed.</li>
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
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
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
         * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
         */
        @NameInMap("CustomPolicyARN")
        public String customPolicyARN;

        /**
         * <p>The IDs of the ApsaraDB RDS instances associated with the scaling group.</p>
         */
        @NameInMap("DBInstanceIds")
        public java.util.List<String> DBInstanceIds;

        /**
         * <p>The list of databases associated with the scaling group.</p>
         */
        @NameInMap("DBInstances")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsDBInstances> DBInstances;

        /**
         * <p>The default cooldown time of the scaling group. During the cooldown time, the scaling group does not execute any other scaling activity. This parameter takes effect only for a scaling activity triggered by <a href="https://help.aliyun.com/document_detail/35170.html">CloudMonitor</a> event-triggered tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        /**
         * <p>The expected number of ECS instances in the scaling group. The scaling group automatically maintains the number of ECS instances at the expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DesiredCapacity")
        public Integer desiredCapacity;

        /**
         * <p>Specifies whether the expected number of instances feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The expected number of instances feature is enabled.</li>
         * <li>false: The expected number of instances feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableDesiredCapacity")
        public Boolean enableDesiredCapacity;

        /**
         * <p>Indicates whether deletion protection is enabled for the scaling group. Valid values:</p>
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
         * <p>The type of instances managed by the scaling group.</p>
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
         * <li>ECS: Health checks are performed on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
         * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (CLB load balancing is not supported).</li>
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
         * <li>LOAD_BALANCER: The health status of instances is determined based on the load balancing health check results (the CLB load balancing type is not currently supported).</li>
         * </ul>
         */
        @NameInMap("HealthCheckTypes")
        public java.util.List<String> healthCheckTypes;

        /**
         * <p>The number of instances in the initialization state before scale-out in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InitCapacity")
        public Integer initCapacity;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
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
         * <p>The instance type information that extends the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version of the launch template used by the scaling group.</p>
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
         * <li>Inactive: The scaling group is inactive. Inactive scaling groups do not receive any requests to execute scaling rules.</li>
         * <li>Deleting: The scaling group is being deleted. Scaling groups in the deleting state do not receive any requests to execute scaling rules, and their parameters cannot be modified.</li>
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
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsLoadBalancerConfigs> loadBalancerConfigs;

        /**
         * <p>The list of IDs of the load balancing instances associated with the scaling group.</p>
         */
        @NameInMap("LoadBalancerIds")
        public java.util.List<String> loadBalancerIds;

        /**
         * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
         * <p>Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the configured value of MaxInstanceLifetime is cleared, which means MaxInstanceLifetime is not configured.</p>
         * <p>Default value: null.</p>
         * <blockquote>
         * <p>This parameter is not supported for scaling groups of the Elastic Container Instance (ECI) type or scaling groups that have the No Fees for Stopped Instances feature enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("MaxInstanceLifetime")
        public Integer maxInstanceLifetime;

        /**
         * <p>The maximum number of ECS instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxSize")
        public Integer maxSize;

        /**
         * <p>The minimum number of ECS instances in the scaling group.</p>
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
         * <li>PRIORITY: Scales out and scales in instances based on the vSwitches defined in VSwitchIds. If ECS instances cannot be created in the active zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</li>
         * <li>COST_OPTIMIZED: Attempts to create instances based on the unit price of vCPUs from low to high. When the scaling configuration specifies multiple instance types with the spot billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to inventory issues.<blockquote>
         * <p>COST_OPTIMIZED takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
         * </blockquote>
         * </li>
         * <li>BALANCE: Evenly allocates ECS instances across the active zones specified for the scaling group. If the distribution becomes unbalanced due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</li>
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
         * <p>The percentage of pay-as-you-go instances to be created when the scaling group exceeds the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>The number of ECS instances that are being added to the scaling group but have not completed the related configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        /**
         * <p>The number of ECS instances that are in the pending wait state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PendingWaitCapacity")
        public Integer pendingWaitCapacity;

        /**
         * <p>The number of ECS instances that are in the protected state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectedCapacity")
        public Integer protectedCapacity;

        /**
         * <p>The ID of the region to which the scaling group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The collection of policies for removing ECS instances from the scaling group. Valid values:</p>
         * <ul>
         * <li>OldestInstance: Removes the ECS instance that was created earliest.</li>
         * <li>NewestInstance: Removes the ECS instance that was created latest.</li>
         * <li>OldestScalingConfiguration: Removes the ECS instance that was created earliest based on the scaling configuration.</li>
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
         * <p>The number of ECS instances that are in the removing wait state in the scaling group.</p>
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
         * <p>The reclaim mode of the scaling group. Valid values:</p>
         * <ul>
         * <li>recycle: The scaling group uses the shutdown and reclaim mode.</li>
         * <li>release: The scaling group uses the release mode.</li>
         * <li>forcerelease: The scaling group uses the force release mode.
         * For more information about the actions on removed instances, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>recycle</p>
         */
        @NameInMap("ScalingPolicy")
        public String scalingPolicy;

        /**
         * <p>The collection of information about load balancing server groups.</p>
         * <blockquote>
         * <p>You can use this parameter to obtain the collection of information about ALB service groups, NLB server groups, and GWLB service groups associated with the scaling group.</p>
         * </blockquote>
         */
        @NameInMap("ServerGroups")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsServerGroups> serverGroups;

        /**
         * <p>The spot capacity distribution strategy. You can use this parameter to separately specify the distribution strategy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
         * <ul>
         * <li>priority: Creates instances based on the order of the configured instance types.</li>
         * <li>lowestPrice: Creates instances based on the unit vCPU price of the instance types in ascending order.</li>
         * </ul>
         * <p>Default value: priority.</p>
         * 
         * <strong>example:</strong>
         * <p>lowestPrice</p>
         */
        @NameInMap("SpotAllocationStrategy")
        public String spotAllocationStrategy;

        /**
         * <p>The number of spot instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpotCapacity")
        public Integer spotCapacity;

        /**
         * <p>The number of available instance types specified. The scaling group evenly creates spot instances based on the most cost-effective instance types. Valid values: 0 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>Indicates whether the spot instance replacement feature is enabled. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        /**
         * <p>The number of instances that are in the standby state in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandbyCapacity")
        public Integer standbyCapacity;

        /**
         * <p>The timeout period for waiting for an ECS instance to be stopped during the scale-in process. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("StopInstanceTimeout")
        public Integer stopInstanceTimeout;

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
         * <p>Indicates whether Auto Scaling stops executing any scaling activity in the scaling group. Valid values:</p>
         * <ul>
         * <li>true: Auto Scaling stops executing any scaling activity in the scaling group. This indicates that the scaling group has failed to execute scale-out or scale-in for more than seven consecutive days. You must modify the scaling group or scaling configuration to resume the execution of the scaling activity.</li>
         * <li>false: Auto Scaling executes the scaling activity in the scaling group.</li>
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
         * <p>The total weighted capacity of all ECS instances in the scaling group if instance type weights are configured. Otherwise, this parameter indicates the total number of ECS instances in the scaling group.</p>
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
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsVServerGroups> VServerGroups;

        /**
         * <p>The ID of the vSwitch associated with the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1whw2u46cn8zubm****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The collection of IDs of the vSwitches associated with the scaling group. If you use the VSwitchIds parameter, the VSwitchId parameter is ignored.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC to which the scaling group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The number of instances in the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WarmPoolCapacity")
        public Integer warmPoolCapacity;

        /**
         * <p>The current warm pool configuration of the scaling group.</p>
         */
        @NameInMap("WarmPoolConfiguration")
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration warmPoolConfiguration;

        /**
         * <p>The zone shift options.</p>
         */
        @NameInMap("ZoneShiftOptions")
        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions zoneShiftOptions;

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

        public DescribeScalingGroupsResponseBodyScalingGroups setAutoRebalance(Boolean autoRebalance) {
            this.autoRebalance = autoRebalance;
            return this;
        }
        public Boolean getAutoRebalance() {
            return this.autoRebalance;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setAzBalance(Boolean azBalance) {
            this.azBalance = azBalance;
            return this;
        }
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setBalanceMode(String balanceMode) {
            this.balanceMode = balanceMode;
            return this;
        }
        public String getBalanceMode() {
            return this.balanceMode;
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

        public DescribeScalingGroupsResponseBodyScalingGroups setWarmPoolCapacity(Integer warmPoolCapacity) {
            this.warmPoolCapacity = warmPoolCapacity;
            return this;
        }
        public Integer getWarmPoolCapacity() {
            return this.warmPoolCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setWarmPoolConfiguration(DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration warmPoolConfiguration) {
            this.warmPoolConfiguration = warmPoolConfiguration;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsWarmPoolConfiguration getWarmPoolConfiguration() {
            return this.warmPoolConfiguration;
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setZoneShiftOptions(DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions zoneShiftOptions) {
            this.zoneShiftOptions = zoneShiftOptions;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsZoneShiftOptions getZoneShiftOptions() {
            return this.zoneShiftOptions;
        }

    }

}
