// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class DeregisterAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterAuthenticatorResponseBody body;

    public static DeregisterAuthenticatorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterAuthenticatorResponse self = new DeregisterAuthenticatorResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterAuthenticatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterAuthenticatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterAuthenticatorResponse setBody(DeregisterAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
