// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindAligenieUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindAligenieUserResponseBody body;

    public static UnbindAligenieUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAligenieUserResponse self = new UnbindAligenieUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAligenieUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAligenieUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAligenieUserResponse setBody(UnbindAligenieUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAligenieUserResponseBody getBody() {
        return this.body;
    }

}
