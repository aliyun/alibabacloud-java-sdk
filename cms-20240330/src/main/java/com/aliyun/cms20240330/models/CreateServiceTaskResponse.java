// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceTaskResponseBody body;

    public static CreateServiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTaskResponse self = new CreateServiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceTaskResponse setBody(CreateServiceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceTaskResponseBody getBody() {
        return this.body;
    }

}
