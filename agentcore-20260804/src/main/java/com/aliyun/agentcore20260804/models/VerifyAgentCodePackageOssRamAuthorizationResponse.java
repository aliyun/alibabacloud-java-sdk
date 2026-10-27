// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyAgentCodePackageOssRamAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyAgentCodePackageOssRamAuthorizationResponseBody body;

    public static VerifyAgentCodePackageOssRamAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgentCodePackageOssRamAuthorizationResponse self = new VerifyAgentCodePackageOssRamAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAgentCodePackageOssRamAuthorizationResponse setBody(VerifyAgentCodePackageOssRamAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAgentCodePackageOssRamAuthorizationResponseBody getBody() {
        return this.body;
    }

}
