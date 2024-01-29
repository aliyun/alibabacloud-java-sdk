// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMigrationTaskResponseBody body;

    public static DeleteMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationTaskResponse self = new DeleteMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMigrationTaskResponse setBody(DeleteMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
