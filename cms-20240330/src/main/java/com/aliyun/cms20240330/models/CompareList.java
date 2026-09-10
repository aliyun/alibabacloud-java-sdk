// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CompareList extends TeaModel {
    /**
     * <p>The dynamic baseline minimum deviation or absolute deviation dead zone. This parameter takes effect only when a baseline operator is used. If |current value − boundary| &lt; absDeviation, no alert is triggered. The unit is the same as the metric unit. The value must be greater than or equal to 0. A value of 0 indicates no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("absDeviation")
    public Double absDeviation;

    /**
     * <p>The aggregation function.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>The baseline period. This parameter takes effect only when a baseline operator is used. Valid values:</p>
     * <ul>
     * <li>AUTO: Automatically identifies the period. The specific identification result cannot be displayed.</li>
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
     * <p>The comparison operator. Valid values:</p>
     * <ul>
     * <li>GTE: greater than or equal to.</li>
     * <li>LTE: less than or equal to.</li>
     * <li>YOY_UP: year-over-year increase. You must also specify yoyTimeUnit and yoyTimeValue.</li>
     * <li>YOY_DOWN: year-over-year decrease. You must also specify yoyTimeUnit and yoyTimeValue.</li>
     * <li>ABOVE_UPPER: dynamic baseline spike. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
     * <li>BELOW_LOWER: dynamic baseline drop. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
     * <li>OUT_OF_BAND: dynamic baseline bidirectional. You must specify sensitivity. When using a baseline operator, threshold is not used for evaluation. Set it to 0 as a placeholder.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OUT_OF_BAND</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The dynamic baseline sensitivity. This parameter takes effect only when a baseline operator is used. Valid values:</p>
     * <ul>
     * <li>HIGH: The narrowest band and the most sensitive.</li>
     * <li>MEDIUM: Medium sensitivity.</li>
     * <li>LOW: The widest band and the least sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("sensitivity")
    public String sensitivity;

    /**
     * <p>The threshold.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    /**
     * <p>The year-over-year time unit. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("yoyTimeUnit")
    public String yoyTimeUnit;

    /**
     * <p>The year-over-year time value. This parameter takes effect only when operator is set to YOY_UP or YOY_DOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("yoyTimeValue")
    public Integer yoyTimeValue;

    public static CompareList build(java.util.Map<String, ?> map) throws Exception {
        CompareList self = new CompareList();
        return TeaModel.build(map, self);
    }

    public CompareList setAbsDeviation(Double absDeviation) {
        this.absDeviation = absDeviation;
        return this;
    }
    public Double getAbsDeviation() {
        return this.absDeviation;
    }

    public CompareList setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public CompareList setBaselinePeriod(String baselinePeriod) {
        this.baselinePeriod = baselinePeriod;
        return this;
    }
    public String getBaselinePeriod() {
        return this.baselinePeriod;
    }

    public CompareList setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CompareList setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public String getSensitivity() {
        return this.sensitivity;
    }

    public CompareList setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public CompareList setYoyTimeUnit(String yoyTimeUnit) {
        this.yoyTimeUnit = yoyTimeUnit;
        return this;
    }
    public String getYoyTimeUnit() {
        return this.yoyTimeUnit;
    }

    public CompareList setYoyTimeValue(Integer yoyTimeValue) {
        this.yoyTimeValue = yoyTimeValue;
        return this;
    }
    public Integer getYoyTimeValue() {
        return this.yoyTimeValue;
    }

}
