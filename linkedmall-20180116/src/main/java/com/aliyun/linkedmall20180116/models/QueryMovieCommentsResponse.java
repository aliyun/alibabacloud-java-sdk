// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieCommentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMovieCommentsResponseBody body;

    public static QueryMovieCommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieCommentsResponse self = new QueryMovieCommentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieCommentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMovieCommentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMovieCommentsResponse setBody(QueryMovieCommentsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMovieCommentsResponseBody getBody() {
        return this.body;
    }

}
