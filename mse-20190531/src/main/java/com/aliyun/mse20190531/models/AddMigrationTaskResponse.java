// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMigrationTaskResponseBody body;

    public static AddMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMigrationTaskResponse self = new AddMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMigrationTaskResponse setBody(AddMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
