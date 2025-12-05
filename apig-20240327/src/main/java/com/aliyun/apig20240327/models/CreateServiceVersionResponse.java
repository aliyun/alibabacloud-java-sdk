// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceVersionResponseBody body;

    public static CreateServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceVersionResponse self = new CreateServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceVersionResponse setBody(CreateServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceVersionResponseBody getBody() {
        return this.body;
    }

}
