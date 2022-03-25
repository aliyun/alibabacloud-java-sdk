// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimPreStepResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BimPreStepResponseBody body;

    public static BimPreStepResponse build(java.util.Map<String, ?> map) throws Exception {
        BimPreStepResponse self = new BimPreStepResponse();
        return TeaModel.build(map, self);
    }

    public BimPreStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimPreStepResponse setBody(BimPreStepResponseBody body) {
        this.body = body;
        return this;
    }
    public BimPreStepResponseBody getBody() {
        return this.body;
    }

}
