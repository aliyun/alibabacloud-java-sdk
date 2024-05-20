// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAdaptationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdaptationResponseBody body;

    public static CreateAdaptationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdaptationResponse self = new CreateAdaptationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdaptationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdaptationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdaptationResponse setBody(CreateAdaptationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdaptationResponseBody getBody() {
        return this.body;
    }

}
