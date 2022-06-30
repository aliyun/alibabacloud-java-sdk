// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListMigrationJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMigrationJobsResponseBody body;

    public static ListMigrationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationJobsResponse self = new ListMigrationJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationJobsResponse setBody(ListMigrationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationJobsResponseBody getBody() {
        return this.body;
    }

}
