// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsFlowsRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MetricType")
    public String metricType;

    public static ListDashboardMetricsFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsFlowsRequest self = new ListDashboardMetricsFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsFlowsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
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

}
