// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class CreateTextFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTextFileResponseBody body;

    public static CreateTextFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTextFileResponse self = new CreateTextFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateTextFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTextFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTextFileResponse setBody(CreateTextFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTextFileResponseBody getBody() {
        return this.body;
    }

}
