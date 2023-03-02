// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class AuthorizeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeDeviceResponseBody body;

    public static AuthorizeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeDeviceResponse self = new AuthorizeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeDeviceResponse setBody(AuthorizeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeDeviceResponseBody getBody() {
        return this.body;
    }

}
