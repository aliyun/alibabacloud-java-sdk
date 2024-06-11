// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCustomImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomImageResponseBody body;

    public static CreateCustomImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageResponse self = new CreateCustomImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomImageResponse setBody(CreateCustomImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomImageResponseBody getBody() {
        return this.body;
    }

}
