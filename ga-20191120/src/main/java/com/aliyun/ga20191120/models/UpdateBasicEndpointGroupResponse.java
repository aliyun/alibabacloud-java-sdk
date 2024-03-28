// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBasicEndpointGroupResponseBody body;

    public static UpdateBasicEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointGroupResponse self = new UpdateBasicEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBasicEndpointGroupResponse setBody(UpdateBasicEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
