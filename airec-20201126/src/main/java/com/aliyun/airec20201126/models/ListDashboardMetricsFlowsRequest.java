// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsFlowsRequest extends TeaModel {
    /**
     * <p>The type of the metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The metric data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The error code.</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>The statistical results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListDashboardMetricsFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsFlowsRequest self = new ListDashboardMetricsFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsFlowsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDashboardMetricsFlowsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListDashboardMetricsFlowsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
