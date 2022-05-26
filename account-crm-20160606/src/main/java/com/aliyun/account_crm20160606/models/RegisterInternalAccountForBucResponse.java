// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class RegisterInternalAccountForBucResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterInternalAccountForBucResponseBody body;

    public static RegisterInternalAccountForBucResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterInternalAccountForBucResponse self = new RegisterInternalAccountForBucResponse();
        return TeaModel.build(map, self);
    }

    public RegisterInternalAccountForBucResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterInternalAccountForBucResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterInternalAccountForBucResponse setBody(RegisterInternalAccountForBucResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterInternalAccountForBucResponseBody getBody() {
        return this.body;
    }

}
