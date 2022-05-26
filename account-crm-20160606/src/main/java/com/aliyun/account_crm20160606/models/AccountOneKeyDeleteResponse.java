// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AccountOneKeyDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AccountOneKeyDeleteResponseBody body;

    public static AccountOneKeyDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountOneKeyDeleteResponse self = new AccountOneKeyDeleteResponse();
        return TeaModel.build(map, self);
    }

    public AccountOneKeyDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccountOneKeyDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccountOneKeyDeleteResponse setBody(AccountOneKeyDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public AccountOneKeyDeleteResponseBody getBody() {
        return this.body;
    }

}
