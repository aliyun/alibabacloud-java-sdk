// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfirmSendSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmSendSmsResponseBody body;

    public static ConfirmSendSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSendSmsResponse self = new ConfirmSendSmsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmSendSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmSendSmsResponse setBody(ConfirmSendSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmSendSmsResponseBody getBody() {
        return this.body;
    }

}
