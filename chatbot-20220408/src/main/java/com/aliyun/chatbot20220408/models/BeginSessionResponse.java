// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BeginSessionResponseBody body;

    public static BeginSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionResponse self = new BeginSessionResponse();
        return TeaModel.build(map, self);
    }

    public BeginSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BeginSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BeginSessionResponse setBody(BeginSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public BeginSessionResponseBody getBody() {
        return this.body;
    }

}
