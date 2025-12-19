// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIdentityProviderResponseBody body;

    public static UpdateIdentityProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderResponse self = new UpdateIdentityProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIdentityProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIdentityProviderResponse setBody(UpdateIdentityProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdentityProviderResponseBody getBody() {
        return this.body;
    }

}
