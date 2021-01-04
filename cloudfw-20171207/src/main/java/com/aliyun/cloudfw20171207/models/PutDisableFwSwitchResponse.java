// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutDisableFwSwitchResponseBody body;

    public static PutDisableFwSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDisableFwSwitchResponse self = new PutDisableFwSwitchResponse();
        return TeaModel.build(map, self);
    }

    public PutDisableFwSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDisableFwSwitchResponse setBody(PutDisableFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDisableFwSwitchResponseBody getBody() {
        return this.body;
    }

}
