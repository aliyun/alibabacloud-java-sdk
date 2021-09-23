// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGovernanceKubernetesClusterResponseBody body;

    public static CreateGovernanceKubernetesClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGovernanceKubernetesClusterResponse self = new CreateGovernanceKubernetesClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateGovernanceKubernetesClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGovernanceKubernetesClusterResponse setBody(CreateGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
