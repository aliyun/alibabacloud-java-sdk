// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsFlowsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListDashboardDetailsFlowsResponseBodyResult result;

    public static ListDashboardDetailsFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsFlowsResponseBody self = new ListDashboardDetailsFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardDetailsFlowsResponseBody setResult(ListDashboardDetailsFlowsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDashboardDetailsFlowsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDashboardDetailsFlowsResponseBodyResultMetricData extends TeaModel {
        @NameInMap("MetricRes")
        public java.util.Map<String, ?> metricRes;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("TraceId")
        public String traceId;

        public static ListDashboardDetailsFlowsResponseBodyResultMetricData build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardDetailsFlowsResponseBodyResultMetricData self = new ListDashboardDetailsFlowsResponseBodyResultMetricData();
            return TeaModel.build(map, self);
        }

        public ListDashboardDetailsFlowsResponseBodyResultMetricData setMetricRes(java.util.Map<String, ?> metricRes) {
            this.metricRes = metricRes;
            return this;
        }
        public java.util.Map<String, ?> getMetricRes() {
            return this.metricRes;
        }

        public ListDashboardDetailsFlowsResponseBodyResultMetricData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListDashboardDetailsFlowsResponseBodyResultMetricData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class ListDashboardDetailsFlowsResponseBodyResult extends TeaModel {
        @NameInMap("MetricData")
        public java.util.List<ListDashboardDetailsFlowsResponseBodyResultMetricData> metricData;

        @NameInMap("MetricType")
        public String metricType;

        public static ListDashboardDetailsFlowsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardDetailsFlowsResponseBodyResult self = new ListDashboardDetailsFlowsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardDetailsFlowsResponseBodyResult setMetricData(java.util.List<ListDashboardDetailsFlowsResponseBodyResultMetricData> metricData) {
            this.metricData = metricData;
            return this;
        }
        public java.util.List<ListDashboardDetailsFlowsResponseBodyResultMetricData> getMetricData() {
            return this.metricData;
        }

        public ListDashboardDetailsFlowsResponseBodyResult setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

    }

}
