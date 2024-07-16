// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DetachVpcFromNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachVpcFromNetLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachVpcFromNetLinkResponse setBody(DetachVpcFromNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVpcFromNetLinkResponseBody getBody() {
        return this.body;
    }

}
