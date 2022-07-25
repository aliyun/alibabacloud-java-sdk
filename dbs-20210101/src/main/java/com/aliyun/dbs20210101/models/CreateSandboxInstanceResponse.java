// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateSandboxInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSandboxInstanceResponseBody body;

    public static CreateSandboxInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxInstanceResponse self = new CreateSandboxInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSandboxInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSandboxInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSandboxInstanceResponse setBody(CreateSandboxInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSandboxInstanceResponseBody getBody() {
        return this.body;
    }

}
