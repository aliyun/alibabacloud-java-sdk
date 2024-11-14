// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class CircleTrafficStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CircleTrafficStatusResponseBody body;

    public static CircleTrafficStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CircleTrafficStatusResponse self = new CircleTrafficStatusResponse();
        return TeaModel.build(map, self);
    }

    public CircleTrafficStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CircleTrafficStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CircleTrafficStatusResponse setBody(CircleTrafficStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CircleTrafficStatusResponseBody getBody() {
        return this.body;
    }

}
