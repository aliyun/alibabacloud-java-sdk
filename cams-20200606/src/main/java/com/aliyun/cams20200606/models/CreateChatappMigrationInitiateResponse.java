// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappMigrationInitiateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChatappMigrationInitiateResponseBody body;

    public static CreateChatappMigrationInitiateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappMigrationInitiateResponse self = new CreateChatappMigrationInitiateResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatappMigrationInitiateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatappMigrationInitiateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatappMigrationInitiateResponse setBody(CreateChatappMigrationInitiateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatappMigrationInitiateResponseBody getBody() {
        return this.body;
    }

}
