// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UnbindAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAccountResponseBody body;

    public static UnbindAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountResponse self = new UnbindAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAccountResponse setBody(UnbindAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAccountResponseBody getBody() {
        return this.body;
    }

}
