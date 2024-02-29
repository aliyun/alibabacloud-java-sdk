// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushWelcomeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushWelcomeResponseBody body;

    public static PushWelcomeResponse build(java.util.Map<String, ?> map) throws Exception {
        PushWelcomeResponse self = new PushWelcomeResponse();
        return TeaModel.build(map, self);
    }

    public PushWelcomeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushWelcomeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushWelcomeResponse setBody(PushWelcomeResponseBody body) {
        this.body = body;
        return this;
    }
    public PushWelcomeResponseBody getBody() {
        return this.body;
    }

}
