// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIdentityProviderSCIMResponseBody body;

    public static UpdateIdentityProviderSCIMResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderSCIMResponse self = new UpdateIdentityProviderSCIMResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderSCIMResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIdentityProviderSCIMResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIdentityProviderSCIMResponse setBody(UpdateIdentityProviderSCIMResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdentityProviderSCIMResponseBody getBody() {
        return this.body;
    }

}
