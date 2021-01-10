// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class RegisterFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterFaceResponseBody body;

    public static RegisterFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceResponse self = new RegisterFaceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterFaceResponse setBody(RegisterFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterFaceResponseBody getBody() {
        return this.body;
    }

}
