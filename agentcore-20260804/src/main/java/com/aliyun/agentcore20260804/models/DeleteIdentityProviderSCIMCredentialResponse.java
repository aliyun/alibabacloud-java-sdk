// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderSCIMCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIdentityProviderSCIMCredentialResponseBody body;

    public static DeleteIdentityProviderSCIMCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderSCIMCredentialResponse self = new DeleteIdentityProviderSCIMCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderSCIMCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIdentityProviderSCIMCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIdentityProviderSCIMCredentialResponse setBody(DeleteIdentityProviderSCIMCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIdentityProviderSCIMCredentialResponseBody getBody() {
        return this.body;
    }

}
