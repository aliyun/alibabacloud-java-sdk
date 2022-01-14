// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushSimpleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushSimpleResponseBody body;

    public static PushSimpleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleResponse self = new PushSimpleResponse();
        return TeaModel.build(map, self);
    }

    public PushSimpleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushSimpleResponse setBody(PushSimpleResponseBody body) {
        this.body = body;
        return this;
    }
    public PushSimpleResponseBody getBody() {
        return this.body;
    }

}
