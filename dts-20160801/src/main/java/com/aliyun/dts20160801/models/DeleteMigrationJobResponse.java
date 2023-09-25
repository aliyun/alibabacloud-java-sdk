// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DeleteMigrationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMigrationJobResponseBody body;

    public static DeleteMigrationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationJobResponse self = new DeleteMigrationJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMigrationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMigrationJobResponse setBody(DeleteMigrationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMigrationJobResponseBody getBody() {
        return this.body;
    }

}
