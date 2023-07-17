// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class AddIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddIntegrationResponseBody body;

    public static AddIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIntegrationResponse self = new AddIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public AddIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIntegrationResponse setBody(AddIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIntegrationResponseBody getBody() {
        return this.body;
    }

}
