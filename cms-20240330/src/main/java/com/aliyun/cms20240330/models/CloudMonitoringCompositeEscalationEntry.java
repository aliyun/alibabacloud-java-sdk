// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringCompositeEscalationEntry extends TeaModel {
    /**
     * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines. This parameter takes effect only when the comparisonOperator is set to a baseline operator. If the absolute difference between the current value and the boundary is less than the absDeviation value, no alert is triggered. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The baseline period. This parameter takes effect only when the comparisonOperator is set to a baseline operator. Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. When set to WEEKLY, the backend automatically extends the historical training window to 14 days or more. Automatic identification cannot return the specific identification result.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The comparison operator. Valid values include GreaterThanThreshold and LessThanThreshold for static thresholds, and ABOVE_UPPER, BELOW_LOWER, and OUT_OF_BAND for dynamic baseline spikes, drops, and bidirectional changes. For dynamic baseline operators, you must specify the sensitivity parameter. The threshold parameter is not used for evaluation and can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuUsage</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The collection period in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The precondition.</p>
     * 
     * <strong>example:</strong>
     * <p>连续3次</p>
     */
    @NameInMap("preCondition")
    public String preCondition;

    /**
     * <p>The dynamic baseline sensitivity. This parameter takes effect only when the comparisonOperator is set to a baseline operator. Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for a medium band, and LOW for the widest and least sensitive band.</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The statistical method.</p>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("statistics")
    public String statistics;

    /**
     * <p>The threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("threshold")
    public String threshold;

    public static CloudMonitoringCompositeEscalationEntry build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringCompositeEscalationEntry self = new CloudMonitoringCompositeEscalationEntry();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringCompositeEscalationEntry setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public CloudMonitoringCompositeEscalationEntry setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
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

    public CloudMonitoringCompositeEscalationEntry setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
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
