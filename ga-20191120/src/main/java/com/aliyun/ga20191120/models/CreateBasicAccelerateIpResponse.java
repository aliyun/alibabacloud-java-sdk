// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBasicAccelerateIpResponseBody body;

    public static CreateBasicAccelerateIpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpResponse self = new CreateBasicAccelerateIpResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicAccelerateIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicAccelerateIpResponse setBody(CreateBasicAccelerateIpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicAccelerateIpResponseBody getBody() {
        return this.body;
    }

}
