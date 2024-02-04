// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStoriesResponseBody body;

    public static QueryStoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStoriesResponse self = new QueryStoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryStoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStoriesResponse setBody(QueryStoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStoriesResponseBody getBody() {
        return this.body;
    }

}
