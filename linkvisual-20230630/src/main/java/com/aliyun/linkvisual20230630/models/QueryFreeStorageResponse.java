// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryFreeStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFreeStorageResponseBody body;

    public static QueryFreeStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFreeStorageResponse self = new QueryFreeStorageResponse();
        return TeaModel.build(map, self);
    }

    public QueryFreeStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFreeStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFreeStorageResponse setBody(QueryFreeStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFreeStorageResponseBody getBody() {
        return this.body;
    }

}
