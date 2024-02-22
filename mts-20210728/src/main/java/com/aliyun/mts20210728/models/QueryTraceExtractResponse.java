// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceExtractResponseBody body;

    public static QueryTraceExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractResponse self = new QueryTraceExtractResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceExtractResponse setBody(QueryTraceExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceExtractResponseBody getBody() {
        return this.body;
    }

}
