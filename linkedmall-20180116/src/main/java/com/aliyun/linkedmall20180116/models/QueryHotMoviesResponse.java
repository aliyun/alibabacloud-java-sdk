// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryHotMoviesResponse setBody(QueryHotMoviesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotMoviesResponseBody getBody() {
        return this.body;
    }

}
