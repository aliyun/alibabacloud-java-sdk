// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMigrationTaskResponseBody body;

    public static CreateMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationTaskResponse self = new CreateMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMigrationTaskResponse setBody(CreateMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
