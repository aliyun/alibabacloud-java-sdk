// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsFlowsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDashboardMetricsFlowsResponseBodyResult> result;

    public static ListDashboardMetricsFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsFlowsResponseBody self = new ListDashboardMetricsFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardMetricsFlowsResponseBody setResult(java.util.List<ListDashboardMetricsFlowsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDashboardMetricsFlowsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDashboardMetricsFlowsResponseBodyResult extends TeaModel {
        @NameInMap("MetricData")
        public java.util.Map<String, ?> metricData;

        @NameInMap("MetricType")
        public String metricType;

        public static ListDashboardMetricsFlowsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardMetricsFlowsResponseBodyResult self = new ListDashboardMetricsFlowsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardMetricsFlowsResponseBodyResult setMetricData(java.util.Map<String, ?> metricData) {
            this.metricData = metricData;
            return this;
        }
        public java.util.Map<String, ?> getMetricData() {
            return this.metricData;
        }

        public ListDashboardMetricsFlowsResponseBodyResult setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

}
