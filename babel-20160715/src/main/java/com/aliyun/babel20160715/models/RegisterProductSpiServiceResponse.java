// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class RegisterProductSpiServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterProductSpiServiceResponseBody body;

    public static RegisterProductSpiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterProductSpiServiceResponse self = new RegisterProductSpiServiceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterProductSpiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterProductSpiServiceResponse setBody(RegisterProductSpiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterProductSpiServiceResponseBody getBody() {
        return this.body;
    }

}
