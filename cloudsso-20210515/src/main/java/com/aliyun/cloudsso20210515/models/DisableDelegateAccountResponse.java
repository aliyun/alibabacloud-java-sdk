// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DisableDelegateAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDelegateAccountResponseBody body;

    public static DisableDelegateAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDelegateAccountResponse self = new DisableDelegateAccountResponse();
        return TeaModel.build(map, self);
    }

    public DisableDelegateAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDelegateAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDelegateAccountResponse setBody(DisableDelegateAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDelegateAccountResponseBody getBody() {
        return this.body;
    }

}
