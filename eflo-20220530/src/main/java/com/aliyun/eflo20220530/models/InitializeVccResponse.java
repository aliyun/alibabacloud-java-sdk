// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class InitializeVccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeVccResponseBody body;

    public static InitializeVccResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeVccResponse self = new InitializeVccResponse();
        return TeaModel.build(map, self);
    }

    public InitializeVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeVccResponse setBody(InitializeVccResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeVccResponseBody getBody() {
        return this.body;
    }

}
