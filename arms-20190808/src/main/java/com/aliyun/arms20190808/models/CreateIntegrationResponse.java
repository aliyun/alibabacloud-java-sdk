// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntegrationResponseBody body;

    public static CreateIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationResponse self = new CreateIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntegrationResponse setBody(CreateIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntegrationResponseBody getBody() {
        return this.body;
    }

}
