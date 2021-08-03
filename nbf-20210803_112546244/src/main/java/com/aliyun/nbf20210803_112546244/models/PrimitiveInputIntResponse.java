// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputIntResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrimitiveInputIntResponseBody body;

    public static PrimitiveInputIntResponse build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputIntResponse self = new PrimitiveInputIntResponse();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputIntResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrimitiveInputIntResponse setBody(PrimitiveInputIntResponseBody body) {
        this.body = body;
        return this;
    }
    public PrimitiveInputIntResponseBody getBody() {
        return this.body;
    }

}
