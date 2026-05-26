// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetTokenVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTokenVaultResponseBody body;

    public static GetTokenVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenVaultResponse self = new GetTokenVaultResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTokenVaultResponse setBody(GetTokenVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenVaultResponseBody getBody() {
        return this.body;
    }

}
