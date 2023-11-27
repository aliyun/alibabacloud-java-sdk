// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomMessageResponseBody body;

    public static SendCustomMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageResponse self = new SendCustomMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomMessageResponse setBody(SendCustomMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomMessageResponseBody getBody() {
        return this.body;
    }

}
