// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySearchIndexResponseBody body;

    public static QuerySearchIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchIndexResponse self = new QuerySearchIndexResponse();
        return TeaModel.build(map, self);
    }

    public QuerySearchIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySearchIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySearchIndexResponse setBody(QuerySearchIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySearchIndexResponseBody getBody() {
        return this.body;
    }

}
