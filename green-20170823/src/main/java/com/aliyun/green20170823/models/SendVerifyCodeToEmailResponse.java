// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerifyCodeToEmailResponseBody body;

    public static SendVerifyCodeToEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToEmailResponse self = new SendVerifyCodeToEmailResponse();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerifyCodeToEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerifyCodeToEmailResponse setBody(SendVerifyCodeToEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerifyCodeToEmailResponseBody getBody() {
        return this.body;
    }

}
