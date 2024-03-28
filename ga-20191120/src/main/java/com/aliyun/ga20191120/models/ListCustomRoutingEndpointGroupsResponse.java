// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomRoutingEndpointGroupsResponseBody body;

    public static ListCustomRoutingEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointGroupsResponse self = new ListCustomRoutingEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomRoutingEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomRoutingEndpointGroupsResponse setBody(ListCustomRoutingEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomRoutingEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
