// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AndBackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AndBackResponseBody body;

    public static AndBackResponse build(java.util.Map<String, ?> map) throws Exception {
        AndBackResponse self = new AndBackResponse();
        return TeaModel.build(map, self);
    }

    public AndBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AndBackResponse setBody(AndBackResponseBody body) {
        this.body = body;
        return this;
    }
    public AndBackResponseBody getBody() {
        return this.body;
    }

}
