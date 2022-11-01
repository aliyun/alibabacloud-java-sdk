// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeRequest extends TeaModel {
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("NodeCapacity")
    public Integer nodeCapacity;

    @NameInMap("NodePoolStrategy")
    public ModifyNodePoolAttributeRequestNodePoolStrategy nodePoolStrategy;

    @NameInMap("PoolId")
    public String poolId;

    @NameInMap("ProductType")
    public String productType;

    public static ModifyNodePoolAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAttributeRequest self = new ModifyNodePoolAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAttributeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ModifyNodePoolAttributeRequest setNodeCapacity(Integer nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
        return this;
    }
    public Integer getNodeCapacity() {
        return this.nodeCapacity;
    }

    public ModifyNodePoolAttributeRequest setNodePoolStrategy(ModifyNodePoolAttributeRequestNodePoolStrategy nodePoolStrategy) {
        this.nodePoolStrategy = nodePoolStrategy;
        return this;
    }
    public ModifyNodePoolAttributeRequestNodePoolStrategy getNodePoolStrategy() {
        return this.nodePoolStrategy;
    }

    public ModifyNodePoolAttributeRequest setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }
    public String getPoolId() {
        return this.poolId;
    }

    public ModifyNodePoolAttributeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public static class ModifyNodePoolAttributeRequestNodePoolStrategy extends TeaModel {
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        public Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        @NameInMap("StrategyType")
        public String strategyType;

        public static ModifyNodePoolAttributeRequestNodePoolStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolAttributeRequestNodePoolStrategy self = new ModifyNodePoolAttributeRequestNodePoolStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setMaxScalingAmount(Integer maxScalingAmount) {
            this.maxScalingAmount = maxScalingAmount;
            return this;
        }
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setScalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
            this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
            return this;
        }
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setScalingStep(Integer scalingStep) {
            this.scalingStep = scalingStep;
            return this;
        }
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setScalingUsageThreshold(String scalingUsageThreshold) {
            this.scalingUsageThreshold = scalingUsageThreshold;
            return this;
        }
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

    }

}
