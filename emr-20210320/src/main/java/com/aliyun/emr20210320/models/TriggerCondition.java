// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TriggerCondition extends TeaModel {
    /**
     * <p>比较符。取值范围：</p>
     * <ul>
     * <li>EQ:等于。</li>
     * <li>NE:不等于。</li>
     * <li>GT:大于。</li>
     * <li>LT:小于。</li>
     * <li>GE:大于等于。</li>
     * <li>LE:小于等于。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>指标名称。指标名称需要在 ListAutoScalingMetrics 接口返回的指标名称列表中。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yarn_resourcemanager_root_availablememoryusage</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>统计量名称。取值范围：</p>
     * <ul>
     * <li>MAX：最大值。</li>
     * <li>MIN：最小值。</li>
     * <li>AVG：平均值。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.5</p>
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
