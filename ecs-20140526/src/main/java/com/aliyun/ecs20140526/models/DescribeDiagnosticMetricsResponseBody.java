// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticMetricsResponseBody extends TeaModel {
    /**
     * <p>The ID of the diagnostic metric.</p>
     */
    @NameInMap("Metrics")
    public java.util.List<DescribeDiagnosticMetricsResponseBodyMetrics> metrics;

    /**
     * <p>The list of diagnostic metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The query token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
     */
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
        /**
         * <p>CPU diagnostic</p>
         * 
         * <strong>example:</strong>
         * <p>The resource type supported by the diagnostic metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The operating system type supported by the diagnostic metric. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * <li>All: both Windows and Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GuestMetric")
        public Boolean guestMetric;

        /**
         * <p>The description of the diagnostic metric.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("MetricCategory")
        public String metricCategory;

        /**
         * <p>The name of the diagnostic metric.</p>
         * 
         * <strong>example:</strong>
         * <p>GuestOS.WinFirewall</p>
         */
        @NameInMap("MetricId")
        public String metricId;

        /**
         * <p>CPU diagnostic</p>
         * 
         * <strong>example:</strong>
         * <p>The category of the diagnostic metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>Indicates whether the diagnostic metric needs to be assessed by running a Cloud Assistant command in a guest operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
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
