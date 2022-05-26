// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CancelAsyncCreateAgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAsyncCreateAgAccountResponseBody body;

    public static CancelAsyncCreateAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncCreateAgAccountResponse self = new CancelAsyncCreateAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public CancelAsyncCreateAgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAsyncCreateAgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAsyncCreateAgAccountResponse setBody(CancelAsyncCreateAgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAsyncCreateAgAccountResponseBody getBody() {
        return this.body;
    }

}
