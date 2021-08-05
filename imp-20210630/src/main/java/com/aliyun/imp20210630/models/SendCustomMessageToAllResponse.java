// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomMessageToAllResponseBody body;

    public static SendCustomMessageToAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToAllResponse self = new SendCustomMessageToAllResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomMessageToAllResponse setBody(SendCustomMessageToAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomMessageToAllResponseBody getBody() {
        return this.body;
    }

}
