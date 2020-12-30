// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class RegisterFaceImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterFaceImageResponseBody body;

    public static RegisterFaceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceImageResponse self = new RegisterFaceImageResponse();
        return TeaModel.build(map, self);
    }

    public RegisterFaceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterFaceImageResponse setBody(RegisterFaceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterFaceImageResponseBody getBody() {
        return this.body;
    }

}
