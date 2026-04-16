// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostQueryTrendDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>total_amount</p>
     */
    @NameInMap("defaultMetric")
    public String defaultMetric;

    /**
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    @NameInMap("metrics")
    public java.util.List<MetricDefRespDTO> metrics;

    @NameInMap("points")
    public java.util.List<TrendPointDTO> points;

    public static CostQueryTrendDTO build(java.util.Map<String, ?> map) throws Exception {
        CostQueryTrendDTO self = new CostQueryTrendDTO();
        return TeaModel.build(map, self);
    }

    public CostQueryTrendDTO setDefaultMetric(String defaultMetric) {
        this.defaultMetric = defaultMetric;
        return this;
    }
    public String getDefaultMetric() {
        return this.defaultMetric;
    }

    public CostQueryTrendDTO setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public CostQueryTrendDTO setMetrics(java.util.List<MetricDefRespDTO> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<MetricDefRespDTO> getMetrics() {
        return this.metrics;
    }

    public CostQueryTrendDTO setPoints(java.util.List<TrendPointDTO> points) {
        this.points = points;
        return this;
    }
    public java.util.List<TrendPointDTO> getPoints() {
        return this.points;
    }

}
