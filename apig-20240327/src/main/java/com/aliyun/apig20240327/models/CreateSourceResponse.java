// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSourceResponseBody body;

    public static CreateSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceResponse self = new CreateSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSourceResponse setBody(CreateSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSourceResponseBody getBody() {
        return this.body;
    }

}
