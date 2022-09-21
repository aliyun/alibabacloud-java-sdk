// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByLoadScalingRuleSpec extends TeaModel {
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

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
