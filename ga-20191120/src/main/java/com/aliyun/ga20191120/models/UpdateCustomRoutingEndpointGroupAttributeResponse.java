// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomRoutingEndpointGroupAttributeResponseBody body;

    public static UpdateCustomRoutingEndpointGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointGroupAttributeResponse self = new UpdateCustomRoutingEndpointGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponse setBody(UpdateCustomRoutingEndpointGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomRoutingEndpointGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
