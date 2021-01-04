// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutEnableFwSwitchResponseBody body;

    public static PutEnableFwSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEnableFwSwitchResponse self = new PutEnableFwSwitchResponse();
        return TeaModel.build(map, self);
    }

    public PutEnableFwSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEnableFwSwitchResponse setBody(PutEnableFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnableFwSwitchResponseBody getBody() {
        return this.body;
    }

}
