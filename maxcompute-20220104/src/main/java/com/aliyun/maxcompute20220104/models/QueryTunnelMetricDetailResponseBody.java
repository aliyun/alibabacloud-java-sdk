// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricDetailResponseBody extends TeaModel {
    @NameInMap("data")
    public QueryTunnelMetricDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>plan \&quot;***\&quot; does not exist</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>0a06dd4516687375802853481ec9fd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryTunnelMetricDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricDetailResponseBody self = new QueryTunnelMetricDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricDetailResponseBody setData(QueryTunnelMetricDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTunnelMetricDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTunnelMetricDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryTunnelMetricDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryTunnelMetricDetailResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryTunnelMetricDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTunnelMetricDetailResponseBodyDataMetrics extends TeaModel {
        @NameInMap("metric")
        public java.util.Map<String, String> metric;

        /**
         * <strong>example:</strong>
         * <p>&quot;avgValue&quot;:&quot;11.5&quot;</p>
         */
        @NameInMap("value")
        public java.util.Map<String, ?> value;

        public static QueryTunnelMetricDetailResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTunnelMetricDetailResponseBodyDataMetrics self = new QueryTunnelMetricDetailResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTunnelMetricDetailResponseBodyDataMetrics setMetric(java.util.Map<String, String> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, String> getMetric() {
            return this.metric;
        }

        public QueryTunnelMetricDetailResponseBodyDataMetrics setValue(java.util.Map<String, ?> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, ?> getValue() {
            return this.value;
        }

    }

    public static class QueryTunnelMetricDetailResponseBodyData extends TeaModel {
        @NameInMap("metrics")
        public java.util.List<QueryTunnelMetricDetailResponseBodyDataMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>tableA</p>
         */
        @NameInMap("name")
        public String name;

        public static QueryTunnelMetricDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTunnelMetricDetailResponseBodyData self = new QueryTunnelMetricDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTunnelMetricDetailResponseBodyData setMetrics(java.util.List<QueryTunnelMetricDetailResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTunnelMetricDetailResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTunnelMetricDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
