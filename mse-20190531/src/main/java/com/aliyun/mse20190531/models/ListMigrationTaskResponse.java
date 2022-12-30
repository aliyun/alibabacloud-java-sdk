// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListMigrationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMigrationTaskResponseBody body;

    public static ListMigrationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationTaskResponse self = new ListMigrationTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationTaskResponse setBody(ListMigrationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationTaskResponseBody getBody() {
        return this.body;
    }

}
