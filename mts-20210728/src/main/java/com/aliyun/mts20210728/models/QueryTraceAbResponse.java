// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceAbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceAbResponseBody body;

    public static QueryTraceAbResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbResponse self = new QueryTraceAbResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceAbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceAbResponse setBody(QueryTraceAbResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceAbResponseBody getBody() {
        return this.body;
    }

}
