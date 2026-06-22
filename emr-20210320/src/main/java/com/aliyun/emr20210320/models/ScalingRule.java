// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    /**
     * <p>The type of the scaling activity. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p>SCALE_OUT: scale-out.</p>
     * </li>
     * <li><p>SCALE_IN: scale-in.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCALE_IN</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>The adjustment value. This parameter is required and must be a positive integer. It specifies the number of instances to add for a scale-out activity or remove for a scale-in activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The configurations for load-based scaling.</p>
     */
    @NameInMap("MetricsTrigger")
    public MetricsTrigger metricsTrigger;

    /**
     * <p>The minimum number of instances to add during a scale-out activity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentValue")
    public Integer minAdjustmentValue;

    /**
     * <p>The name of the rule. This parameter is required and cannot be an empty string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingByYarnMemory</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The configurations for time-based scaling.</p>
     */
    @NameInMap("TimeTrigger")
    public TimeTrigger timeTrigger;

    /**
     * <p>The type of the scaling rule. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p>TIME_TRIGGER: time-based scaling.</p>
     * </li>
     * <li><p>METRICS_TRIGGER: load-based scaling.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_TRIGGER</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static ScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ScalingRule self = new ScalingRule();
        return TeaModel.build(map, self);
    }

    public ScalingRule setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public ScalingRule setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScalingRule setMetricsTrigger(MetricsTrigger metricsTrigger) {
        this.metricsTrigger = metricsTrigger;
        return this;
    }
    public MetricsTrigger getMetricsTrigger() {
        return this.metricsTrigger;
    }

    public ScalingRule setMinAdjustmentValue(Integer minAdjustmentValue) {
        this.minAdjustmentValue = minAdjustmentValue;
        return this;
    }
    public Integer getMinAdjustmentValue() {
        return this.minAdjustmentValue;
    }

    public ScalingRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ScalingRule setTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
        return this;
    }
    public TimeTrigger getTimeTrigger() {
        return this.timeTrigger;
    }

    public ScalingRule setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
