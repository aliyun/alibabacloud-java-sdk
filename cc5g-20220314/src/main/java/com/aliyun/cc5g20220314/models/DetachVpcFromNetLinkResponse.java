// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DetachVpcFromNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachVpcFromNetLinkResponseBody body;

    public static DetachVpcFromNetLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachVpcFromNetLinkResponse self = new DetachVpcFromNetLinkResponse();
        return TeaModel.build(map, self);
    }

    public DetachVpcFromNetLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachVpcFromNetLinkResponse setBody(DetachVpcFromNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVpcFromNetLinkResponseBody getBody() {
        return this.body;
    }

}
