// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyWorkspaceAcrRamAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWorkspaceAcrRamAuthorizationResponseBody body;

    public static VerifyWorkspaceAcrRamAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWorkspaceAcrRamAuthorizationResponse self = new VerifyWorkspaceAcrRamAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWorkspaceAcrRamAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWorkspaceAcrRamAuthorizationResponse setBody(VerifyWorkspaceAcrRamAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWorkspaceAcrRamAuthorizationResponseBody getBody() {
        return this.body;
    }

}
