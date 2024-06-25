// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSmsResponseBody body;

    public static SendSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsResponse self = new SendSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSmsResponse setBody(SendSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsResponseBody getBody() {
        return this.body;
    }

}
