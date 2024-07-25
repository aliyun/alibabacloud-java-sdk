// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpApiOperationResponseBody body;

    public static CreateHttpApiOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiOperationResponse self = new CreateHttpApiOperationResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpApiOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpApiOperationResponse setBody(CreateHttpApiOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpApiOperationResponseBody getBody() {
        return this.body;
    }

}
