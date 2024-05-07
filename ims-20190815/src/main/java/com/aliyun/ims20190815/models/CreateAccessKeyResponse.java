// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAccessKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessKeyResponseBody body;

    public static CreateAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessKeyResponse self = new CreateAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessKeyResponse setBody(CreateAccessKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessKeyResponseBody getBody() {
        return this.body;
    }

}
