// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSandboxRebuildOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSandboxRebuildOperationResponseBody body;

    public static GetSandboxRebuildOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSandboxRebuildOperationResponse self = new GetSandboxRebuildOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetSandboxRebuildOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSandboxRebuildOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSandboxRebuildOperationResponse setBody(GetSandboxRebuildOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSandboxRebuildOperationResponseBody getBody() {
        return this.body;
    }

}
