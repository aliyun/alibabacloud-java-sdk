// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIdentityProviderResponseBody body;

    public static DeleteIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderResponse self = new DeleteIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIdentityProviderResponse setBody(DeleteIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
