// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateIsvAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIsvAppResponseBody body;

    public static CreateIsvAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIsvAppResponse self = new CreateIsvAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateIsvAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIsvAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIsvAppResponse setBody(CreateIsvAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIsvAppResponseBody getBody() {
        return this.body;
    }

}
