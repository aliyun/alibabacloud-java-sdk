// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ResendVerifyActivateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResendVerifyActivateResponseBody body;

    public static ResendVerifyActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendVerifyActivateResponse self = new ResendVerifyActivateResponse();
        return TeaModel.build(map, self);
    }

    public ResendVerifyActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendVerifyActivateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendVerifyActivateResponse setBody(ResendVerifyActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendVerifyActivateResponseBody getBody() {
        return this.body;
    }

}
