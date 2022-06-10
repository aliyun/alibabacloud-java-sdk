// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceResponseBody body;

    public static CreateServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponse self = new CreateServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceResponse setBody(CreateServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceResponseBody getBody() {
        return this.body;
    }

}
