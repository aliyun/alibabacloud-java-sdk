// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResetUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetUserPasswordResponseBody body;

    public static ResetUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordResponse self = new ResetUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetUserPasswordResponse setBody(ResetUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserPasswordResponseBody getBody() {
        return this.body;
    }

}
