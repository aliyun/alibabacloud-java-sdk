// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEndpointGroupResponseBody body;

    public static DeleteEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupResponse self = new DeleteEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEndpointGroupResponse setBody(DeleteEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
