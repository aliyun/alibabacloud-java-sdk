// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEndpointGroupsResponseBody body;

    public static DeleteEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupsResponse self = new DeleteEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEndpointGroupsResponse setBody(DeleteEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
