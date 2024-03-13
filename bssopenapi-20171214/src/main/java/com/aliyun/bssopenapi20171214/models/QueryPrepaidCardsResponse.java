// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPrepaidCardsResponseBody body;

    public static QueryPrepaidCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsResponse self = new QueryPrepaidCardsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrepaidCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPrepaidCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPrepaidCardsResponse setBody(QueryPrepaidCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPrepaidCardsResponseBody getBody() {
        return this.body;
    }

}
