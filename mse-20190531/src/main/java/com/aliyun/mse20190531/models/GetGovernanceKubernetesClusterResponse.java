// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetGovernanceKubernetesClusterResponse setBody(GetGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
