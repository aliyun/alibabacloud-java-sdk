// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendRCSReplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendRCSReplyResponseBody body;

    public static SendRCSReplyResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRCSReplyResponse self = new SendRCSReplyResponse();
        return TeaModel.build(map, self);
    }

    public SendRCSReplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRCSReplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendRCSReplyResponse setBody(SendRCSReplyResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRCSReplyResponseBody getBody() {
        return this.body;
    }

}
