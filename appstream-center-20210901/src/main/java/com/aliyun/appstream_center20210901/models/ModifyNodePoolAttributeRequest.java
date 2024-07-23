// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCapacity")
    public Integer nodeCapacity;

    @NameInMap("NodePoolStrategy")
    public ModifyNodePoolAttributeRequestNodePoolStrategy nodePoolStrategy;

    /**
     * <strong>example:</strong>
     * <p>rg-ew7va2g1wl3vm****</p>
     */
    @NameInMap("PoolId")
    public String poolId;

    /**
     * <p>产品类型。</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
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
        /**
         * <p>资源数量。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>结束时间。格式为HH:mm。</p>
         * 
         * <strong>example:</strong>
         * <p>15:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>开始时间。格式为HH:mm。</p>
         * 
         * <strong>example:</strong>
         * <p>12:00</p>
         */
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
        /**
         * <p>策略执行周期的类型。必须同时指定<code>RecurrenceType</code>和<code>RecurrenceValues</code>。</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>策略执行周期的数值列表。</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <p>策略执行周期的时间段列表。时间段设置要求：</p>
         * <ul>
         * <li>最多可添加3个时间段。</li>
         * <li>时间段之间不重叠。</li>
         * <li>时间段之间的间隔大于或等于5分钟。</li>
         * <li>单个时间段的时长大于或等于15分钟。</li>
         * <li>所有时间段累计不跨天。</li>
         * </ul>
         */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <p>购买资源的数量。取值范围：1~100。</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>若为包年包月资源，则该参数不可修改。</li>
         * <li>若为按量付费资源，则当弹性模式（<code>StrategyType</code>）为固定数量（<code>NODE_FIXED</code>）或自动扩缩容（<code>NODE_SCALING_BY_USAGE</code>）时该参数可修改。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>策略执行周期列表。<code>StrategyType</code>（弹性模式）设为<code>NODE_SCALING_BY_SCHEDULE</code>（定时扩缩容）时，该字段必填。</p>
         */
        @NameInMap("RecurrenceSchedules")
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules> recurrenceSchedules;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>策略失效日期。格式为：yyyy-MM-dd。失效日期与生效日期的间隔必须介于7天到1年之间（含7天和1年）。<code>StrategyType</code>（弹性模式）设为<code>NODE_SCALING_BY_SCHEDULE</code>（定时扩缩容）时，该字段必填。</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-19</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <p>策略生效日期。格式为：yyyy-MM-dd。该日期必须大于或等于当前日期。<code>StrategyType</code>（弹性模式）设为<code>NODE_SCALING_BY_SCHEDULE</code>（定时扩缩容）时，该字段必填。</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>是否开启资源预热策略。<code>StrategyType</code>（弹性模式）设为<code>NODE_SCALING_BY_SCHEDULE</code>（定时扩缩容）时，该字段必填。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
