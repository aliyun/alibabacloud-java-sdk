// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceSourceResponseBody body;

    public static CreateServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceSourceResponse self = new CreateServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceSourceResponse setBody(CreateServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceSourceResponseBody getBody() {
        return this.body;
    }

}
