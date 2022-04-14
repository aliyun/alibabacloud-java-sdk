// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AttachVpcToNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachVpcToNetLinkResponseBody body;

    public static AttachVpcToNetLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVpcToNetLinkResponse self = new AttachVpcToNetLinkResponse();
        return TeaModel.build(map, self);
    }

    public AttachVpcToNetLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVpcToNetLinkResponse setBody(AttachVpcToNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVpcToNetLinkResponseBody getBody() {
        return this.body;
    }

}
