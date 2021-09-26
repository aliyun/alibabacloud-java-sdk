// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ResizeClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResizeClusterResponseBody body;

    public static ResizeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterResponse self = new ResizeClusterResponse();
        return TeaModel.build(map, self);
    }

    public ResizeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeClusterResponse setBody(ResizeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeClusterResponseBody getBody() {
        return this.body;
    }

}
