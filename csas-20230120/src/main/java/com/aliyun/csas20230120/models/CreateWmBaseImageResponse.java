// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWmBaseImageResponseBody body;

    public static CreateWmBaseImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWmBaseImageResponse self = new CreateWmBaseImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateWmBaseImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWmBaseImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWmBaseImageResponse setBody(CreateWmBaseImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWmBaseImageResponseBody getBody() {
        return this.body;
    }

}
