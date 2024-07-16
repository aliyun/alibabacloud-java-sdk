// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AttachVpcToNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AttachVpcToNetLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVpcToNetLinkResponse setBody(AttachVpcToNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVpcToNetLinkResponseBody getBody() {
        return this.body;
    }

}
