// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class IsKeepAliveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IsKeepAliveResponseBody body;

    public static IsKeepAliveResponse build(java.util.Map<String, ?> map) throws Exception {
        IsKeepAliveResponse self = new IsKeepAliveResponse();
        return TeaModel.build(map, self);
    }

    public IsKeepAliveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsKeepAliveResponse setBody(IsKeepAliveResponseBody body) {
        this.body = body;
        return this;
    }
    public IsKeepAliveResponseBody getBody() {
        return this.body;
    }

}
