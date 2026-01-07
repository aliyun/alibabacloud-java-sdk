// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountContactDeleteResponseBody body;

    public static AccountContactDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountContactDeleteResponse self = new AccountContactDeleteResponse();
        return TeaModel.build(map, self);
    }

    public AccountContactDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountContactDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountContactDeleteResponse setBody(AccountContactDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountContactDeleteResponseBody getBody() {
        return this.body;
    }

}
