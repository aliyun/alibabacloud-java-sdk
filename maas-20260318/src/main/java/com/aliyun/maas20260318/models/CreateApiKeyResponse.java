// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maas20260318.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
