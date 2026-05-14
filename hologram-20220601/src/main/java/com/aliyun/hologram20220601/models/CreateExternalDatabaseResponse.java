// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateExternalDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExternalDatabaseResponseBody body;

    public static CreateExternalDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalDatabaseResponse self = new CreateExternalDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateExternalDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExternalDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExternalDatabaseResponse setBody(CreateExternalDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalDatabaseResponseBody getBody() {
        return this.body;
    }

}
