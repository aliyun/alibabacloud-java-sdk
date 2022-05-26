// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AllowAgAccountLoginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AllowAgAccountLoginResponseBody body;

    public static AllowAgAccountLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        AllowAgAccountLoginResponse self = new AllowAgAccountLoginResponse();
        return TeaModel.build(map, self);
    }

    public AllowAgAccountLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllowAgAccountLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllowAgAccountLoginResponse setBody(AllowAgAccountLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public AllowAgAccountLoginResponseBody getBody() {
        return this.body;
    }

}
