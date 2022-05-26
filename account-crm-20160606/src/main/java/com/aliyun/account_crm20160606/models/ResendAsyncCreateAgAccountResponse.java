// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncCreateAgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResendAsyncCreateAgAccountResponseBody body;

    public static ResendAsyncCreateAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncCreateAgAccountResponse self = new ResendAsyncCreateAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public ResendAsyncCreateAgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendAsyncCreateAgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendAsyncCreateAgAccountResponse setBody(ResendAsyncCreateAgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendAsyncCreateAgAccountResponseBody getBody() {
        return this.body;
    }

}
