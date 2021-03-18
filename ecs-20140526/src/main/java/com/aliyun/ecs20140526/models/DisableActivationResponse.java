// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableActivationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableActivationResponseBody body;

    public static DisableActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableActivationResponse self = new DisableActivationResponse();
        return TeaModel.build(map, self);
    }

    public DisableActivationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableActivationResponse setBody(DisableActivationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableActivationResponseBody getBody() {
        return this.body;
    }

}
