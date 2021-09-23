// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGovernanceKubernetesClusterResponseBody body;

    public static ModifyGovernanceKubernetesClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGovernanceKubernetesClusterResponse self = new ModifyGovernanceKubernetesClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGovernanceKubernetesClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGovernanceKubernetesClusterResponse setBody(ModifyGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
