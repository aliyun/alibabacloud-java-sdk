// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostQueryTrendDTO extends TeaModel {
    /**
     * <p>The default metric.</p>
     * 
     * <strong>example:</strong>
     * <p>total_amount</p>
     */
    @NameInMap("defaultMetric")
    public String defaultMetric;

    /**
     * <p>The granularity of the data. Valid values are <code>hourly</code> and <code>daily</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>A list of metric definitions.</p>
     */
    @NameInMap("metrics")
    public java.util.List<MetricDefRespDTO> metrics;

    /**
     * <p>A list of data points for the trend.</p>
     */
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
