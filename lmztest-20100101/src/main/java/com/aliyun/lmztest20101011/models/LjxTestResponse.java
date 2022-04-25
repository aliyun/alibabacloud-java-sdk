// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class LjxTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LjxTestResponseBody body;

    public static LjxTestResponse build(java.util.Map<String, ?> map) throws Exception {
        LjxTestResponse self = new LjxTestResponse();
        return TeaModel.build(map, self);
    }

    public LjxTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LjxTestResponse setBody(LjxTestResponseBody body) {
        this.body = body;
        return this;
    }
    public LjxTestResponseBody getBody() {
        return this.body;
    }

}
