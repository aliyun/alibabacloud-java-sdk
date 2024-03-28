// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomRoutingEndpointsResponseBody body;

    public static UpdateCustomRoutingEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointsResponse self = new UpdateCustomRoutingEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomRoutingEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomRoutingEndpointsResponse setBody(UpdateCustomRoutingEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomRoutingEndpointsResponseBody getBody() {
        return this.body;
    }

}
