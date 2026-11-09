// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RebuildSandboxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebuildSandboxResponseBody body;

    public static RebuildSandboxResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildSandboxResponse self = new RebuildSandboxResponse();
        return TeaModel.build(map, self);
    }

    public RebuildSandboxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildSandboxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildSandboxResponse setBody(RebuildSandboxResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildSandboxResponseBody getBody() {
        return this.body;
    }

}
