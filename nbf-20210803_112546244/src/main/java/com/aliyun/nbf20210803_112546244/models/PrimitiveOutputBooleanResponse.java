// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputBooleanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Boolean body;

    public static PrimitiveOutputBooleanResponse build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputBooleanResponse self = new PrimitiveOutputBooleanResponse();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputBooleanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrimitiveOutputBooleanResponse setBody(Boolean body) {
        this.body = body;
        return this;
    }
    public Boolean getBody() {
        return this.body;
    }

}
