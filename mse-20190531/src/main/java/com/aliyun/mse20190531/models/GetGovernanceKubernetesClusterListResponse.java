// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGovernanceKubernetesClusterListResponseBody body;

    public static GetGovernanceKubernetesClusterListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterListResponse self = new GetGovernanceKubernetesClusterListResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceKubernetesClusterListResponse setBody(GetGovernanceKubernetesClusterListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceKubernetesClusterListResponseBody getBody() {
        return this.body;
    }

}
