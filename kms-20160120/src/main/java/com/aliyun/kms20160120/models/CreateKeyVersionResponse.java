// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKeyVersionResponseBody body;

    public static CreateKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionResponse self = new CreateKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKeyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKeyVersionResponse setBody(CreateKeyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKeyVersionResponseBody getBody() {
        return this.body;
    }

}
