// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RectangleTrafficStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RectangleTrafficStatusResponseBody body;

    public static RectangleTrafficStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        RectangleTrafficStatusResponse self = new RectangleTrafficStatusResponse();
        return TeaModel.build(map, self);
    }

    public RectangleTrafficStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RectangleTrafficStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RectangleTrafficStatusResponse setBody(RectangleTrafficStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public RectangleTrafficStatusResponseBody getBody() {
        return this.body;
    }

}
