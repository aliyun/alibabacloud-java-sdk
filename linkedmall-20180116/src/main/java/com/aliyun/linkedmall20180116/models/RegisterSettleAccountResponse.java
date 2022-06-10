// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterSettleAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterSettleAccountResponseBody body;

    public static RegisterSettleAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterSettleAccountResponse self = new RegisterSettleAccountResponse();
        return TeaModel.build(map, self);
    }

    public RegisterSettleAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterSettleAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterSettleAccountResponse setBody(RegisterSettleAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterSettleAccountResponseBody getBody() {
        return this.body;
    }

}
