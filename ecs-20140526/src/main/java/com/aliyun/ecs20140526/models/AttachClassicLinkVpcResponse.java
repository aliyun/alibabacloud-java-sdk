// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachClassicLinkVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AttachClassicLinkVpcResponse setBody(AttachClassicLinkVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachClassicLinkVpcResponseBody getBody() {
        return this.body;
    }

}
