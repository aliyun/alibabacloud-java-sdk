// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHealthCheckTemplateResponseBody body;

    public static CreateHealthCheckTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHealthCheckTemplateResponse self = new CreateHealthCheckTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateHealthCheckTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHealthCheckTemplateResponse setBody(CreateHealthCheckTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHealthCheckTemplateResponseBody getBody() {
        return this.body;
    }

}
