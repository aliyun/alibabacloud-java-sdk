// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAgenticFsMountRamAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody body;

    public static VerifyWorkspaceAgenticFsMountRamAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAgenticFsMountRamAuthorizationResponse self = new VerifyWorkspaceAgenticFsMountRamAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponse setBody(VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWorkspaceAgenticFsMountRamAuthorizationResponseBody getBody() {
        return this.body;
    }

}
