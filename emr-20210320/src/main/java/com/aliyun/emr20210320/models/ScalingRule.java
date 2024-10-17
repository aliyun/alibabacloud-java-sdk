// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingRule extends TeaModel {
    /**
     * <p>伸缩活动类型。取值范围：</p>
     * <ul>
     * <li>SCALE_OUT：扩容。</li>
     * <li>SCALE_IN：缩容。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SCALE_IN</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>按照负载伸缩描述。</p>
     * <p>
     */
    @NameInMap("MetricsTrigger")
    public MetricsTrigger metricsTrigger;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentValue")
    public Integer minAdjustmentValue;

    /**
     * <p>规则名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scale-out-memory</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>按照时间伸缩描述。</p>
     * <p>
     */
    @NameInMap("TimeTrigger")
    public TimeTrigger timeTrigger;

    /**
     * <p>伸缩规则类型。 取值范围：</p>
     * <ul>
     * <li>TIME_TRIGGER: 按时间伸缩。</li>
     * <li>METRICS_TRIGGER: 按负载伸缩。</li>
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
