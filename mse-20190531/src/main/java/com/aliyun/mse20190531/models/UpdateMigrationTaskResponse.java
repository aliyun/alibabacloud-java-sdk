// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMigrationTaskResponseBody body;

    public static UpdateMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMigrationTaskResponse self = new UpdateMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMigrationTaskResponse setBody(UpdateMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
