// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceMetricResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public GetInstanceMetricResponseBodyMetrics metrics;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricResponseBody self = new GetInstanceMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricResponseBody setMetrics(GetInstanceMetricResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public GetInstanceMetricResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public GetInstanceMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceMetricResponseBodyMetricsMetric extends TeaModel {
        @NameInMap("Dps")
        public java.util.Map<String, ?> dps;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Summary")
        public Float summary;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        public static GetInstanceMetricResponseBodyMetricsMetric build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricResponseBodyMetricsMetric self = new GetInstanceMetricResponseBodyMetricsMetric();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricResponseBodyMetricsMetric setDps(java.util.Map<String, ?> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.Map<String, ?> getDps() {
            return this.dps;
        }

        public GetInstanceMetricResponseBodyMetricsMetric setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetInstanceMetricResponseBodyMetricsMetric setSummary(Float summary) {
            this.summary = summary;
            return this;
        }
        public Float getSummary() {
            return this.summary;
        }

        public GetInstanceMetricResponseBodyMetricsMetric setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

    public static class GetInstanceMetricResponseBodyMetrics extends TeaModel {
        @NameInMap("Metric")
        public java.util.List<GetInstanceMetricResponseBodyMetricsMetric> metric;

        public static GetInstanceMetricResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricResponseBodyMetrics self = new GetInstanceMetricResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricResponseBodyMetrics setMetric(java.util.List<GetInstanceMetricResponseBodyMetricsMetric> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.List<GetInstanceMetricResponseBodyMetricsMetric> getMetric() {
            return this.metric;
        }

    }

}
