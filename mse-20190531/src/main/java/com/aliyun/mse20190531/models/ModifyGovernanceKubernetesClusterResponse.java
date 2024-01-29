// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyGovernanceKubernetesClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGovernanceKubernetesClusterResponse setBody(ModifyGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
