// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicEndpointGroupResponseBody body;

    public static GetBasicEndpointGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointGroupResponse self = new GetBasicEndpointGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicEndpointGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicEndpointGroupResponse setBody(GetBasicEndpointGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

}
