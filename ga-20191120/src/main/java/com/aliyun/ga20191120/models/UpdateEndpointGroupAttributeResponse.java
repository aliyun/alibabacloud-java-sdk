// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEndpointGroupAttributeResponseBody body;

    public static UpdateEndpointGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupAttributeResponse self = new UpdateEndpointGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEndpointGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEndpointGroupAttributeResponse setBody(UpdateEndpointGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEndpointGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
