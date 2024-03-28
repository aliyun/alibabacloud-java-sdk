// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomRoutingEndpointsResponseBody body;

    public static DeleteCustomRoutingEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointsResponse self = new DeleteCustomRoutingEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomRoutingEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomRoutingEndpointsResponse setBody(DeleteCustomRoutingEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomRoutingEndpointsResponseBody getBody() {
        return this.body;
    }

}
