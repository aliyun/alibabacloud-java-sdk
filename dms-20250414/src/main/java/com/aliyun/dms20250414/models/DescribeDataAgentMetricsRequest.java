// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentMetricsRequest extends TeaModel {
    /**
     * <p>The end time of the query range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1782836200000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The metric names. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>data_agent_session_per_user</p>
     */
    @NameInMap("MetricNames")
    public String metricNames;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li><strong>basic</strong>: basic metrics.</li>
     * <li><strong>high_level</strong>: advanced metrics.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The start time of the query range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1782835200000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDataAgentMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentMetricsRequest self = new DescribeDataAgentMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataAgentMetricsRequest setMetricNames(String metricNames) {
        this.metricNames = metricNames;
        return this;
    }
    public String getMetricNames() {
        return this.metricNames;
    }

    public DescribeDataAgentMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeDataAgentMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
