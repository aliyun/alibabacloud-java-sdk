// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCallerReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHistoricalCallerReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("LastCallingTime")
        public Long lastCallingTime;

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
