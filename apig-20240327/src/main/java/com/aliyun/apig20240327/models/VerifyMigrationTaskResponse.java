// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class VerifyMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyMigrationTaskResponseBody body;

    public static VerifyMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMigrationTaskResponse self = new VerifyMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyMigrationTaskResponse setBody(VerifyMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
