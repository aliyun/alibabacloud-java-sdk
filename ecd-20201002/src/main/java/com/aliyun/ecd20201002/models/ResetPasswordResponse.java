// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetPasswordResponseBody body;

    public static ResetPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetPasswordResponse self = new ResetPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetPasswordResponse setBody(ResetPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetPasswordResponseBody getBody() {
        return this.body;
    }

}
