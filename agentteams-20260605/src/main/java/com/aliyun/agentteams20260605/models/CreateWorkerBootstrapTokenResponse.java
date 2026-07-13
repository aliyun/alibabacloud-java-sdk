// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerBootstrapTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkerBootstrapTokenResponseBody body;

    public static CreateWorkerBootstrapTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerBootstrapTokenResponse self = new CreateWorkerBootstrapTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkerBootstrapTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkerBootstrapTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkerBootstrapTokenResponse setBody(CreateWorkerBootstrapTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkerBootstrapTokenResponseBody getBody() {
        return this.body;
    }

}
