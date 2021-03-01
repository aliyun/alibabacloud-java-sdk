// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QuerySlsLogStoreListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QuerySlsLogStoreListResponse setBody(QuerySlsLogStoreListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlsLogStoreListResponseBody getBody() {
        return this.body;
    }

}
