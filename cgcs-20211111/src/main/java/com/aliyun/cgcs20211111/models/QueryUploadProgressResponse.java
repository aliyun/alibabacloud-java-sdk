// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryUploadProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUploadProgressResponseBody body;

    public static QueryUploadProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUploadProgressResponse self = new QueryUploadProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryUploadProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUploadProgressResponse setBody(QueryUploadProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUploadProgressResponseBody getBody() {
        return this.body;
    }

}
