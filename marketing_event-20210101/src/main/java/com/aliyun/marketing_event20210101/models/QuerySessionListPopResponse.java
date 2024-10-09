// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySessionListPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionListPopResponseBody body;

    public static QuerySessionListPopResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionListPopResponse self = new QuerySessionListPopResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionListPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionListPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionListPopResponse setBody(QuerySessionListPopResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionListPopResponseBody getBody() {
        return this.body;
    }

}
