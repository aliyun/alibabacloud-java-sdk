// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class MetricsTrigger extends TeaModel {
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

    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    @NameInMap("Threshold")
    public Double threshold;

    @NameInMap("TimeWindow")
    public Integer timeWindow;

    public static MetricsTrigger build(java.util.Map<String, ?> map) throws Exception {
        MetricsTrigger self = new MetricsTrigger();
        return TeaModel.build(map, self);
    }

    public MetricsTrigger setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public MetricsTrigger setCoolDownInterval(Integer coolDownInterval) {
        this.coolDownInterval = coolDownInterval;
        return this;
    }
    public Integer getCoolDownInterval() {
        return this.coolDownInterval;
    }

    public MetricsTrigger setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public MetricsTrigger setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public MetricsTrigger setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public MetricsTrigger setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public MetricsTrigger setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public MetricsTrigger setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
