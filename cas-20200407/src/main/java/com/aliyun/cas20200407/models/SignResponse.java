// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class SignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SignResponseBody body;

    public static SignResponse build(java.util.Map<String, ?> map) throws Exception {
        SignResponse self = new SignResponse();
        return TeaModel.build(map, self);
    }

    public SignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignResponse setBody(SignResponseBody body) {
        this.body = body;
        return this;
    }
    public SignResponseBody getBody() {
        return this.body;
    }

}
