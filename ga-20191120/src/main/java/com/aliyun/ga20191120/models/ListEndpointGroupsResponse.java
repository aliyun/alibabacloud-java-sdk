// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEndpointGroupsResponseBody body;

    public static ListEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointGroupsResponse self = new ListEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEndpointGroupsResponse setBody(ListEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
