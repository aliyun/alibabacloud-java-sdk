// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateExportMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExportMigrationResponseBody body;

    public static CreateExportMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExportMigrationResponse self = new CreateExportMigrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateExportMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExportMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExportMigrationResponse setBody(CreateExportMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExportMigrationResponseBody getBody() {
        return this.body;
    }

}
