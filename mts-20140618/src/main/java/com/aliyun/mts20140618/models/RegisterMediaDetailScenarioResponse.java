// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterMediaDetailScenarioResponseBody body;

    public static RegisterMediaDetailScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailScenarioResponse self = new RegisterMediaDetailScenarioResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMediaDetailScenarioResponse setBody(RegisterMediaDetailScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMediaDetailScenarioResponseBody getBody() {
        return this.body;
    }

}
