// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTraceAbJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceAbJobResponseBody body;

    public static QueryTraceAbJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbJobResponse self = new QueryTraceAbJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceAbJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceAbJobResponse setBody(QueryTraceAbJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceAbJobResponseBody getBody() {
        return this.body;
    }

}
