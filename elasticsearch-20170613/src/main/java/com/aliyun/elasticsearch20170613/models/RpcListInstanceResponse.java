// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RpcListInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RpcListInstanceResponseBody body;

    public static RpcListInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcListInstanceResponse self = new RpcListInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RpcListInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcListInstanceResponse setBody(RpcListInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcListInstanceResponseBody getBody() {
        return this.body;
    }

}
