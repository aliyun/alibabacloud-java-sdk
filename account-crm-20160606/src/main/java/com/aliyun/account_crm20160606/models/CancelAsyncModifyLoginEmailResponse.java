// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CancelAsyncModifyLoginEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAsyncModifyLoginEmailResponseBody body;

    public static CancelAsyncModifyLoginEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncModifyLoginEmailResponse self = new CancelAsyncModifyLoginEmailResponse();
        return TeaModel.build(map, self);
    }

    public CancelAsyncModifyLoginEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAsyncModifyLoginEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAsyncModifyLoginEmailResponse setBody(CancelAsyncModifyLoginEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAsyncModifyLoginEmailResponseBody getBody() {
        return this.body;
    }

}
