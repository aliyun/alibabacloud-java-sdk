// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendChatappMassMessageResponseBody body;

    public static SendChatappMassMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageResponse self = new SendChatappMassMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendChatappMassMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendChatappMassMessageResponse setBody(SendChatappMassMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendChatappMassMessageResponseBody getBody() {
        return this.body;
    }

}
