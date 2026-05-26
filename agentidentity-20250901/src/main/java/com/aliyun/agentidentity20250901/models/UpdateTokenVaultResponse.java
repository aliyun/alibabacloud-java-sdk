// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateTokenVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTokenVaultResponseBody body;

    public static UpdateTokenVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTokenVaultResponse self = new UpdateTokenVaultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTokenVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTokenVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTokenVaultResponse setBody(UpdateTokenVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTokenVaultResponseBody getBody() {
        return this.body;
    }

}
