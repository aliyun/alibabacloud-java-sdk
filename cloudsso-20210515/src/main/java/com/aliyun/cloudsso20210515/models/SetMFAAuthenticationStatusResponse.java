// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetMFAAuthenticationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetMFAAuthenticationStatusResponse setBody(SetMFAAuthenticationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMFAAuthenticationStatusResponseBody getBody() {
        return this.body;
    }

}
