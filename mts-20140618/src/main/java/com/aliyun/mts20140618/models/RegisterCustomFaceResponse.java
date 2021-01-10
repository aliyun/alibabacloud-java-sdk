// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterCustomFaceResponseBody body;

    public static RegisterCustomFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomFaceResponse self = new RegisterCustomFaceResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCustomFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterCustomFaceResponse setBody(RegisterCustomFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCustomFaceResponseBody getBody() {
        return this.body;
    }

}
