// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class RpcHttpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RpcHttpResponseBody body;

    public static RpcHttpResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcHttpResponse self = new RpcHttpResponse();
        return TeaModel.build(map, self);
    }

    public RpcHttpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcHttpResponse setBody(RpcHttpResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcHttpResponseBody getBody() {
        return this.body;
    }

}
