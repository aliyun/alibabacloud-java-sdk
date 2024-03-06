// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKeyResponseBody body;

    public static CreateKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyResponse self = new CreateKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKeyResponse setBody(CreateKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeyResponseBody getBody() {
        return this.body;
    }

}
