// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfNineResponseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DemoHsfNineResponseResponseBody body;

    public static DemoHsfNineResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfNineResponseResponse self = new DemoHsfNineResponseResponse();
        return TeaModel.build(map, self);
    }

    public DemoHsfNineResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoHsfNineResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DemoHsfNineResponseResponse setBody(DemoHsfNineResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoHsfNineResponseResponseBody getBody() {
        return this.body;
    }

}
