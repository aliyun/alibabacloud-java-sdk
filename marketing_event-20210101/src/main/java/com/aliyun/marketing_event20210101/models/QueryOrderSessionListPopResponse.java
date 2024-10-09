// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryOrderSessionListPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderSessionListPopResponseBody body;

    public static QueryOrderSessionListPopResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSessionListPopResponse self = new QueryOrderSessionListPopResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderSessionListPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderSessionListPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderSessionListPopResponse setBody(QueryOrderSessionListPopResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderSessionListPopResponseBody getBody() {
        return this.body;
    }

}
