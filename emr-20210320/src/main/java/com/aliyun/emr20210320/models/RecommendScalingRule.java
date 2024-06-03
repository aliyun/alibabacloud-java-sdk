// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RecommendScalingRule extends TeaModel {
    /**
     * <p>伸缩活动类型。取值范围：</p>
     * <p>- SCALE_OUT：扩容。</p>
     * <p>- SCALE_IN：缩容。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>调整值。需要为正数，代表需要扩容或者缩容的实例数量。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>推荐的规格类型。</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>最大节约成本。</p>
     */
    @NameInMap("MaxSave")
    public Float maxSave;

    /**
     * <p>按照负载伸缩描述。</p>
     * <p><p></p>
     */
    @NameInMap("MetricsTrigger")
    public MetricsTrigger metricsTrigger;

    /**
     * <p>规则名称。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>按照时间伸缩描述。</p>
     * <p><p></p>
     */
    @NameInMap("TimeTrigger")
    public TimeTrigger timeTrigger;

    /**
     * <p>伸缩规则类型。 取值范围：</p>
     * <p>- TIME_TRIGGER: 按时间伸缩。</p>
     * <p>- METRICS_TRIGGER: 按负载伸缩。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static RecommendScalingRule build(java.util.Map<String, ?> map) throws Exception {
        RecommendScalingRule self = new RecommendScalingRule();
        return TeaModel.build(map, self);
    }

    public RecommendScalingRule setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public RecommendScalingRule setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public RecommendScalingRule setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RecommendScalingRule setMaxSave(Float maxSave) {
        this.maxSave = maxSave;
        return this;
    }
    public Float getMaxSave() {
        return this.maxSave;
    }

    public RecommendScalingRule setMetricsTrigger(MetricsTrigger metricsTrigger) {
        this.metricsTrigger = metricsTrigger;
        return this;
    }
    public MetricsTrigger getMetricsTrigger() {
        return this.metricsTrigger;
    }

    public RecommendScalingRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public RecommendScalingRule setTimeTrigger(TimeTrigger timeTrigger) {
        this.timeTrigger = timeTrigger;
        return this;
    }
    public TimeTrigger getTimeTrigger() {
        return this.timeTrigger;
    }

    public RecommendScalingRule setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
