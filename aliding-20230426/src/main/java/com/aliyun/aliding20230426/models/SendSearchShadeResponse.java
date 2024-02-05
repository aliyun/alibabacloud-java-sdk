// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendSearchShadeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSearchShadeResponseBody body;

    public static SendSearchShadeResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSearchShadeResponse self = new SendSearchShadeResponse();
        return TeaModel.build(map, self);
    }

    public SendSearchShadeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSearchShadeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSearchShadeResponse setBody(SendSearchShadeResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSearchShadeResponseBody getBody() {
        return this.body;
    }

}
