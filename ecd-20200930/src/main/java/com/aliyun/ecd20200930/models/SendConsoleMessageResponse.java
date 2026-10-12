// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendConsoleMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendConsoleMessageResponseBody body;

    public static SendConsoleMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendConsoleMessageResponse self = new SendConsoleMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendConsoleMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendConsoleMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendConsoleMessageResponse setBody(SendConsoleMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendConsoleMessageResponseBody getBody() {
        return this.body;
    }

}
