// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppImageResponseBody body;

    public static CreateAppImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppImageResponse self = new CreateAppImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppImageResponse setBody(CreateAppImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppImageResponseBody getBody() {
        return this.body;
    }

}
