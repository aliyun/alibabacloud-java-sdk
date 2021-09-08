// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RRpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RRpcResponseBody body;

    public static RRpcResponse build(java.util.Map<String, ?> map) throws Exception {
        RRpcResponse self = new RRpcResponse();
        return TeaModel.build(map, self);
    }

    public RRpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RRpcResponse setBody(RRpcResponseBody body) {
        this.body = body;
        return this;
    }
    public RRpcResponseBody getBody() {
        return this.body;
    }

}
