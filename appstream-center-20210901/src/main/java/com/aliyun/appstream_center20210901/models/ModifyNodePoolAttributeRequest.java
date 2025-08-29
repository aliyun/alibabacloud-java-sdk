// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-hangzhou: China (Hangzhou)</li>
     * </ul>
     * 
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

    /**
     * <p>The auto scaling policy used by the delivery group.</p>
     */
    @NameInMap("NodePoolStrategy")
    public ModifyNodePoolAttributeRequestNodePoolStrategy nodePoolStrategy;

    /**
     * <strong>example:</strong>
     * <p>rg-ew7va2g1wl3vm****</p>
     */
    @NameInMap("PoolId")
    public String poolId;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
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
         * <p>The number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The end of the time period during which the scaling policy is executed. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>15:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The beginning of the time period during which the scaling policy is executed. Format: HH:mm.</p>
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
         * <p>The schedule type of the scaling policy. This parameter must be configured together with <code>RecurrenceValues</code>.``</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>weekly: The scaling policy is executed on specific days each week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The days of each week on which the scaling policy is executed.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <p>The time periods during which the scaling policy can be executed. The time periods must meet the following requirements:</p>
         * <ul>
         * <li>Up to three time periods can be added.</li>
         * <li>Time periods cannot be overlapped.</li>
         * <li>The interval between two consecutive time periods must be greater than or equal to 5 minutes.</li>
         * <li>Each time period must be greater than or equal to 15 minutes.</li>
         * <li>The total length of the time periods that you specify cannot be greater than a day.</li>
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
         * <p>The maximum number of idle sessions. After you specify a value for this parameter, auto scaling is triggered only if the number of idle sessions in the delivery group is smaller than the specified value and the session usage exceeds the value specified for <code>ScalingUsageThreshold</code>. Otherwise, the system determines that the idle sessions in the delivery group are sufficient and does not perform auto scaling.`` You can use this parameter to flexibly manage auto scaling and reduce costs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxIdleAppInstanceAmount")
        public Integer maxIdleAppInstanceAmount;

        /**
         * <p>The maximum number of resources that can be created for scale-out. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScalingAmount")
        public Integer maxScalingAmount;

        /**
         * <p>The number of resources to purchase. Valid values: 1 to 100.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If you use subscription resources, you cannot modify this parameter.</li>
         * <li>If you use pay-as-you-go resources, you can modify this parameter only if you set <code>StrategyType</code> to <code>NODE_FIXED</code> or <code>NODE_SCALING_BY_USAGE</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The intervals at which the scaling policy is executed. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         */
        @NameInMap("RecurrenceSchedules")
        public java.util.List<ModifyNodePoolAttributeRequestNodePoolStrategyRecurrenceSchedules> recurrenceSchedules;

        /**
         * <p>The maximum retention period of a resource to which no session is connected. If no session is connected to a resource, the resource is automatically scaled in after the specified retention period elapses. Valid values: 5 to 120. Default value: 5. Unit: minutes. If one of the following situations occurs, the resource is not scaled in.</p>
         * <ul>
         * <li>If a scale-out is automatically triggered after the resource is scaled in, the scale-in is not executed. This prevents repeated scale-in and scale-out.</li>
         * <li>If a scale-out is automatically triggered due to an increase in the number of sessions during the specified period of time, the resource is not scaled in and the countdown restarts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScalingDownAfterIdleMinutes")
        public Integer scalingDownAfterIdleMinutes;

        /**
         * <p>The number of resources that are created each time resources are scaled out. Valid values: 1 to 10. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScalingStep")
        public Integer scalingStep;

        /**
         * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scaling is automatically triggered. The session usage is calculated by using the following formula: <code>Session usage = Number of current sessions/(Total number of resources × Number of concurrent sessions) × 100%</code>. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_USAGE</code>. Valid values: 0 to 100. Default value: 85.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("ScalingUsageThreshold")
        public String scalingUsageThreshold;

        /**
         * <p>The expiration date of the scaling policy. Format: yyyy-MM-dd. The interval between the expiration date and the effective date must be from 7 days to 1 year. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-19</p>
         */
        @NameInMap("StrategyDisableDate")
        public String strategyDisableDate;

        /**
         * <p>The effective date of the scaling policy. Format: yyyy-MM-dd. The date must be the same as or later than the current date. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-05</p>
         */
        @NameInMap("StrategyEnableDate")
        public String strategyEnableDate;

        /**
         * <p>The scaling mode.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><code>NODE_FIXED</code>: no scaling. This value is applicable to pay-as-you-go resources and subscription resources.</li>
         * <li><code>NODE_SCALING_BY_USAGE</code>: auto scaling. This value is applicable to pay-as-you-go resources and subscription resources.</li>
         * <li><code>NODE_SCALING_BY_SCHEDULE</code>: scheduled scaling. This value is applicable only to pay-as-you-go resources.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>NODE_FIXED: no scaling</li>
         * <li>NODE_SCALING_BY_SCHEDULE: scheduled scaling</li>
         * <li>NODE_SCALING_BY_USAGE: auto scaling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE_FIXED</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>Specifies whether to enable the warmup policy for resources. This parameter is required only if you set <code>StrategyType</code> to <code>NODE_SCALING_BY_SCHEDULE</code>.</p>
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

        public ModifyNodePoolAttributeRequestNodePoolStrategy setMaxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
            this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
            return this;
        }
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
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
