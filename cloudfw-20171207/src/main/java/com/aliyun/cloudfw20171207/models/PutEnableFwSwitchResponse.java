// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PutEnableFwSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEnableFwSwitchResponse setBody(PutEnableFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnableFwSwitchResponseBody getBody() {
        return this.body;
    }

}
