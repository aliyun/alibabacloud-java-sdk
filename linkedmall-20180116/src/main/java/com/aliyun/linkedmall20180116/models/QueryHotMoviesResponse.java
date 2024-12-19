// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHotMoviesResponseBody body;

    public static QueryHotMoviesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotMoviesResponse self = new QueryHotMoviesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotMoviesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotMoviesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotMoviesResponse setBody(QueryHotMoviesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotMoviesResponseBody getBody() {
        return this.body;
    }

}
