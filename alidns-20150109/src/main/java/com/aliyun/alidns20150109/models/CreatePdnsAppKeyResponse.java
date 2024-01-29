// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePdnsAppKeyResponseBody body;

    public static CreatePdnsAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsAppKeyResponse self = new CreatePdnsAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdnsAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdnsAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdnsAppKeyResponse setBody(CreatePdnsAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePdnsAppKeyResponseBody getBody() {
        return this.body;
    }

}
