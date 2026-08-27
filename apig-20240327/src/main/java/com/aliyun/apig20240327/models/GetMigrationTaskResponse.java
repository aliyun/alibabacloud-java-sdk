// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMigrationTaskResponseBody body;

    public static GetMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationTaskResponse self = new GetMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMigrationTaskResponse setBody(GetMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
