// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryGovernanceKubernetesClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryGovernanceKubernetesClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGovernanceKubernetesClusterResponse setBody(QueryGovernanceKubernetesClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

}
