// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateAgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAgAccountResponseBody body;

    public static CreateAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountResponse self = new CreateAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgAccountResponse setBody(CreateAgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgAccountResponseBody getBody() {
        return this.body;
    }

}
