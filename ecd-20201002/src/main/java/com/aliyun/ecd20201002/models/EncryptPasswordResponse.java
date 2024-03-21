// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class EncryptPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EncryptPasswordResponseBody body;

    public static EncryptPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptPasswordResponse self = new EncryptPasswordResponse();
        return TeaModel.build(map, self);
    }

    public EncryptPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncryptPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EncryptPasswordResponse setBody(EncryptPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public EncryptPasswordResponseBody getBody() {
        return this.body;
    }

}
