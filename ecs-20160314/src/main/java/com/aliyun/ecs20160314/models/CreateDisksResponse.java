// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDisksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDisksResponseBody body;

    public static CreateDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDisksResponse self = new CreateDisksResponse();
        return TeaModel.build(map, self);
    }

    public CreateDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDisksResponse setBody(CreateDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDisksResponseBody getBody() {
        return this.body;
    }

}
