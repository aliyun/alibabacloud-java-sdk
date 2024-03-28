// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RegisterFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterFileResponseBody body;

    public static RegisterFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterFileResponse self = new RegisterFileResponse();
        return TeaModel.build(map, self);
    }

    public RegisterFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterFileResponse setBody(RegisterFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterFileResponseBody getBody() {
        return this.body;
    }

}
