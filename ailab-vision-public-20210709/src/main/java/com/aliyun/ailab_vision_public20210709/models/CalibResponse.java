// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class CalibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CalibResponseBody body;

    public static CalibResponse build(java.util.Map<String, ?> map) throws Exception {
        CalibResponse self = new CalibResponse();
        return TeaModel.build(map, self);
    }

    public CalibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalibResponse setBody(CalibResponseBody body) {
        this.body = body;
        return this;
    }
    public CalibResponseBody getBody() {
        return this.body;
    }

}
