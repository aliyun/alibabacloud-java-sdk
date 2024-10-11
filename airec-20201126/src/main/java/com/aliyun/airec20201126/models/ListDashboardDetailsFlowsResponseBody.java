// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsFlowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ListDashboardDetailsFlowsResponseBodyResult result;

    public static ListDashboardDetailsFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsFlowsResponseBody self = new ListDashboardDetailsFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardDetailsFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("metricRes")
        public java.util.Map<String, ?> metricRes;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("sceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("traceId")
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
        @NameInMap("metricData")
        public java.util.List<ListDashboardDetailsFlowsResponseBodyResultMetricData> metricData;

        /**
         * <strong>example:</strong>
         * <p>USERACTIONUV_COUNT</p>
         */
        @NameInMap("metricType")
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
