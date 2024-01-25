// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVaultResponseBody body;

    public static CreateVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVaultResponse self = new CreateVaultResponse();
        return TeaModel.build(map, self);
    }

    public CreateVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVaultResponse setBody(CreateVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVaultResponseBody getBody() {
        return this.body;
    }

}
