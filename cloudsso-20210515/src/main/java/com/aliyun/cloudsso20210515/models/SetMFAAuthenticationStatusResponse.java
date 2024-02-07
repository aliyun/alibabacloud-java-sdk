// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetMFAAuthenticationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetMFAAuthenticationStatusResponseBody body;

    public static SetMFAAuthenticationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMFAAuthenticationStatusResponse self = new SetMFAAuthenticationStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetMFAAuthenticationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMFAAuthenticationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMFAAuthenticationStatusResponse setBody(SetMFAAuthenticationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

}
