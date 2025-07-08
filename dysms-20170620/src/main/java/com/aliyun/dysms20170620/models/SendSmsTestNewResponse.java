// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SendSmsTestNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSmsTestNewResponseBody body;

    public static SendSmsTestNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsTestNewResponse self = new SendSmsTestNewResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsTestNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsTestNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSmsTestNewResponse setBody(SendSmsTestNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsTestNewResponseBody getBody() {
        return this.body;
    }

}
