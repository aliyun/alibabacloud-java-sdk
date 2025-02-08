// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateImageTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageTransformResponseBody body;

    public static CreateImageTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTransformResponse self = new CreateImageTransformResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageTransformResponse setBody(CreateImageTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageTransformResponseBody getBody() {
        return this.body;
    }

}
