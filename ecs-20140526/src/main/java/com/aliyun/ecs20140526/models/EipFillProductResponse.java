// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EipFillProductResponseBody body;

    public static EipFillProductResponse build(java.util.Map<String, ?> map) throws Exception {
        EipFillProductResponse self = new EipFillProductResponse();
        return TeaModel.build(map, self);
    }

    public EipFillProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EipFillProductResponse setBody(EipFillProductResponseBody body) {
        this.body = body;
        return this;
    }
    public EipFillProductResponseBody getBody() {
        return this.body;
    }

}
