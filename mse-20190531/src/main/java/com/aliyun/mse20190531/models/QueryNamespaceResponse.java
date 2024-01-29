// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryNamespaceResponseBody body;

    public static QueryNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNamespaceResponse self = new QueryNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNamespaceResponse setBody(QueryNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNamespaceResponseBody getBody() {
        return this.body;
    }

}
