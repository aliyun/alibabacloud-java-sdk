// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStorageOrderListResponseBody body;

    public static QueryStorageOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderListResponse self = new QueryStorageOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStorageOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStorageOrderListResponse setBody(QueryStorageOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStorageOrderListResponseBody getBody() {
        return this.body;
    }

}
