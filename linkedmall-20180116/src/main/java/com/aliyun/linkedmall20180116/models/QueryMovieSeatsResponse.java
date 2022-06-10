// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSeatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMovieSeatsResponseBody body;

    public static QueryMovieSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSeatsResponse self = new QueryMovieSeatsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMovieSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMovieSeatsResponse setBody(QueryMovieSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMovieSeatsResponseBody getBody() {
        return this.body;
    }

}
