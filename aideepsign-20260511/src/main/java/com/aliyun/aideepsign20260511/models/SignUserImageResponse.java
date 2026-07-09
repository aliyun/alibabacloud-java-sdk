// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class SignUserImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SignUserImageResponseBody body;

    public static SignUserImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SignUserImageResponse self = new SignUserImageResponse();
        return TeaModel.build(map, self);
    }

    public SignUserImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignUserImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignUserImageResponse setBody(SignUserImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SignUserImageResponseBody getBody() {
        return this.body;
    }

}
