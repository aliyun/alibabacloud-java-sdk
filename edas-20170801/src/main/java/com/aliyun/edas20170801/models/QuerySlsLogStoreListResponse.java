// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySlsLogStoreListResponseBody body;

    public static QuerySlsLogStoreListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogStoreListResponse self = new QuerySlsLogStoreListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogStoreListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlsLogStoreListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlsLogStoreListResponse setBody(QuerySlsLogStoreListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlsLogStoreListResponseBody getBody() {
        return this.body;
    }

}
