// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNamespaceListResponseBody body;

    public static QueryNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNamespaceListResponse self = new QueryNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNamespaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNamespaceListResponse setBody(QueryNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNamespaceListResponseBody getBody() {
        return this.body;
    }

}
