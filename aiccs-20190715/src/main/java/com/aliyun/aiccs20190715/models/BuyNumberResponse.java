// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class BuyNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BuyNumberResponseBody body;

    public static BuyNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        BuyNumberResponse self = new BuyNumberResponse();
        return TeaModel.build(map, self);
    }

    public BuyNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuyNumberResponse setBody(BuyNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public BuyNumberResponseBody getBody() {
        return this.body;
    }

}
