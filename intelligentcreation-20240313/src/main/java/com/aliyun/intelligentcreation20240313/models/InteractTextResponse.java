// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class InteractTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InteractTextResponseBody body;

    public static InteractTextResponse build(java.util.Map<String, ?> map) throws Exception {
        InteractTextResponse self = new InteractTextResponse();
        return TeaModel.build(map, self);
    }

    public InteractTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InteractTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InteractTextResponse setBody(InteractTextResponseBody body) {
        this.body = body;
        return this;
    }
    public InteractTextResponseBody getBody() {
        return this.body;
    }

}
