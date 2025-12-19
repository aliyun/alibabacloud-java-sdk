// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteAPIKeyCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAPIKeyCredentialProviderResponseBody body;

    public static DeleteAPIKeyCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAPIKeyCredentialProviderResponse self = new DeleteAPIKeyCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAPIKeyCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAPIKeyCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAPIKeyCredentialProviderResponse setBody(DeleteAPIKeyCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAPIKeyCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
