// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsRequest extends TeaModel {
    /**
     * <p>The statistical results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("metricQuery")
    public String metricQuery;

    /**
     * <p>The statistical results.</p>
     * 
     * <strong>example:</strong>
     * <p>The details about the metric.</p>
     */
    @NameInMap("metricType")
    public String metricType;

    @NameInMap("metricView")
    public String metricView;

    /**
     * <p>USERACTIONPV_COUNT</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListDashboardMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsRequest self = new ListDashboardMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDashboardMetricsRequest setMetricQuery(String metricQuery) {
        this.metricQuery = metricQuery;
        return this;
    }
    public String getMetricQuery() {
        return this.metricQuery;
    }

    public ListDashboardMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListDashboardMetricsRequest setMetricView(String metricView) {
        this.metricView = metricView;
        return this;
    }
    public String getMetricView() {
        return this.metricView;
    }

    public ListDashboardMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
