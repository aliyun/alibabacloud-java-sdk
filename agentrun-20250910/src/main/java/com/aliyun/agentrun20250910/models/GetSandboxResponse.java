// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetSandboxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SandboxResult body;

    public static GetSandboxResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSandboxResponse self = new GetSandboxResponse();
        return TeaModel.build(map, self);
    }

    public GetSandboxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSandboxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSandboxResponse setBody(SandboxResult body) {
        this.body = body;
        return this;
    }
    public SandboxResult getBody() {
        return this.body;
    }

}
