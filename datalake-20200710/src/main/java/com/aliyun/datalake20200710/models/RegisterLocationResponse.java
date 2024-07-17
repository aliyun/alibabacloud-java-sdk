// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RegisterLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterLocationResponseBody body;

    public static RegisterLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterLocationResponse self = new RegisterLocationResponse();
        return TeaModel.build(map, self);
    }

    public RegisterLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterLocationResponse setBody(RegisterLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterLocationResponseBody getBody() {
        return this.body;
    }

}
