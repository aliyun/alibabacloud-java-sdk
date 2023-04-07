// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCdsFileResponseBody body;

    public static CreateCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdsFileResponse self = new CreateCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCdsFileResponse setBody(CreateCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdsFileResponseBody getBody() {
        return this.body;
    }

}
