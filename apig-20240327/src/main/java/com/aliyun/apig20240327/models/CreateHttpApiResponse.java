// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpApiResponseBody body;

    public static CreateHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiResponse self = new CreateHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpApiResponse setBody(CreateHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpApiResponseBody getBody() {
        return this.body;
    }

}
