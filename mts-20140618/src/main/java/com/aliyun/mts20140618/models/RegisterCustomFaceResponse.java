// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RegisterCustomFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterCustomFaceResponse setBody(RegisterCustomFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCustomFaceResponseBody getBody() {
        return this.body;
    }

}
