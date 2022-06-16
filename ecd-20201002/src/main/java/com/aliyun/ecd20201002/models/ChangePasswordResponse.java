// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ChangePasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangePasswordResponseBody body;

    public static ChangePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponse self = new ChangePasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangePasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangePasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangePasswordResponse setBody(ChangePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangePasswordResponseBody getBody() {
        return this.body;
    }

}
