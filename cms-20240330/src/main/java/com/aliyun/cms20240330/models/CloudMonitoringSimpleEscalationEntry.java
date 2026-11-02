// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CloudMonitoringSimpleEscalationEntry extends TeaModel {
    /**
     * <p>The minimum dynamic baseline deviation or absolute deviation dead zone, which takes effect only when the baseline comparisonOperator is used. If the absolute difference between the current value and the boundary is less than the absDeviation value, no alert is triggered. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The baseline period, which takes effect only when the baseline comparisonOperator is used. Valid values: AUTO for automatic identification, DAILY for daily, WEEKLY for weekly, and NONE for no period. For weekly periods, the backend automatically extends the historical training window to at least 14 days. Automatic identification cannot return specific identification results.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The comparison operator.</p>
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
     * <p>The sensitivity of the dynamic baseline, which takes effect only when the baseline comparisonOperator is used. Valid values: HIGH for the narrowest and most sensitive band, MEDIUM for medium sensitivity, and LOW for the widest and least sensitive band.</p>
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
