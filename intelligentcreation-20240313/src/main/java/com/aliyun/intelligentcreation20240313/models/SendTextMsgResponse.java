// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendTextMsgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendTextMsgResponseBody body;

    public static SendTextMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTextMsgResponse self = new SendTextMsgResponse();
        return TeaModel.build(map, self);
    }

    public SendTextMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTextMsgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTextMsgResponse setBody(SendTextMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTextMsgResponseBody getBody() {
        return this.body;
    }

}
