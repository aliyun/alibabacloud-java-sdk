// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossPrivatePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCrossPrivatePermissionResponseBody body;

    public static QueryCrossPrivatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossPrivatePermissionResponse self = new QueryCrossPrivatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCrossPrivatePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCrossPrivatePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCrossPrivatePermissionResponse setBody(QueryCrossPrivatePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCrossPrivatePermissionResponseBody getBody() {
        return this.body;
    }

}
