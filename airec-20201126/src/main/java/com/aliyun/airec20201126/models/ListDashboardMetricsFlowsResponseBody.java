// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardMetricsFlowsResponseBody extends TeaModel {
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

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDashboardMetricsFlowsResponseBodyResult> result;

    public static ListDashboardMetricsFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardMetricsFlowsResponseBody self = new ListDashboardMetricsFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardMetricsFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardMetricsFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <p><strong>null</strong></p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("metricData")
        public java.util.Map<String, ?> metricData;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("metricType")
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
