// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringSimpleEscalationEntry extends TeaModel {
    /**
     * <p>The minimum deviation or absolute deviation dead zone for dynamic baselines (effective only for baseline comparison operators). No alert is triggered if |current value - boundary| &lt; absDeviation. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 means no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The baseline period (effective only for baseline comparison operators). Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. For weekly periods, the backend automatically expands the historical training window to 14 days or more. Automatic identification cannot return specific identification results.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The comparison operator. GreaterThanThreshold or LessThanThreshold is used for static thresholds. ABOVE_UPPER, BELOW_LOWER, or OUT_OF_BAND is used for dynamic baseline spikes, drops, or bidirectional changes, which requires the sensitivity parameter. The threshold parameter is not used for baselines and can be omitted.</p>
     * 
     * <strong>example:</strong>
     * <p>GT</p>
     */
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The precondition.</p>
     * 
     * <strong>example:</strong>
     * <p>连续3次</p>
     */
    @NameInMap("preCondition")
    public String preCondition;

    /**
     * <p>The dynamic baseline sensitivity (effective only for baseline comparison operators). Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for medium, and LOW for the widest and least sensitive band.</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The severity level.</p>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("severity")
    public String severity;

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

    /**
     * <p>The number of consecutive triggers.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("times")
    public Integer times;

    public static CloudMonitoringSimpleEscalationEntry build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitoringSimpleEscalationEntry self = new CloudMonitoringSimpleEscalationEntry();
        return TeaModel.build(map, self);
    }

    public CloudMonitoringSimpleEscalationEntry setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public CloudMonitoringSimpleEscalationEntry setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    public CloudMonitoringSimpleEscalationEntry setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public CloudMonitoringSimpleEscalationEntry setPreCondition(String preCondition) {
        this.preCondition = preCondition;
        return this;
    }
    public String getPreCondition() {
        return this.preCondition;
    }

    public CloudMonitoringSimpleEscalationEntry setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
    }

    public CloudMonitoringSimpleEscalationEntry setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public CloudMonitoringSimpleEscalationEntry setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public CloudMonitoringSimpleEscalationEntry setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public CloudMonitoringSimpleEscalationEntry setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
