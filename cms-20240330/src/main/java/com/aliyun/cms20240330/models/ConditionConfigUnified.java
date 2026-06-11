// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ConditionConfigUnified extends TeaModel {
    /**
     * <p>The aggregation method for metric data points over the evaluation period. Valid values include <code>AVG</code>, <code>SUM</code>, and <code>MAX</code>.</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>A list of composite comparison configurations for APM alerts. Each item is an <code>ApmCompositeCompareConfig</code> object.</p>
     */
    @NameInMap("compareList")
    public java.util.List<ApmCompositeCompareConfig> compareList;

    /**
     * <p>The number of seconds a condition must be true before triggering an alert.</p>
     */
    @NameInMap("durationSecs")
    public Integer durationSecs;

    /**
     * <p>The comparison operator used to evaluate the metric against the threshold.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The logical relationship between multiple conditions. Valid values are <code>AND</code> and <code>OR</code>.</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The alert severity. Valid values are <code>CRITICAL</code>, <code>WARNING</code>, and <code>INFO</code>.</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The value against which the metric is evaluated to trigger an alert.</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    /**
     * <p>A list of threshold configurations for Application Performance Monitoring (APM) alerts. Each item is an <code>ApmThresholdConfig</code> object.</p>
     */
    @NameInMap("thresholdList")
    public java.util.List<ApmThresholdConfig> thresholdList;

    /**
     * <p>The type of the alert condition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static ConditionConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        ConditionConfigUnified self = new ConditionConfigUnified();
        return TeaModel.build(map, self);
    }

    public ConditionConfigUnified setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ConditionConfigUnified setCompareList(java.util.List<ApmCompositeCompareConfig> compareList) {
        this.compareList = compareList;
        return this;
    }
    public java.util.List<ApmCompositeCompareConfig> getCompareList() {
        return this.compareList;
    }

    public ConditionConfigUnified setDurationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }
    public Integer getDurationSecs() {
        return this.durationSecs;
    }

    public ConditionConfigUnified setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConditionConfigUnified setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public ConditionConfigUnified setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ConditionConfigUnified setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public ConditionConfigUnified setThresholdList(java.util.List<ApmThresholdConfig> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }
    public java.util.List<ApmThresholdConfig> getThresholdList() {
        return this.thresholdList;
    }

    public ConditionConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
