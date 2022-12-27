// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricsResponseBody extends TeaModel {
    // The list of diagnostic metrics.
    @NameInMap("Metrics")
    public java.util.List<DescribeDiagnosticMetricsResponseBodyMetrics> metrics;

    // The query token returned in this call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticMetricsResponseBody self = new DescribeDiagnosticMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticMetricsResponseBody setMetrics(java.util.List<DescribeDiagnosticMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeDiagnosticMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeDiagnosticMetricsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiagnosticMetricsResponseBodyMetrics extends TeaModel {
        // The description of the diagnostic metric.
        @NameInMap("Description")
        public String description;

        // Indicates whether the diagnostic metric needs to be assessed by running a Cloud Assistant command in a guest operating system.
        @NameInMap("GuestMetric")
        public Boolean guestMetric;

        // The category of the diagnostic metric.
        @NameInMap("MetricCategory")
        public String metricCategory;

        // The ID of the diagnostic metric.
        @NameInMap("MetricId")
        public String metricId;

        // The name of the diagnostic metric.
        @NameInMap("MetricName")
        public String metricName;

        // The resource type supported by the diagnostic metric.
        @NameInMap("ResourceType")
        public String resourceType;

        // The operating system type supported by the diagnostic metric. Valid values:
        // 
        // *   Windows
        // *   Linux
        // *   All: both Windows and Linux
        @NameInMap("SupportedOperatingSystem")
        public String supportedOperatingSystem;

        public static DescribeDiagnosticMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosticMetricsResponseBodyMetrics self = new DescribeDiagnosticMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setGuestMetric(Boolean guestMetric) {
            this.guestMetric = guestMetric;
            return this;
        }
        public Boolean getGuestMetric() {
            return this.guestMetric;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setMetricCategory(String metricCategory) {
            this.metricCategory = metricCategory;
            return this;
        }
        public String getMetricCategory() {
            return this.metricCategory;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setMetricId(String metricId) {
            this.metricId = metricId;
            return this;
        }
        public String getMetricId() {
            return this.metricId;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeDiagnosticMetricsResponseBodyMetrics setSupportedOperatingSystem(String supportedOperatingSystem) {
            this.supportedOperatingSystem = supportedOperatingSystem;
            return this;
        }
        public String getSupportedOperatingSystem() {
            return this.supportedOperatingSystem;
        }

    }

}
