// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckLeftCuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckLeftCuResponseBody body;

    public static CheckLeftCuResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLeftCuResponse self = new CheckLeftCuResponse();
        return TeaModel.build(map, self);
    }

    public CheckLeftCuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLeftCuResponse setBody(CheckLeftCuResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLeftCuResponseBody getBody() {
        return this.body;
    }

}
