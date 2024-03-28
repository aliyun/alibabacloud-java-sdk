// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEndpointGroupResponseBody body;

    public static UpdateEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupResponse self = new UpdateEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEndpointGroupResponse setBody(UpdateEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
