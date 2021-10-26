// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsSmartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendSmsSmartResponseBody body;

    public static SendSmsSmartResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsSmartResponse self = new SendSmsSmartResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsSmartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSmsSmartResponse setBody(SendSmsSmartResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSmsSmartResponseBody getBody() {
        return this.body;
    }

}
