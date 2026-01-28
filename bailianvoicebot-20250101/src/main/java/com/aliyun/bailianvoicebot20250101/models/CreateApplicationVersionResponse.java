// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateApplicationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationVersionResponseBody body;

    public static CreateApplicationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationVersionResponse self = new CreateApplicationVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationVersionResponse setBody(CreateApplicationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationVersionResponseBody getBody() {
        return this.body;
    }

}
