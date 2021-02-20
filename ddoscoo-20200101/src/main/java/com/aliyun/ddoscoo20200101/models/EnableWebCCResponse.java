// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableWebCCResponseBody body;

    public static EnableWebCCResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCResponse self = new EnableWebCCResponse();
        return TeaModel.build(map, self);
    }

    public EnableWebCCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableWebCCResponse setBody(EnableWebCCResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableWebCCResponseBody getBody() {
        return this.body;
    }

}
