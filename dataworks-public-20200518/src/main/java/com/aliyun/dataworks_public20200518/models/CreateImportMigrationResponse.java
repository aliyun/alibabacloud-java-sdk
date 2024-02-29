// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateImportMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImportMigrationResponseBody body;

    public static CreateImportMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImportMigrationResponse self = new CreateImportMigrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateImportMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImportMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImportMigrationResponse setBody(CreateImportMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImportMigrationResponseBody getBody() {
        return this.body;
    }

}
