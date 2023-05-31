// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenGCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScreenGCResponseBody body;

    public static ScreenGCResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenGCResponse self = new ScreenGCResponse();
        return TeaModel.build(map, self);
    }

    public ScreenGCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScreenGCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScreenGCResponse setBody(ScreenGCResponseBody body) {
        this.body = body;
        return this;
    }
    public ScreenGCResponseBody getBody() {
        return this.body;
    }

}
