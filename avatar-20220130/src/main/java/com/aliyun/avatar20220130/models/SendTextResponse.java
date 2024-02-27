// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendTextResponseBody body;

    public static SendTextResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTextResponse self = new SendTextResponse();
        return TeaModel.build(map, self);
    }

    public SendTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTextResponse setBody(SendTextResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTextResponseBody getBody() {
        return this.body;
    }

}
