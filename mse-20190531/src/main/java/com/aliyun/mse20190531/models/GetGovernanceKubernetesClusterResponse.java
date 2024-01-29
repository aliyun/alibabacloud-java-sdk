// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGovernanceKubernetesClusterResponseBody body;

    public static GetGovernanceKubernetesClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterResponse self = new GetGovernanceKubernetesClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceKubernetesClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGovernanceKubernetesClusterResponse setBody(GetGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
