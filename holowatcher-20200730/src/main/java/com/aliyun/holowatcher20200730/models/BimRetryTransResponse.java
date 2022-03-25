// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimRetryTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BimRetryTransResponseBody body;

    public static BimRetryTransResponse build(java.util.Map<String, ?> map) throws Exception {
        BimRetryTransResponse self = new BimRetryTransResponse();
        return TeaModel.build(map, self);
    }

    public BimRetryTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimRetryTransResponse setBody(BimRetryTransResponseBody body) {
        this.body = body;
        return this;
    }
    public BimRetryTransResponseBody getBody() {
        return this.body;
    }

}
