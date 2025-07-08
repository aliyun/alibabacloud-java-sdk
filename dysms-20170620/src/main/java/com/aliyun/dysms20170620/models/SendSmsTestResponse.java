// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SendSmsTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSmsTestResponseBody body;

    public static SendSmsTestResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsTestResponse self = new SendSmsTestResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSmsTestResponse setBody(SendSmsTestResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsTestResponseBody getBody() {
        return this.body;
    }

}
