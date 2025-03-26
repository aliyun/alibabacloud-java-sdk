// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthResponseBody extends TeaModel {
    @NameInMap("ElasticStrength")
    public String elasticStrength;

    /**
     * <p>The scaling strength models.</p>
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
     * <p>The resource pools.</p>
     */
    @NameInMap("ResourcePools")
    public java.util.List<DescribeElasticStrengthResponseBodyResourcePools> resourcePools;

    /**
     * <p>The scaling strength score of the scaling group. Each combination of instance type + zone is scored from 0 to 1 based on its availability, with 0 being the weakest scaling strength and 1 being the strongest. The scaling strength score of the scaling group is measured by the combined scores of all the combinations of instance type + zone.</p>
     * <p>**</p>
     * <p><strong>Warning</strong> This parameter is deprecated.</p>
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
         * <p>The score of the inventory health.</p>
         * <ul>
         * <li>A score between 5 and 6 indicates a sufficient inventory.</li>
         * <li>A score between 1 and 4 indicates that there is no guarantee of a sufficient inventory. Select a reservation as necessary.</li>
         * <li>A score between -3 and 0 indicates that the inventory is sufficient, and an alert is triggered. Select another instance type.</li>
         * </ul>
         * <p>Calculation formula: <code>HealthScore</code> = <code>AdequacyScore</code> + <code>SupplyScore</code> - <code>HotScore</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthScore")
        public Integer healthScore;

        /**
         * <p>The popularity score.</p>
         * <p>Valid values: 0 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HotScore")
        public Integer hotScore;

        /**
         * <p>The score of the replenishment capability.</p>
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
         * <p>The error code returned when the scaling strength is the weakest.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceTypesOrDiskTypesNotSupported</p>
         */
        @NameInMap("Code")
        public String code;

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
         * <p>The error message returned when the scaling strength is the weakest.</p>
         * 
         * <strong>example:</strong>
         * <p>The instanceTypes or diskTypes are not supported.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the resource pool is available. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Unavailable (If a constraint is not provided, the instance type is not deployed, or the instance type is out of stock, the resource pool becomes unavailable.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scaling strength of the resource pool.</p>
         * <p>**</p>
         * <p><strong>Warning</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        /**
         * <p>The IDs of the vSwitches in the zones of the resource pool.</p>
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
         * <p>The scaling strength level of the scaling group. Valid values:</p>
         * <ul>
         * <li>Strong</li>
         * <li>Medium</li>
         * <li>Weak</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Strong</p>
         */
        @NameInMap("ElasticStrength")
        public String elasticStrength;

        /**
         * <p>The resource pools.</p>
         */
        @NameInMap("ResourcePools")
        public java.util.List<DescribeElasticStrengthResponseBodyElasticStrengthModelsResourcePools> resourcePools;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-wz98mnj7nblv9gc****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The scaling strength score of the scaling group. Each combination of instance type + zone is scored from 0 to 1 based on its availability, with 0 being the weakest scaling strength and 1 being the strongest. The scaling strength score of the scaling group is measured by the combined scores of all the combinations of instance type + zone.</p>
         * <p>**</p>
         * <p><strong>Warning</strong> This parameter is deprecated.</p>
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
        @NameInMap("AdequacyScore")
        public Integer adequacyScore;

        @NameInMap("HealthScore")
        public Integer healthScore;

        @NameInMap("HotScore")
        public Integer hotScore;

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
         * <p>The error code returned when the scaling strength is the weakest.</p>
         * 
         * <strong>example:</strong>
         * <p>IMG_NOT_SUPPORTED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The instance type of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c7t.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InventoryHealth")
        public DescribeElasticStrengthResponseBodyResourcePoolsInventoryHealth inventoryHealth;

        /**
         * <p>The error message returned when the scaling strength is the weakest.</p>
         * 
         * <strong>example:</strong>
         * <p>The instanceType does not support the image in the configuration.</p>
         */
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The scaling strength of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("Strength")
        public Double strength;

        /**
         * <p>The IDs of the vSwitches in the zones of the resource pool.</p>
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
