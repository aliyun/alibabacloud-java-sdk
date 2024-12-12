// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceExtractJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryTraceExtractJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>ACB-44F2-5F2D-88D7-1283E70</strong></strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryTraceExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractJobResponseBody self = new QueryTraceExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractJobResponseBody setData(QueryTraceExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTraceExtractJobResponseBodyData getData() {
        return this.data;
    }

    public QueryTraceExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTraceExtractJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Trace")
        public String trace;

        public static QueryTraceExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceExtractJobResponseBodyData self = new QueryTraceExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceExtractJobResponseBodyData setTrace(String trace) {
            this.trace = trace;
            return this;
        }
        public String getTrace() {
            return this.trace;
        }

    }

}
