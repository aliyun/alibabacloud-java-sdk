// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRuleSpec extends TeaModel {
    /**
     * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>按照负载伸缩描述。</p>
     */
    @NameInMap("ByLoadScalingRuleSpec")
    public ByLoadScalingRuleSpec byLoadScalingRuleSpec;

    /**
     * <p>按照时间伸缩描述。</p>
     */
    @NameInMap("ByTimeScalingRuleSpec")
    public ByTimeScalingRuleSpec byTimeScalingRuleSpec;

    /**
     * <p>冷却时间。单位为秒，取值范围在30~10800秒之间。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    /**
     * <p>伸缩活动类型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCALE_IN</p>
     */
    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    /**
     * <p>规则名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scale-out-memory</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>伸缩规则类型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BY_TIME</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static ScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
        ScalingRuleSpec self = new ScalingRuleSpec();
        return TeaModel.build(map, self);
    }

    public ScalingRuleSpec setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRuleSpec setByLoadScalingRuleSpec(ByLoadScalingRuleSpec byLoadScalingRuleSpec) {
        this.byLoadScalingRuleSpec = byLoadScalingRuleSpec;
        return this;
    }
    public ByLoadScalingRuleSpec getByLoadScalingRuleSpec() {
        return this.byLoadScalingRuleSpec;
    }

    public ScalingRuleSpec setByTimeScalingRuleSpec(ByTimeScalingRuleSpec byTimeScalingRuleSpec) {
        this.byTimeScalingRuleSpec = byTimeScalingRuleSpec;
        return this;
    }
    public ByTimeScalingRuleSpec getByTimeScalingRuleSpec() {
        return this.byTimeScalingRuleSpec;
    }

    public ScalingRuleSpec setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ScalingRuleSpec setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ScalingRuleSpec setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ScalingRuleSpec setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static class ByLoadScalingRuleSpec extends TeaModel {
        /**
         * <p>比较符。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LT</p>
         */
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        /**
         * <p>统计次数。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yarn_resourcemanager_root_availablememoryusage</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>统计量名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>阈值。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12.5</p>
         */
        @NameInMap("Threshold")
        public Double threshold;

        /**
         * <p>统计窗口。单位为秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TimeWindow")
        public Integer timeWindow;

        public static ByLoadScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
            ByLoadScalingRuleSpec self = new ByLoadScalingRuleSpec();
            return TeaModel.build(map, self);
        }

        public ByLoadScalingRuleSpec setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public ByLoadScalingRuleSpec setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ByLoadScalingRuleSpec setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ByLoadScalingRuleSpec setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public ByLoadScalingRuleSpec setThreshold(Double threshold) {
            this.threshold = threshold;
            return this;
        }
        public Double getThreshold() {
            return this.threshold;
        }

        public ByLoadScalingRuleSpec setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

    }

    public static class ByTimeScalingRuleSpec extends TeaModel {
        /**
         * <p>重复执行定时任务的结束时间戳。单位为毫秒。</p>
         * 
         * <strong>example:</strong>
         * <p>1639714800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>启动时间戳。单位为毫秒。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
         */
        @NameInMap("LaunchTime")
        public Long launchTime;

        /**
         * <p>指定时间规则的执行类型。</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。</p>
         * 
         * <strong>example:</strong>
         * <p>MON,FRI,SUN</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        public static ByTimeScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
            ByTimeScalingRuleSpec self = new ByTimeScalingRuleSpec();
            return TeaModel.build(map, self);
        }

        public ByTimeScalingRuleSpec setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ByTimeScalingRuleSpec setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public ByTimeScalingRuleSpec setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ByTimeScalingRuleSpec setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

    }

}
