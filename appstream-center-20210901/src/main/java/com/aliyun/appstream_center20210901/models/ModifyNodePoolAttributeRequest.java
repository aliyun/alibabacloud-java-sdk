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

    public static class ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods self = new ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules extends TeaModel {
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        @NameInMap("TimerPeriods")
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods> timerPeriods;

        public static ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules self = new ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules setTimerPeriods(java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods> timerPeriods) {
            this.timerPeriods = timerPeriods;
            return this;
        }
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedulesTimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

    }

    public static class ModifyNodePoolAttributeRequestNodePoolStrategy extends TeaModel {
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        @NameInMap("RecurrenceSchedules")
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules> recurrenceSchedules;

        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        public Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        @NameInMap("StrategyType")
        public String strategyType;

        @NameInMap("WarmUp")
        public Boolean warmUp;

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

        public ModifyNodePoolAttributeRequestNodePoolStrategy setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setRecurrenceSchedules(java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules> recurrenceSchedules) {
            this.recurrenceSchedules = recurrenceSchedules;
            return this;
        }
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
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

        public ModifyNodePoolAttributeRequestNodePoolStrategy setStrategyDisableDate(String strategyDisableDate) {
            this.strategyDisableDate = strategyDisableDate;
            return this;
        }
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setStrategyEnableDate(String strategyEnableDate) {
            this.strategyEnableDate = strategyEnableDate;
            return this;
        }
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ModifyNodePoolAttributeRequestNodePoolStrategy setWarmUp(Boolean warmUp) {
            this.warmUp = warmUp;
            return this;
        }
        public Boolean getWarmUp() {
            return this.warmUp;
        }

    }

}
