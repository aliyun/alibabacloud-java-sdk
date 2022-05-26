// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AsyncCreateAgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AsyncCreateAgAccountResponseBody body;

    public static AsyncCreateAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateAgAccountResponse self = new AsyncCreateAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public AsyncCreateAgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncCreateAgAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncCreateAgAccountResponse setBody(AsyncCreateAgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncCreateAgAccountResponseBody getBody() {
        return this.body;
    }

}
