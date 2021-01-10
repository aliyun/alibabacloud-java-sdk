// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMovieTicketsResponseBody body;

    public static QueryMovieTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieTicketsResponse self = new QueryMovieTicketsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMovieTicketsResponse setBody(QueryMovieTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMovieTicketsResponseBody getBody() {
        return this.body;
    }

}
