// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceOssMountRamAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWorkspaceOssMountRamAuthorizationResponseBody body;

    public static VerifyWorkspaceOssMountRamAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceOssMountRamAuthorizationResponse self = new VerifyWorkspaceOssMountRamAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWorkspaceOssMountRamAuthorizationResponse setBody(VerifyWorkspaceOssMountRamAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWorkspaceOssMountRamAuthorizationResponseBody getBody() {
        return this.body;
    }

}
