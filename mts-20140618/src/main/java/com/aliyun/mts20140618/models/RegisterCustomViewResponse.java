// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterCustomViewResponseBody body;

    public static RegisterCustomViewResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomViewResponse self = new RegisterCustomViewResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCustomViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterCustomViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterCustomViewResponse setBody(RegisterCustomViewResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterCustomViewResponseBody getBody() {
        return this.body;
    }

}
