// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceConnectionResponseBody body;

    public static CreateServiceConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceConnectionResponse self = new CreateServiceConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceConnectionResponse setBody(CreateServiceConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceConnectionResponseBody getBody() {
        return this.body;
    }

}
