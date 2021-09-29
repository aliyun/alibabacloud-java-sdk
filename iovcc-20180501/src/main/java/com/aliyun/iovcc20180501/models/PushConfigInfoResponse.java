// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushConfigInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushConfigInfoResponseBody body;

    public static PushConfigInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PushConfigInfoResponse self = new PushConfigInfoResponse();
        return TeaModel.build(map, self);
    }

    public PushConfigInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushConfigInfoResponse setBody(PushConfigInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public PushConfigInfoResponseBody getBody() {
        return this.body;
    }

}
