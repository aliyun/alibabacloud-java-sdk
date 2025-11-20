// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateSandboxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SandboxResult body;

    public static CreateSandboxResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxResponse self = new CreateSandboxResponse();
        return TeaModel.build(map, self);
    }

    public CreateSandboxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSandboxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSandboxResponse setBody(SandboxResult body) {
        this.body = body;
        return this;
    }
    public SandboxResult getBody() {
        return this.body;
    }

}
