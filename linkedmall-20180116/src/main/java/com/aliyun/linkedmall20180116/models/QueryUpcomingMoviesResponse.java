// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUpcomingMoviesResponseBody body;

    public static QueryUpcomingMoviesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesResponse self = new QueryUpcomingMoviesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUpcomingMoviesResponse setBody(QueryUpcomingMoviesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUpcomingMoviesResponseBody getBody() {
        return this.body;
    }

}
