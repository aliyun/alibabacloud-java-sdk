// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetQuotaUsageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7a416652014358483492eea0b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetQuotaUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUsageResponseBody self = new GetQuotaUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaUsageResponseBody setData(GetQuotaUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQuotaUsageResponseBodyData getData() {
        return this.data;
    }

    public GetQuotaUsageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQuotaUsageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetQuotaUsageResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetQuotaUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaUsageResponseBodyDataPlot extends TeaModel {
        /**
         * <p>The title of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The type of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The data metric field.</p>
         */
        @NameInMap("yAxis")
        public java.util.List<String> yAxis;

        public static GetQuotaUsageResponseBodyDataPlot build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUsageResponseBodyDataPlot self = new GetQuotaUsageResponseBodyDataPlot();
            return TeaModel.build(map, self);
        }

        public GetQuotaUsageResponseBodyDataPlot setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetQuotaUsageResponseBodyDataPlot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaUsageResponseBodyDataPlot setYAxis(java.util.List<String> yAxis) {
            this.yAxis = yAxis;
            return this;
        }
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

    }

    public static class GetQuotaUsageResponseBodyData extends TeaModel {
        /**
         * <p>The metric results.</p>
         */
        @NameInMap("metrics")
        public java.util.Map<String, ?> metrics;

        /**
         * <p>The information about the chart.</p>
         */
        @NameInMap("plot")
        public java.util.List<GetQuotaUsageResponseBodyDataPlot> plot;

        public static GetQuotaUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaUsageResponseBodyData self = new GetQuotaUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQuotaUsageResponseBodyData setMetrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.Map<String, ?> getMetrics() {
            return this.metrics;
        }

        public GetQuotaUsageResponseBodyData setPlot(java.util.List<GetQuotaUsageResponseBodyDataPlot> plot) {
            this.plot = plot;
            return this;
        }
        public java.util.List<GetQuotaUsageResponseBodyDataPlot> getPlot() {
            return this.plot;
        }

    }

}
