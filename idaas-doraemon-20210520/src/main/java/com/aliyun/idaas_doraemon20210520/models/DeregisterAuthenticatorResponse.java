// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class DeregisterAuthenticatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeregisterAuthenticatorResponse setBody(DeregisterAuthenticatorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterAuthenticatorResponseBody getBody() {
        return this.body;
    }

}
