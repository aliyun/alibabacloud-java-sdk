// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPrevLimitNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPrevLimitNewResponseBody body;

    public static QueryPrevLimitNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrevLimitNewResponse self = new QueryPrevLimitNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrevLimitNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPrevLimitNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPrevLimitNewResponse setBody(QueryPrevLimitNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPrevLimitNewResponseBody getBody() {
        return this.body;
    }

}
