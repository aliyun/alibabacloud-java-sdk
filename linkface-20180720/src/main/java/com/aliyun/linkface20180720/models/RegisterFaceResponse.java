// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class RegisterFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RegisterFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterFaceResponse setBody(RegisterFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterFaceResponseBody getBody() {
        return this.body;
    }

}
