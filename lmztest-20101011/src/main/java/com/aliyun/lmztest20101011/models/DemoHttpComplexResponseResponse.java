// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHttpComplexResponseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DemoHttpComplexResponseResponseBody body;

    public static DemoHttpComplexResponseResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoHttpComplexResponseResponse self = new DemoHttpComplexResponseResponse();
        return TeaModel.build(map, self);
    }

    public DemoHttpComplexResponseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoHttpComplexResponseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DemoHttpComplexResponseResponse setBody(DemoHttpComplexResponseResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoHttpComplexResponseResponseBody getBody() {
        return this.body;
    }

}
