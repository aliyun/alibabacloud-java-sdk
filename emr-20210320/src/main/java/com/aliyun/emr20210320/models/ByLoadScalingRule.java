// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByLoadScalingRule extends TeaModel {
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    @NameInMap("CoolDownInterval")
    public Integer coolDownInterval;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Statistics")
    public String statistics;

    @NameInMap("Threshold")
    public Double threshold;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static ByLoadScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ByLoadScalingRule self = new ByLoadScalingRule();
        return TeaModel.build(map, self);
    }

    public ByLoadScalingRule setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ByLoadScalingRule setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public ByLoadScalingRule setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public ByLoadScalingRule setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ByLoadScalingRule setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public ByLoadScalingRule setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public ByLoadScalingRule setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
