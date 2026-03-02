// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListRecentGovernanceMetricsResponseBody extends TeaModel {
    /**
     * <p>The time when the report was generated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-10T02:11:23Z</p>
     */
    @NameInMap("GenerateTime")
    public String generateTime;

    @NameInMap("GovernanceMetrics")
    public ListRecentGovernanceMetricsResponseBodyGovernanceMetrics governanceMetrics;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49846A91-C1C5-5C2B-BC64-8B0B7BADB4C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecentGovernanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentGovernanceMetricsResponseBody self = new ListRecentGovernanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentGovernanceMetricsResponseBody setGenerateTime(String generateTime) {
        this.generateTime = generateTime;
        return this;
    }
    public String getGenerateTime() {
        return this.generateTime;
    }

    public ListRecentGovernanceMetricsResponseBody setGovernanceMetrics(ListRecentGovernanceMetricsResponseBodyGovernanceMetrics governanceMetrics) {
        this.governanceMetrics = governanceMetrics;
        return this;
    }
    public ListRecentGovernanceMetricsResponseBodyGovernanceMetrics getGovernanceMetrics() {
        return this.governanceMetrics;
    }

    public ListRecentGovernanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric extends TeaModel {
        @NameInMap("GovernanceItem")
        public String governanceItem;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("MetricValue")
        public Object metricValue;

        public static ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric build(java.util.Map<String, ?> map) throws Exception {
            ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric self = new ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric();
            return TeaModel.build(map, self);
        }

        public ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric setGovernanceItem(String governanceItem) {
            this.governanceItem = governanceItem;
            return this;
        }
        public String getGovernanceItem() {
            return this.governanceItem;
        }

        public ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric setMetricValue(Object metricValue) {
            this.metricValue = metricValue;
            return this;
        }
        public Object getMetricValue() {
            return this.metricValue;
        }

    }

    public static class ListRecentGovernanceMetricsResponseBodyGovernanceMetrics extends TeaModel {
        @NameInMap("GovernanceMetric")
        public java.util.List<ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric> governanceMetric;

        public static ListRecentGovernanceMetricsResponseBodyGovernanceMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListRecentGovernanceMetricsResponseBodyGovernanceMetrics self = new ListRecentGovernanceMetricsResponseBodyGovernanceMetrics();
            return TeaModel.build(map, self);
        }

        public ListRecentGovernanceMetricsResponseBodyGovernanceMetrics setGovernanceMetric(java.util.List<ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric> governanceMetric) {
            this.governanceMetric = governanceMetric;
            return this;
        }
        public java.util.List<ListRecentGovernanceMetricsResponseBodyGovernanceMetricsGovernanceMetric> getGovernanceMetric() {
            return this.governanceMetric;
        }

    }

}
