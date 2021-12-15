// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryTraceExtractResponseBodyData data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryTraceExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractResponseBody self = new QueryTraceExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractResponseBody setData(QueryTraceExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTraceExtractResponseBodyData getData() {
        return this.data;
    }

    public QueryTraceExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceExtractResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public QueryTraceExtractResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceExtractResponseBodyData extends TeaModel {
        // 溯源水印信息
        @NameInMap("Trace")
        public String trace;

        public static QueryTraceExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceExtractResponseBodyData self = new QueryTraceExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceExtractResponseBodyData setTrace(String trace) {
            this.trace = trace;
            return this;
        }
        public String getTrace() {
            return this.trace;
        }

    }

}
