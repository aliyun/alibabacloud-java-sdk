// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenLCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScreenLCResponseBody body;

    public static ScreenLCResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenLCResponse self = new ScreenLCResponse();
        return TeaModel.build(map, self);
    }

    public ScreenLCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScreenLCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScreenLCResponse setBody(ScreenLCResponseBody body) {
        this.body = body;
        return this;
    }
    public ScreenLCResponseBody getBody() {
        return this.body;
    }

}
