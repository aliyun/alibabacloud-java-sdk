// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateLogicalModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogicalModelResponseBody body;

    public static CreateLogicalModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicalModelResponse self = new CreateLogicalModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogicalModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogicalModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogicalModelResponse setBody(CreateLogicalModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogicalModelResponseBody getBody() {
        return this.body;
    }

}
