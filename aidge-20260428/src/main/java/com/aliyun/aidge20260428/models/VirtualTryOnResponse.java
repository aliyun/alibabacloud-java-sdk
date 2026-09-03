// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VirtualTryOnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VirtualTryOnResponseBody body;

    public static VirtualTryOnResponse build(java.util.Map<String, ?> map) throws Exception {
        VirtualTryOnResponse self = new VirtualTryOnResponse();
        return TeaModel.build(map, self);
    }

    public VirtualTryOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VirtualTryOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VirtualTryOnResponse setBody(VirtualTryOnResponseBody body) {
        this.body = body;
        return this;
    }
    public VirtualTryOnResponseBody getBody() {
        return this.body;
    }

}
