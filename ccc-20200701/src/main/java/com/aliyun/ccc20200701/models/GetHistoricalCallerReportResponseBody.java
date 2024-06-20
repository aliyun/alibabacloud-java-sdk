// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCallerReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHistoricalCallerReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHistoricalCallerReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCallerReportResponseBody self = new GetHistoricalCallerReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCallerReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHistoricalCallerReportResponseBody setData(GetHistoricalCallerReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoricalCallerReportResponseBodyData getData() {
        return this.data;
    }

    public GetHistoricalCallerReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHistoricalCallerReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoricalCallerReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistoricalCallerReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1646917200000</p>
         */
        @NameInMap("LastCallingTime")
        public Long lastCallingTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetHistoricalCallerReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoricalCallerReportResponseBodyData self = new GetHistoricalCallerReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoricalCallerReportResponseBodyData setLastCallingTime(Long lastCallingTime) {
            this.lastCallingTime = lastCallingTime;
            return this;
        }
        public Long getLastCallingTime() {
            return this.lastCallingTime;
        }

        public GetHistoricalCallerReportResponseBodyData setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

}
