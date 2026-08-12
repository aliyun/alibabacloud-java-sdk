// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringCompositeEscalationEntry extends TeaModel {
    /**
     * <p>The comparison operator.</p>
     */
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The metric name.</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The collection period, in seconds.</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The precondition.</p>
     */
    @NameInMap("preCondition")
    public String preCondition;

    /**
     * <p>The statistical method.</p>
     */
    @NameInMap("statistics")
    public String statistics;

    /**
     * <p>The threshold.</p>
     */
    @NameInMap("threshold")
    public String threshold;

    public static CloudMonitoringCompositeEscalationEntry build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringCompositeEscalationEntry self = new CloudMonitoringCompositeEscalationEntry();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringCompositeEscalationEntry setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public CloudMonitoringCompositeEscalationEntry setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CloudMonitoringCompositeEscalationEntry setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CloudMonitoringCompositeEscalationEntry setPreCondition(String preCondition) {
        this.preCondition = preCondition;
        return this;
    }
    public String getPreCondition() {
        return this.preCondition;
    }

    public CloudMonitoringCompositeEscalationEntry setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public CloudMonitoringCompositeEscalationEntry setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

}
