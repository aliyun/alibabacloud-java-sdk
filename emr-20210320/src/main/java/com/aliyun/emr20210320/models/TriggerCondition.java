// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TriggerCondition extends TeaModel {
    /**
     * <p>The comparison operator. This parameter is required. Valid values:</p>
     * <ul>
     * <li>EQ: equal to</li>
     * <li>NE: not equal to</li>
     * <li>GT: greater than</li>
     * <li>LT: less than</li>
     * <li>GE: greater than or equal to</li>
     * <li>LE: less than or equal to</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LT</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The name of the metric. This parameter is required and cannot be an empty string. You can view the metric name in <a href="https://help.aliyun.com/document_detail/445658.html">Add Auto Scaling Rules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yarn_resourcemanager_queue_PendingVCores</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The name of the statistic. This parameter is required. Valid values:</p>
     * <ul>
     * <li>MAX</li>
     * <li>MIN</li>
     * <li>AVG</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("Statistics")
    public String statistics;

    /**
     * <p>The tags for the metrics of a partition. This parameter is available for only metrics that contain ByPartition. For other metrics, leave this parameter empty.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The trigger threshold. This parameter is required.</p>
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
