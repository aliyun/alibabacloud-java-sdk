// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateTokenVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTokenVaultResponseBody body;

    public static CreateTokenVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenVaultResponse self = new CreateTokenVaultResponse();
        return TeaModel.build(map, self);
    }

    public CreateTokenVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTokenVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTokenVaultResponse setBody(CreateTokenVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTokenVaultResponseBody getBody() {
        return this.body;
    }

}
