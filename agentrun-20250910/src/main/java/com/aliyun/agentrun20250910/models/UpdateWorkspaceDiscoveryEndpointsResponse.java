// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDiscoveryEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiscoveryEndpointsResult body;

    public static UpdateWorkspaceDiscoveryEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDiscoveryEndpointsResponse self = new UpdateWorkspaceDiscoveryEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDiscoveryEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceDiscoveryEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceDiscoveryEndpointsResponse setBody(GetDiscoveryEndpointsResult body) {
        this.body = body;
        return this;
    }
    public GetDiscoveryEndpointsResult getBody() {
        return this.body;
    }

}
