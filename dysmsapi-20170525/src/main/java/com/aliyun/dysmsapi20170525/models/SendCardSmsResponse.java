// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendCardSmsResponseBody body;

    public static SendCardSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCardSmsResponse self = new SendCardSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendCardSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCardSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCardSmsResponse setBody(SendCardSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCardSmsResponseBody getBody() {
        return this.body;
    }

}
