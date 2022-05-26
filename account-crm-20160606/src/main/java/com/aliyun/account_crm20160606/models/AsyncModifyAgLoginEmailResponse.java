// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AsyncModifyAgLoginEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AsyncModifyAgLoginEmailResponseBody body;

    public static AsyncModifyAgLoginEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncModifyAgLoginEmailResponse self = new AsyncModifyAgLoginEmailResponse();
        return TeaModel.build(map, self);
    }

    public AsyncModifyAgLoginEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncModifyAgLoginEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncModifyAgLoginEmailResponse setBody(AsyncModifyAgLoginEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncModifyAgLoginEmailResponseBody getBody() {
        return this.body;
    }

}
