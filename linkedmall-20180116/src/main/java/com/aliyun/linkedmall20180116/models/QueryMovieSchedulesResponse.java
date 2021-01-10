// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMovieSchedulesResponseBody body;

    public static QueryMovieSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSchedulesResponse self = new QueryMovieSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMovieSchedulesResponse setBody(QueryMovieSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMovieSchedulesResponseBody getBody() {
        return this.body;
    }

}
