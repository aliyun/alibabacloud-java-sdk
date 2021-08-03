// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputStringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrimitiveInputStringResponseBody body;

    public static PrimitiveInputStringResponse build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputStringResponse self = new PrimitiveInputStringResponse();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrimitiveInputStringResponse setBody(PrimitiveInputStringResponseBody body) {
        this.body = body;
        return this;
    }
    public PrimitiveInputStringResponseBody getBody() {
        return this.body;
    }

}
