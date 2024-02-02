// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachClassicLinkVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachClassicLinkVpcResponseBody body;

    public static AttachClassicLinkVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachClassicLinkVpcResponse self = new AttachClassicLinkVpcResponse();
        return TeaModel.build(map, self);
    }

    public AttachClassicLinkVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachClassicLinkVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachClassicLinkVpcResponse setBody(AttachClassicLinkVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachClassicLinkVpcResponseBody getBody() {
        return this.body;
    }

}
