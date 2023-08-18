// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public GetClusterMetricsResponseBodyMetrics metrics;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterMetricsResponseBody self = new GetClusterMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterMetricsResponseBody setMetrics(GetClusterMetricsResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public GetClusterMetricsResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public GetClusterMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterMetricsResponseBodyMetricsMetric extends TeaModel {
        @NameInMap("Dps")
        public java.util.Map<String, ?> dps;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Summary")
        public Float summary;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        public static GetClusterMetricsResponseBodyMetricsMetric build(java.util.Map<String, ?> map) throws Exception {
            GetClusterMetricsResponseBodyMetricsMetric self = new GetClusterMetricsResponseBodyMetricsMetric();
            return TeaModel.build(map, self);
        }

        public GetClusterMetricsResponseBodyMetricsMetric setDps(java.util.Map<String, ?> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.Map<String, ?> getDps() {
            return this.dps;
        }

        public GetClusterMetricsResponseBodyMetricsMetric setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetClusterMetricsResponseBodyMetricsMetric setSummary(Float summary) {
            this.summary = summary;
            return this;
        }
        public Float getSummary() {
            return this.summary;
        }

        public GetClusterMetricsResponseBodyMetricsMetric setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

    public static class GetClusterMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("Metric")
        public java.util.List<GetClusterMetricsResponseBodyMetricsMetric> metric;

        public static GetClusterMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetClusterMetricsResponseBodyMetrics self = new GetClusterMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public GetClusterMetricsResponseBodyMetrics setMetric(java.util.List<GetClusterMetricsResponseBodyMetricsMetric> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.List<GetClusterMetricsResponseBodyMetricsMetric> getMetric() {
            return this.metric;
        }

    }

}
