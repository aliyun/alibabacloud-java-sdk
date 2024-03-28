// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEndpointGroupsResponseBody body;

    public static UpdateEndpointGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupsResponse self = new UpdateEndpointGroupsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEndpointGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEndpointGroupsResponse setBody(UpdateEndpointGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEndpointGroupsResponseBody getBody() {
        return this.body;
    }

}
