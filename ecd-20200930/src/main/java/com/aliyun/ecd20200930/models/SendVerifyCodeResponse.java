// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerifyCodeResponseBody body;

    public static SendVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeResponse self = new SendVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerifyCodeResponse setBody(SendVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerifyCodeResponseBody getBody() {
        return this.body;
    }

}
