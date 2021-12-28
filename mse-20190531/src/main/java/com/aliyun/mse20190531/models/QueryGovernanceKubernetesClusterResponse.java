// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGovernanceKubernetesClusterResponseBody body;

    public static QueryGovernanceKubernetesClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGovernanceKubernetesClusterResponse self = new QueryGovernanceKubernetesClusterResponse();
        return TeaModel.build(map, self);
    }

    public QueryGovernanceKubernetesClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGovernanceKubernetesClusterResponse setBody(QueryGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
