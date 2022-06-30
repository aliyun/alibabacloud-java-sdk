// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOfflineTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOfflineTaskProgressResponseBody body;

    public static QueryOfflineTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOfflineTaskProgressResponse self = new QueryOfflineTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryOfflineTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOfflineTaskProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOfflineTaskProgressResponse setBody(QueryOfflineTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOfflineTaskProgressResponseBody getBody() {
        return this.body;
    }

}
