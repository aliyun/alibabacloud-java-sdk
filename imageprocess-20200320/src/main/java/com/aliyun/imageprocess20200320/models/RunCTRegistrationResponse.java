// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunCTRegistrationResponseBody body;

    public static RunCTRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationResponse self = new RunCTRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCTRegistrationResponse setBody(RunCTRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCTRegistrationResponseBody getBody() {
        return this.body;
    }

}
