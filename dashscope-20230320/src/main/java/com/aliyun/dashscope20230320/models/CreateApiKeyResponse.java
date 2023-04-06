// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApiKeyResponseBody body;

    public static CreateApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponse self = new CreateApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiKeyResponse setBody(CreateApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiKeyResponseBody getBody() {
        return this.body;
    }

}
