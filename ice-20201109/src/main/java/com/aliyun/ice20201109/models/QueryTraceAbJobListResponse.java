// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceAbJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceAbJobListResponseBody body;

    public static QueryTraceAbJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbJobListResponse self = new QueryTraceAbJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceAbJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceAbJobListResponse setBody(QueryTraceAbJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceAbJobListResponseBody getBody() {
        return this.body;
    }

}
