// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RegisterServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterServiceResponseBody body;

    public static RegisterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterServiceResponse self = new RegisterServiceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterServiceResponse setBody(RegisterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterServiceResponseBody getBody() {
        return this.body;
    }

}
