// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateActivationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateActivationResponse setBody(CreateActivationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateActivationResponseBody getBody() {
        return this.body;
    }

}
