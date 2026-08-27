// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpApiVersionResponseBody body;

    public static CreateHttpApiVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiVersionResponse self = new CreateHttpApiVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpApiVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpApiVersionResponse setBody(CreateHttpApiVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpApiVersionResponseBody getBody() {
        return this.body;
    }

}
