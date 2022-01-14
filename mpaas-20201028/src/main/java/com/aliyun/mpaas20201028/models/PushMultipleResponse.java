// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushMultipleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushMultipleResponseBody body;

    public static PushMultipleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMultipleResponse self = new PushMultipleResponse();
        return TeaModel.build(map, self);
    }

    public PushMultipleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMultipleResponse setBody(PushMultipleResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMultipleResponseBody getBody() {
        return this.body;
    }

}
