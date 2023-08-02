// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class InitVectorDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitVectorDatabaseResponseBody body;

    public static InitVectorDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        InitVectorDatabaseResponse self = new InitVectorDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public InitVectorDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitVectorDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitVectorDatabaseResponse setBody(InitVectorDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public InitVectorDatabaseResponseBody getBody() {
        return this.body;
    }

}
