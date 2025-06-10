// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenCRCResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScreenCRCResponseBody body;

    public static ScreenCRCResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenCRCResponse self = new ScreenCRCResponse();
        return TeaModel.build(map, self);
    }

    public ScreenCRCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScreenCRCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScreenCRCResponse setBody(ScreenCRCResponseBody body) {
        this.body = body;
        return this;
    }
    public ScreenCRCResponseBody getBody() {
        return this.body;
    }

}
