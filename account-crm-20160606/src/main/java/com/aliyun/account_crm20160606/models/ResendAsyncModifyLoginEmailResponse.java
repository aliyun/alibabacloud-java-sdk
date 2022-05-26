// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncModifyLoginEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResendAsyncModifyLoginEmailResponseBody body;

    public static ResendAsyncModifyLoginEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncModifyLoginEmailResponse self = new ResendAsyncModifyLoginEmailResponse();
        return TeaModel.build(map, self);
    }

    public ResendAsyncModifyLoginEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendAsyncModifyLoginEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendAsyncModifyLoginEmailResponse setBody(ResendAsyncModifyLoginEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendAsyncModifyLoginEmailResponseBody getBody() {
        return this.body;
    }

}
