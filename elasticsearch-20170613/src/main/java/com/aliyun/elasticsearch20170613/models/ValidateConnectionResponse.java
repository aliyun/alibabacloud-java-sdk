// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateConnectionResponseBody body;

    public static ValidateConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateConnectionResponse self = new ValidateConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ValidateConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateConnectionResponse setBody(ValidateConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateConnectionResponseBody getBody() {
        return this.body;
    }

}
