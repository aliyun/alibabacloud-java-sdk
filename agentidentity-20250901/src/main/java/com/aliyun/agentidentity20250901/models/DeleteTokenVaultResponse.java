// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteTokenVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTokenVaultResponseBody body;

    public static DeleteTokenVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTokenVaultResponse self = new DeleteTokenVaultResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTokenVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTokenVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTokenVaultResponse setBody(DeleteTokenVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTokenVaultResponseBody getBody() {
        return this.body;
    }

}
