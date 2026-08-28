// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentBootstrapTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExternalAgentBootstrapTokenResponseBody body;

    public static CreateExternalAgentBootstrapTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentBootstrapTokenResponse self = new CreateExternalAgentBootstrapTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentBootstrapTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExternalAgentBootstrapTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExternalAgentBootstrapTokenResponse setBody(CreateExternalAgentBootstrapTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalAgentBootstrapTokenResponseBody getBody() {
        return this.body;
    }

}
