// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateActivationResponseBody body;

    public static CreateActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationResponse self = new CreateActivationResponse();
        return TeaModel.build(map, self);
    }

    public CreateActivationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateActivationResponse setBody(CreateActivationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateActivationResponseBody getBody() {
        return this.body;
    }

}
