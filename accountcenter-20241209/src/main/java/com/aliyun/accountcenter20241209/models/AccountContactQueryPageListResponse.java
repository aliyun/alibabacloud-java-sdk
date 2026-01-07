// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactQueryPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountContactQueryPageListResponseBody body;

    public static AccountContactQueryPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountContactQueryPageListResponse self = new AccountContactQueryPageListResponse();
        return TeaModel.build(map, self);
    }

    public AccountContactQueryPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountContactQueryPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountContactQueryPageListResponse setBody(AccountContactQueryPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountContactQueryPageListResponseBody getBody() {
        return this.body;
    }

}
