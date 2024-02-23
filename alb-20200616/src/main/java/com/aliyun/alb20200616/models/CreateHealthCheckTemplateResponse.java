// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateHealthCheckTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHealthCheckTemplateResponse setBody(CreateHealthCheckTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHealthCheckTemplateResponseBody getBody() {
        return this.body;
    }

}
