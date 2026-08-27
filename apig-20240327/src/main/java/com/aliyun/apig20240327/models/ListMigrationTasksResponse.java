// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMigrationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMigrationTasksResponseBody body;

    public static ListMigrationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationTasksResponse self = new ListMigrationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationTasksResponse setBody(ListMigrationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationTasksResponseBody getBody() {
        return this.body;
    }

}
