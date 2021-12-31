// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ResetPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ResetPasswordResponse setBody(ResetPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetPasswordResponseBody getBody() {
        return this.body;
    }

}
