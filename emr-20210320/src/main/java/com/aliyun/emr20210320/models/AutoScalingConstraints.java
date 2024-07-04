// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoScalingConstraints extends TeaModel {
    /**
     * <p>按负载伸缩指标单位描述。</p>
     */
    @NameInMap("AutoScalingMetricUnits")
    public java.util.List<MetricUnitValue> autoScalingMetricUnits;

    /**
     * <p>默认按负载弹性伸缩规则列表</p>
     */
    @NameInMap("DefaultMetricTriggeredRules")
    public java.util.List<ScalingRule> defaultMetricTriggeredRules;

    /**
     * <p>单次伸缩活动最大扩缩容节点数量。</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxAdjustmentValue")
    public Integer maxAdjustmentValue;

    /**
     * <p>按负载规则数量最大值。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxByLoadRuleCount")
    public Integer maxByLoadRuleCount;

    /**
     * <p>按时间规则数量最大值。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxByTimeRuleCount")
    public Integer maxByTimeRuleCount;

    /**
     * <p>支持的按负载弹性伸缩指标Tag列表。</p>
     */
    @NameInMap("SupportMetricTags")
    public java.util.List<SupportMetricTags> supportMetricTags;

    /**
     * <p>支持的按负载弹性伸缩指标列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;YarnRootAvailableMemoryUsage&quot;,&quot;YarnRootAvailableVcores&quot;]</p>
     */
    @NameInMap("SupportMetrics")
    public java.util.List<String> supportMetrics;

    /**
     * <p>支持的弹性伸缩规则类型。</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TIME_TRIGGER&quot;,&quot;METRICS_TRIGGER&quot;]</p>
     */
    @NameInMap("SupportRuleTypes")
    public java.util.List<String> supportRuleTypes;

    public static AutoScalingConstraints build(java.util.Map<String, ?> map) throws Exception {
        AutoScalingConstraints self = new AutoScalingConstraints();
        return TeaModel.build(map, self);
    }

    public AutoScalingConstraints setAutoScalingMetricUnits(java.util.List<MetricUnitValue> autoScalingMetricUnits) {
        this.autoScalingMetricUnits = autoScalingMetricUnits;
        return this;
    }
    public java.util.List<MetricUnitValue> getAutoScalingMetricUnits() {
        return this.autoScalingMetricUnits;
    }

    public AutoScalingConstraints setDefaultMetricTriggeredRules(java.util.List<ScalingRule> defaultMetricTriggeredRules) {
        this.defaultMetricTriggeredRules = defaultMetricTriggeredRules;
        return this;
    }
    public java.util.List<ScalingRule> getDefaultMetricTriggeredRules() {
        return this.defaultMetricTriggeredRules;
    }

    public AutoScalingConstraints setMaxAdjustmentValue(Integer maxAdjustmentValue) {
        this.maxAdjustmentValue = maxAdjustmentValue;
        return this;
    }
    public Integer getMaxAdjustmentValue() {
        return this.maxAdjustmentValue;
    }

    public AutoScalingConstraints setMaxByLoadRuleCount(Integer maxByLoadRuleCount) {
        this.maxByLoadRuleCount = maxByLoadRuleCount;
        return this;
    }
    public Integer getMaxByLoadRuleCount() {
        return this.maxByLoadRuleCount;
    }

    public AutoScalingConstraints setMaxByTimeRuleCount(Integer maxByTimeRuleCount) {
        this.maxByTimeRuleCount = maxByTimeRuleCount;
        return this;
    }
    public Integer getMaxByTimeRuleCount() {
        return this.maxByTimeRuleCount;
    }

    public AutoScalingConstraints setSupportMetricTags(java.util.List<SupportMetricTags> supportMetricTags) {
        this.supportMetricTags = supportMetricTags;
        return this;
    }
    public java.util.List<SupportMetricTags> getSupportMetricTags() {
        return this.supportMetricTags;
    }

    public AutoScalingConstraints setSupportMetrics(java.util.List<String> supportMetrics) {
        this.supportMetrics = supportMetrics;
        return this;
    }
    public java.util.List<String> getSupportMetrics() {
        return this.supportMetrics;
    }

    public AutoScalingConstraints setSupportRuleTypes(java.util.List<String> supportRuleTypes) {
        this.supportRuleTypes = supportRuleTypes;
        return this;
    }
    public java.util.List<String> getSupportRuleTypes() {
        return this.supportRuleTypes;
    }

    public static class SupportMetricTags extends TeaModel {
        /**
         * <p>指标名称。</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>指标Tag。</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tag> tags;

        public static SupportMetricTags build(java.util.Map<String, ?> map) throws Exception {
            SupportMetricTags self = new SupportMetricTags();
            return TeaModel.build(map, self);
        }

        public SupportMetricTags setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public SupportMetricTags setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

    }

}
