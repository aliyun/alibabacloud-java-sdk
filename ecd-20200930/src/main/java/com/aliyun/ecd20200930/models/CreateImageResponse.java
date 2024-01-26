// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageResponseBody body;

    public static CreateImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageResponse self = new CreateImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageResponse setBody(CreateImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageResponseBody getBody() {
        return this.body;
    }

}
