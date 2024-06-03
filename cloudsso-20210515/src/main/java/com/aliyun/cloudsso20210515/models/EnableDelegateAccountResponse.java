// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableDelegateAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDelegateAccountResponseBody body;

    public static EnableDelegateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDelegateAccountResponse self = new EnableDelegateAccountResponse();
        return TeaModel.build(map, self);
    }

    public EnableDelegateAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDelegateAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDelegateAccountResponse setBody(EnableDelegateAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDelegateAccountResponseBody getBody() {
        return this.body;
    }

}
