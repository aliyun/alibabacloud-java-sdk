// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputIntegerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Integer body;

    public static PrimitiveOutputIntegerResponse build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputIntegerResponse self = new PrimitiveOutputIntegerResponse();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputIntegerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrimitiveOutputIntegerResponse setBody(Integer body) {
        this.body = body;
        return this;
    }
    public Integer getBody() {
        return this.body;
    }

}
