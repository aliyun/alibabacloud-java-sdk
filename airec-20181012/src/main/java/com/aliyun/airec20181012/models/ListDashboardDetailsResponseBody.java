// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListDashboardDetailsResponseBodyResult> result;

    public static ListDashboardDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsResponseBody self = new ListDashboardDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardDetailsResponseBody setResult(java.util.List<ListDashboardDetailsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDashboardDetailsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDashboardDetailsResponseBodyResultMetricRes extends TeaModel {
        @NameInMap("Total")
        public java.util.Map<String, ?> total;

        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        public static ListDashboardDetailsResponseBodyResultMetricRes build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardDetailsResponseBodyResultMetricRes self = new ListDashboardDetailsResponseBodyResultMetricRes();
            return TeaModel.build(map, self);
        }

        public ListDashboardDetailsResponseBodyResultMetricRes setTotal(java.util.Map<String, ?> total) {
            this.total = total;
            return this;
        }
        public java.util.Map<String, ?> getTotal() {
            return this.total;
        }

        public ListDashboardDetailsResponseBodyResultMetricRes setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

    }

    public static class ListDashboardDetailsResponseBodyResult extends TeaModel {
        @NameInMap("MetricRes")
        public ListDashboardDetailsResponseBodyResultMetricRes metricRes;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("TraceId")
        public String traceId;

        public static ListDashboardDetailsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardDetailsResponseBodyResult self = new ListDashboardDetailsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardDetailsResponseBodyResult setMetricRes(ListDashboardDetailsResponseBodyResultMetricRes metricRes) {
            this.metricRes = metricRes;
            return this;
        }
        public ListDashboardDetailsResponseBodyResultMetricRes getMetricRes() {
            return this.metricRes;
        }

        public ListDashboardDetailsResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListDashboardDetailsResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
