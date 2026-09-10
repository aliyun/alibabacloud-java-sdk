// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetTriggerSimpleExpression extends TeaModel {
    /**
     * <p>The minimum deviation or absolute deviation dead zone for the dynamic baseline. Takes effect only for baseline operators. The unit is the same as the metric. The value must be greater than or equal to 0. A value of 0 indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The baseline period. Takes effect only for baseline operators. Valid values:</p>
     * <ul>
     * <li>AUTO: Automatically identifies the period.</li>
     * <li>DAILY: Daily period.</li>
     * <li>WEEKLY: Weekly period. The backend automatically expands the historical training window to at least 14 days.</li>
     * <li>NONE: No period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("baselinePeriod")
    public String baselinePeriod;

    /**
     * <p>The expression type. Fixed value: SIMPLE.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("expressionType")
    public String expressionType;

    /**
     * <p>The upper bound of the range. Required when operator is set to IN_RANGE or OUT_OF_RANGE. The value must be greater than or equal to min.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("max")
    public Double max;

    /**
     * <p>The lower bound of the range. Required when operator is set to IN_RANGE or OUT_OF_RANGE.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min")
    public Double min;

    /**
     * <p>The comparison operator. Valid values:</p>
     * <ul>
     * <li>GT: Greater than.</li>
     * <li>GE: Greater than or equal to.</li>
     * <li>LT: Less than.</li>
     * <li>LE: Less than or equal to.</li>
     * <li>EQ: Equal to.</li>
     * <li>NE: Not equal to.</li>
     * <li>IN_RANGE: Within the range. Both min and max must be specified.</li>
     * <li>OUT_OF_RANGE: Outside the range. Both min and max must be specified.</li>
     * <li>PRESENT: The field exists. The threshold, min, and max parameters are not required.</li>
     * <li>NOT_PRESENT: The field does not exist. The threshold, min, and max parameters are not required.</li>
     * <li>ABOVE_UPPER: Dynamic baseline spike. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
     * <li>BELOW_LOWER: Dynamic baseline drop. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
     * <li>OUT_OF_BAND: Dynamic baseline bidirectional deviation. The sensitivity parameter is required. The threshold, min, and max parameters are not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OUT_OF_BAND</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The referenced query name, corresponding to QueryConfigUnified.queries[].name.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuQuery</p>
     */
    @NameInMap("queryName")
    public String queryName;

    /**
     * <p>The dynamic baseline sensitivity. Takes effect only for baseline operators. Valid values:</p>
     * <ul>
     * <li>HIGH: The narrowest band and highest sensitivity.</li>
     * <li>MEDIUM: Medium sensitivity.</li>
     * <li>LOW: The widest band and lowest sensitivity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The comparison threshold. Used when operator is set to GT, GE, LT, LE, EQ, or NE. For IN_RANGE or OUT_OF_RANGE, use min and max instead. Not required for PRESENT or NOT_PRESENT.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static MetricSetTriggerSimpleExpression build(java.util.Map<String, ?> map) throws Exception {
        MetricSetTriggerSimpleExpression self = new MetricSetTriggerSimpleExpression();
        return TeaModel.build(map, self);
    }

    public MetricSetTriggerSimpleExpression setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public MetricSetTriggerSimpleExpression setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    public MetricSetTriggerSimpleExpression setExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }
    public String getExpressionType() {
        return this.expressionType;
    }

    public MetricSetTriggerSimpleExpression setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public MetricSetTriggerSimpleExpression setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public MetricSetTriggerSimpleExpression setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MetricSetTriggerSimpleExpression setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public MetricSetTriggerSimpleExpression setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
    }

    public MetricSetTriggerSimpleExpression setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
