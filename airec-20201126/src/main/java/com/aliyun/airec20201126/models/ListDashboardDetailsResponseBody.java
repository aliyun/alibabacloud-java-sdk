// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsResponseBody extends TeaModel {
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
    public java.util.List<ListDashboardDetailsResponseBodyResult> result;

    public static ListDashboardDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsResponseBody self = new ListDashboardDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("detail")
        public java.util.Map<String, ?> detail;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("total")
        public java.util.Map<String, ?> total;

        public static ListDashboardDetailsResponseBodyResultMetricRes build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardDetailsResponseBodyResultMetricRes self = new ListDashboardDetailsResponseBodyResultMetricRes();
            return TeaModel.build(map, self);
        }

        public ListDashboardDetailsResponseBodyResultMetricRes setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public ListDashboardDetailsResponseBodyResultMetricRes setTotal(java.util.Map<String, ?> total) {
            this.total = total;
            return this;
        }
        public java.util.Map<String, ?> getTotal() {
            return this.total;
        }

    }

    public static class ListDashboardDetailsResponseBodyResult extends TeaModel {
        @NameInMap("metricRes")
        public ListDashboardDetailsResponseBodyResultMetricRes metricRes;

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
