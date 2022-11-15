// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomRoutingEndpointsResponseBody body;

    public static ListCustomRoutingEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointsResponse self = new ListCustomRoutingEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingEndpointsResponse setBody(ListCustomRoutingEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingEndpointsResponseBody getBody() {
        return this.body;
    }

}
