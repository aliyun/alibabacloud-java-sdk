// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByLoadScalingRuleSpec extends TeaModel {
    /**
     * <p>比较符。</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>统计次数。</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>统计量名称。</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>阈值。</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    /**
     * <p>统计窗口。单位为秒。</p>
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
