// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputBooleanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PrimitiveInputBooleanResponseBody body;

    public static PrimitiveInputBooleanResponse build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputBooleanResponse self = new PrimitiveInputBooleanResponse();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputBooleanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrimitiveInputBooleanResponse setBody(PrimitiveInputBooleanResponseBody body) {
        this.body = body;
        return this;
    }
    public PrimitiveInputBooleanResponseBody getBody() {
        return this.body;
    }

}
