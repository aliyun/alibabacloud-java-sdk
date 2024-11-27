// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class SendCustomEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendCustomEventResponseBody body;

    public static SendCustomEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomEventResponse self = new SendCustomEventResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomEventResponse setBody(SendCustomEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomEventResponseBody getBody() {
        return this.body;
    }

}
