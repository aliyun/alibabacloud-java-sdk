// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendVerifyCodeToPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVerifyCodeToPhoneResponseBody body;

    public static SendVerifyCodeToPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeToPhoneResponse self = new SendVerifyCodeToPhoneResponse();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeToPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVerifyCodeToPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVerifyCodeToPhoneResponse setBody(SendVerifyCodeToPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVerifyCodeToPhoneResponseBody getBody() {
        return this.body;
    }

}
