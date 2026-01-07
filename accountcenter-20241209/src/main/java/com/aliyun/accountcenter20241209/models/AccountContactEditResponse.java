// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactEditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountContactEditResponseBody body;

    public static AccountContactEditResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountContactEditResponse self = new AccountContactEditResponse();
        return TeaModel.build(map, self);
    }

    public AccountContactEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountContactEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountContactEditResponse setBody(AccountContactEditResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountContactEditResponseBody getBody() {
        return this.body;
    }

}
