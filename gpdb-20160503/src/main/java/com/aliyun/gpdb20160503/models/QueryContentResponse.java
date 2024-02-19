// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryContentResponseBody body;

    public static QueryContentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentResponse self = new QueryContentResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryContentResponse setBody(QueryContentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryContentResponseBody getBody() {
        return this.body;
    }

}
