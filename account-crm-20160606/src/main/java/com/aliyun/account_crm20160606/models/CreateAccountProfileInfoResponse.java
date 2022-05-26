// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateAccountProfileInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccountProfileInfoResponseBody body;

    public static CreateAccountProfileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountProfileInfoResponse self = new CreateAccountProfileInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountProfileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountProfileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccountProfileInfoResponse setBody(CreateAccountProfileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountProfileInfoResponseBody getBody() {
        return this.body;
    }

}
