// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAppSessionResponseBody body;

    public static StopAppSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionResponse self = new StopAppSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopAppSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppSessionResponse setBody(StopAppSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppSessionResponseBody getBody() {
        return this.body;
    }

}
