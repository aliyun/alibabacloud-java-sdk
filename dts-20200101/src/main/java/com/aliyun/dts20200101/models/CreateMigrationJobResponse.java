// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMigrationJobResponseBody body;

    public static CreateMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationJobResponse self = new CreateMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMigrationJobResponse setBody(CreateMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrationJobResponseBody getBody() {
        return this.body;
    }

}
