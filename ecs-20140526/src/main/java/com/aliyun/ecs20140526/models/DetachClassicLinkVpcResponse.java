// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachClassicLinkVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachClassicLinkVpcResponseBody body;

    public static DetachClassicLinkVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachClassicLinkVpcResponse self = new DetachClassicLinkVpcResponse();
        return TeaModel.build(map, self);
    }

    public DetachClassicLinkVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachClassicLinkVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachClassicLinkVpcResponse setBody(DetachClassicLinkVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachClassicLinkVpcResponseBody getBody() {
        return this.body;
    }

}
