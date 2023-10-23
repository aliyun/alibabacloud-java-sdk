// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStorageOrderResponseBody body;

    public static QueryStorageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderResponse self = new QueryStorageOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStorageOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStorageOrderResponse setBody(QueryStorageOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStorageOrderResponseBody getBody() {
        return this.body;
    }

}
