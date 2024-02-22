// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RegisterServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RegisterServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterServiceResponse setBody(RegisterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterServiceResponseBody getBody() {
        return this.body;
    }

}
