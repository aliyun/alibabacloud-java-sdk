// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateAPIKeyCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAPIKeyCredentialProviderResponseBody body;

    public static CreateAPIKeyCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAPIKeyCredentialProviderResponse self = new CreateAPIKeyCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAPIKeyCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAPIKeyCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAPIKeyCredentialProviderResponse setBody(CreateAPIKeyCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAPIKeyCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
