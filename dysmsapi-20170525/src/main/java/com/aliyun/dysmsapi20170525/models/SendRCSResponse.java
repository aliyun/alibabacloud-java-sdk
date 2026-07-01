// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendRCSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendRCSResponseBody body;

    public static SendRCSResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRCSResponse self = new SendRCSResponse();
        return TeaModel.build(map, self);
    }

    public SendRCSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRCSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendRCSResponse setBody(SendRCSResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRCSResponseBody getBody() {
        return this.body;
    }

}
