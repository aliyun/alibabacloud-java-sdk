// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthResponseBody extends TeaModel {
    /**
     * <p>The elastic strength of the current scaling group. Valid values:</p>
     * <ul>
     * <li><p>Strong: high elastic strength.</p>
     * </li>
     * <li><p>Medium: medium elastic strength.</p>
     * </li>
     * <li><p>Weak: weak elastic strength.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Strong</p>
     */
    @NameInMap("ElasticStrength")
    public String elasticStrength;

    /**
     * <p>An array of elastic strength details, returned when the API call targets multiple scaling groups.</p>
     */
    @NameInMap("ElasticStrengthModels")
    public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> elasticStrengthModels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of resource pools. This parameter is returned when the API call targets a single scaling group.</p>
     */
    @NameInMap("ResourcePools")
    public java.util.List<DescribeElasticStrengthResponseBodyResourcePools> resourcePools;

    /**
     * <p>The total elastic strength of the scaling group. The strength is the sum of scores from all configured instance type and zone combinations. Each combination is scored from 0 (low strength) to 1 (high strength) based on resource availability.&gt;Warning:  This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("TotalStrength")
    public Double totalStrength;

    public static DescribeElasticStrengthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticStrengthResponseBody self = new DescribeElasticStrengthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticStrengthResponseBody setElasticStrength(String elasticStrength) {
        this.elasticStrength = elasticStrength;
        return this;
    }
    public String getElasticStrength() {
        return this.elasticStrength;
    }

    public DescribeElasticStrengthResponseBody setElasticStrengthModels(java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> elasticStrengthModels) {
        this.elasticStrengthModels = elasticStrengthModels;
        return this;
    }
    public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModels> getElasticStrengthModels() {
        return this.elasticStrengthModels;
    }

    public DescribeElasticStrengthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticStrengthResponseBody setResourcePools(java.util.List<DescribeElasticStrengthResponseBodyResourcePools> resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }
    public java.util.List<DescribeElasticStrengthResponseBodyResourcePools> getResourcePools() {
        return this.resourcePools;
    }

    public DescribeElasticStrengthResponseBody setTotalStrength(Double totalStrength) {
        this.totalStrength = totalStrength;
        return this;
    }
    public Double getTotalStrength() {
        return this.totalStrength;
    }

    public static class DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth extends TeaModel {
        /**
         * <p>The adequacy score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AdequacyScore")
        public Integer adequacyScore;

        /**
         * <p>The health score.</p>
         * <ul>
         * <li><p>A score from 5 to 6 indicates high confidence in supply.</p>
         * </li>
         * <li><p>A score from 1 to 4 indicates that supply is not guaranteed. Consider making on-demand reservations.</p>
         * </li>
         * <li><p>A score from -3 to 0 indicates a supply health alert. Consider using a different instance type.</p>
         * </li>
         * </ul>
         * <p>The health score is calculated using the formula: <code>HealthScore</code> = <code>AdequacyScore</code> + <code>SupplyScore</code> - <code>HotScore</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthScore")
        public Integer healthScore;

        /**
         * <p>The hot score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HotScore")
        public Integer hotScore;

        /**
         * <p>The supply score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SupplyScore")
        public Integer supplyScore;

        public static DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth self = new DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth setAdequacyScore(Integer adequacyScore) {
            this.adequacyScore = adequacyScore;
            return this;
        }
        public Integer getAdequacyScore() {
            return this.adequacyScore;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth setHealthScore(Integer healthScore) {
            this.healthScore = healthScore;
            return this;
        }
        public Integer getHealthScore() {
            return this.healthScore;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth setHotScore(Integer hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Integer getHotScore() {
            return this.hotScore;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth setSupplyScore(Integer supplyScore) {
            this.supplyScore = supplyScore;
            return this;
        }
        public Integer getSupplyScore() {
            return this.supplyScore;
        }

    }

    public static class DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools extends TeaModel {
        /**
         * <p>The error code returned when the elastic strength is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceTypesOrDiskTypesNotSupported</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The elastic strength of the resource pool, which is based on its inventory health and current stock. Valid values:</p>
         * <ul>
         * <li><p>Strong: high elastic strength.</p>
         * </li>
         * <li><p>Medium: medium elastic strength.</p>
         * </li>
         * <li><p>Weak: weak elastic strength.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Strong</p>
         */
        @NameInMap("ElasticStrength")
        public String elasticStrength;

        /**
         * <p>The instance type of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.r7.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The inventory health.</p>
         */
        @NameInMap("InventoryHealth")
        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth inventoryHealth;

        /**
         * <p>The error message returned when the elastic strength is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>The instanceTypes or diskTypes are not supported.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The availability of the resource pool. Valid values:</p>
         * <ul>
         * <li><p>Available: The resource pool is available.</p>
         * </li>
         * <li><p>Unavailable: The resource pool is unavailable. This can occur if the instance type is not deployed in the zone, has insufficient inventory, or does not meet other constraints.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The elastic strength of the resource pool.&gt;Warning:  This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        /**
         * <p>The VSwitches in the zone of the resource pool.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The zone ID of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools self = new DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setElasticStrength(String elasticStrength) {
            this.elasticStrength = elasticStrength;
            return this;
        }
        public String getElasticStrength() {
            return this.elasticStrength;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setInventoryHealth(DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth inventoryHealth) {
            this.inventoryHealth = inventoryHealth;
            return this;
        }
        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePoolsInventoryHealth getInventoryHealth() {
            return this.inventoryHealth;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setStrength(Double strength) {
            this.strength = strength;
            return this;
        }
        public Double getStrength() {
            return this.strength;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeElasticStrengthResponseBodyElasticStrengthModels extends TeaModel {
        /**
         * <p>The elastic strength of the current scaling group. Valid values:</p>
         * <ul>
         * <li><p>Strong: high elastic strength.</p>
         * </li>
         * <li><p>Medium: medium elastic strength.</p>
         * </li>
         * <li><p>Weak: weak elastic strength.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Strong</p>
         */
        @NameInMap("ElasticStrength")
        public String elasticStrength;

        /**
         * <p>Details of the resource pools within the scaling group.</p>
         */
        @NameInMap("ResourcePools")
        public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> resourcePools;

        /**
         * <p>The scaling group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-wz98mnj7nblv9gc****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The total elastic strength of the scaling group. The strength is the sum of scores from all configured instance type and zone combinations. Each combination is scored from 0 (low strength) to 1 (high strength) based on resource availability.&gt;Warning:  This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("TotalStrength")
        public Double totalStrength;

        public static DescribeElasticStrengthResponseBodyElasticStrengthModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyElasticStrengthModels self = new DescribeElasticStrengthResponseBodyElasticStrengthModels();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setElasticStrength(String elasticStrength) {
            this.elasticStrength = elasticStrength;
            return this;
        }
        public String getElasticStrength() {
            return this.elasticStrength;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setResourcePools(java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> resourcePools) {
            this.resourcePools = resourcePools;
            return this;
        }
        public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> getResourcePools() {
            return this.resourcePools;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeElasticStrengthResponseBodyElasticStrengthModels setTotalStrength(Double totalStrength) {
            this.totalStrength = totalStrength;
            return this;
        }
        public Double getTotalStrength() {
            return this.totalStrength;
        }

    }

    public static class DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth extends TeaModel {
        /**
         * <p>The adequacy score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AdequacyScore")
        public Integer adequacyScore;

        /**
         * <p>The health score.</p>
         * <ul>
         * <li><p>A score from 5 to 6 indicates high confidence in supply.</p>
         * </li>
         * <li><p>A score from 1 to 4 indicates that supply is not guaranteed. Consider making on-demand reservations.</p>
         * </li>
         * <li><p>A score from -3 to 0 indicates a supply health alert. Consider using a different instance type.</p>
         * </li>
         * </ul>
         * <p>The health score is calculated using the formula: <code>HealthScore</code> = <code>AdequacyScore</code> + <code>SupplyScore</code> - <code>HotScore</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthScore")
        public Integer healthScore;

        /**
         * <p>The hot score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HotScore")
        public Integer hotScore;

        /**
         * <p>The supply score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SupplyScore")
        public Integer supplyScore;

        public static DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth self = new DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth setAdequacyScore(Integer adequacyScore) {
            this.adequacyScore = adequacyScore;
            return this;
        }
        public Integer getAdequacyScore() {
            return this.adequacyScore;
        }

        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth setHealthScore(Integer healthScore) {
            this.healthScore = healthScore;
            return this;
        }
        public Integer getHealthScore() {
            return this.healthScore;
        }

        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth setHotScore(Integer hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Integer getHotScore() {
            return this.hotScore;
        }

        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth setSupplyScore(Integer supplyScore) {
            this.supplyScore = supplyScore;
            return this;
        }
        public Integer getSupplyScore() {
            return this.supplyScore;
        }

    }

    public static class DescribeElasticStrengthResponseBodyResourcePools extends TeaModel {
        /**
         * <p>The error code returned when the elastic strength is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>IMG_NOT_SUPPORTED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The elastic strength of the resource pool, which is based on its inventory health and current stock. Valid values:</p>
         * <ul>
         * <li><p>Strong: high elastic strength.</p>
         * </li>
         * <li><p>Medium: medium elastic strength.</p>
         * </li>
         * <li><p>Weak: weak elastic strength.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Medium</p>
         */
        @NameInMap("ElasticStrength")
        public String elasticStrength;

        /**
         * <p>The instance type of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7t.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The inventory health.</p>
         */
        @NameInMap("InventoryHealth")
        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth inventoryHealth;

        /**
         * <p>The error message returned when the elastic strength is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>The instanceType does not support the image in the configuration.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The availability of the resource pool. Valid values:</p>
         * <ul>
         * <li><p>Available: The resource pool is available.</p>
         * </li>
         * <li><p>Unavailable: The resource pool is unavailable. This can occur if the instance type is not deployed in the zone, has insufficient inventory, or does not meet other constraints.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The elastic strength of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        /**
         * <p>The VSwitches in the zone of the resource pool.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The zone ID of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeElasticStrengthResponseBodyResourcePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticStrengthResponseBodyResourcePools self = new DescribeElasticStrengthResponseBodyResourcePools();
            return TeaModel.build(map, self);
        }

        public DescribeElasticStrengthResponseBodyResourcePools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setElasticStrength(String elasticStrength) {
            this.elasticStrength = elasticStrength;
            return this;
        }
        public String getElasticStrength() {
            return this.elasticStrength;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setInventoryHealth(DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth inventoryHealth) {
            this.inventoryHealth = inventoryHealth;
            return this;
        }
        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth getInventoryHealth() {
            return this.inventoryHealth;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setStrength(Double strength) {
            this.strength = strength;
            return this;
        }
        public Double getStrength() {
            return this.strength;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeElasticStrengthResponseBodyResourcePools setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
