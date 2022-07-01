// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DemoHsfSixTestResponseBody body;

    public static DemoHsfSixTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestResponse self = new DemoHsfSixTestResponse();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoHsfSixTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DemoHsfSixTestResponse setBody(DemoHsfSixTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoHsfSixTestResponseBody getBody() {
        return this.body;
    }

}
