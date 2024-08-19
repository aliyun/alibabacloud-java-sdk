// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatePreCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePreCheckResponseBody body;

    public static CreatePreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePreCheckResponse self = new CreatePreCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreatePreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePreCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePreCheckResponse setBody(CreatePreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePreCheckResponseBody getBody() {
        return this.body;
    }

}
