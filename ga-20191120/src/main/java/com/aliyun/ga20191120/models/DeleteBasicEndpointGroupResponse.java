// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBasicEndpointGroupResponseBody body;

    public static DeleteBasicEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointGroupResponse self = new DeleteBasicEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicEndpointGroupResponse setBody(DeleteBasicEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
