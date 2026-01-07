// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactQueryDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountContactQueryDetailResponseBody body;

    public static AccountContactQueryDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountContactQueryDetailResponse self = new AccountContactQueryDetailResponse();
        return TeaModel.build(map, self);
    }

    public AccountContactQueryDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountContactQueryDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountContactQueryDetailResponse setBody(AccountContactQueryDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountContactQueryDetailResponseBody getBody() {
        return this.body;
    }

}
