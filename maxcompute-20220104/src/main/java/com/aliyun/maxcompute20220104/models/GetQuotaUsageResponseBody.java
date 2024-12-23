// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageResponseBody extends TeaModel {
    @NameInMap("data")
    public GetQuotaUsageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
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
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("type")
        public String type;

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
        @NameInMap("metrics")
        public java.util.Map<String, ?> metrics;

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
