// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubDeploymentOverviewResponseBody body;

    public static QueryTopologyKubDeploymentOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentOverviewResponse self = new QueryTopologyKubDeploymentOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubDeploymentOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubDeploymentOverviewResponse setBody(QueryTopologyKubDeploymentOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubDeploymentOverviewResponseBody getBody() {
        return this.body;
    }

}
