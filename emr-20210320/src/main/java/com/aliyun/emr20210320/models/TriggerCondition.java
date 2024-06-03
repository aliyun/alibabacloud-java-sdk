// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TriggerCondition extends TeaModel {
    /**
     * <p>比较符。取值范围：</p>
     * <p>- EQ:等于。</p>
     * <p>- NE:不等于。</p>
     * <p>- GT:大于。</p>
     * <p>- LT:小于。</p>
     * <p>- GE:大于等于。</p>
     * <p>- LE:小于等于。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>统计量名称。取值范围：</p>
     * <p>- MAX：最大值。</p>
     * <p>- MIN：最小值。</p>
     * <p>- AVG：平均值。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>指标Tag。</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    /**
     * <p>阈值。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    public static TriggerCondition build(java.util.Map<String, ?> map) throws Exception {
        TriggerCondition self = new TriggerCondition();
        return TeaModel.build(map, self);
    }

    public TriggerCondition setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public TriggerCondition setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public TriggerCondition setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public TriggerCondition setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public TriggerCondition setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
