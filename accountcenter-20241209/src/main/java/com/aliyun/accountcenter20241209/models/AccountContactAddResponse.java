// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountContactAddResponseBody body;

    public static AccountContactAddResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountContactAddResponse self = new AccountContactAddResponse();
        return TeaModel.build(map, self);
    }

    public AccountContactAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountContactAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountContactAddResponse setBody(AccountContactAddResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountContactAddResponseBody getBody() {
        return this.body;
    }

}
