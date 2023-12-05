// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMasCrowdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMasCrowdResponseBody body;

    public static CreateMasCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMasCrowdResponse self = new CreateMasCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CreateMasCrowdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMasCrowdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMasCrowdResponse setBody(CreateMasCrowdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMasCrowdResponseBody getBody() {
        return this.body;
    }

}
