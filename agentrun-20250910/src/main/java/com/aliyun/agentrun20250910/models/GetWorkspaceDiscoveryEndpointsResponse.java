// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetWorkspaceDiscoveryEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiscoveryEndpointsResult body;

    public static GetWorkspaceDiscoveryEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceDiscoveryEndpointsResponse self = new GetWorkspaceDiscoveryEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceDiscoveryEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceDiscoveryEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceDiscoveryEndpointsResponse setBody(GetDiscoveryEndpointsResult body) {
        this.body = body;
        return this;
    }
    public GetDiscoveryEndpointsResult getBody() {
        return this.body;
    }

}
