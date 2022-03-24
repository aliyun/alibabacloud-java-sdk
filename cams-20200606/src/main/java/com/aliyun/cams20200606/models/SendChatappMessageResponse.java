// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendChatappMessageResponseBody body;

    public static SendChatappMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMessageResponse self = new SendChatappMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendChatappMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendChatappMessageResponse setBody(SendChatappMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendChatappMessageResponseBody getBody() {
        return this.body;
    }

}
