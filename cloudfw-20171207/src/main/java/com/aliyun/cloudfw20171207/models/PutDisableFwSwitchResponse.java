// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutDisableFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PutDisableFwSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDisableFwSwitchResponse setBody(PutDisableFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDisableFwSwitchResponseBody getBody() {
        return this.body;
    }

}
