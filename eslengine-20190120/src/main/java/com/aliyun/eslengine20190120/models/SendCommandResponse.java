// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class SendCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendCommandResponseBody body;

    public static SendCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCommandResponse self = new SendCommandResponse();
        return TeaModel.build(map, self);
    }

    public SendCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCommandResponse setBody(SendCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCommandResponseBody getBody() {
        return this.body;
    }

}
