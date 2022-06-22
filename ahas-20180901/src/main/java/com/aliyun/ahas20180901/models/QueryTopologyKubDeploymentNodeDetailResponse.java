// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentNodeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTopologyKubDeploymentNodeDetailResponseBody body;

    public static QueryTopologyKubDeploymentNodeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentNodeDetailResponse self = new QueryTopologyKubDeploymentNodeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentNodeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTopologyKubDeploymentNodeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTopologyKubDeploymentNodeDetailResponse setBody(QueryTopologyKubDeploymentNodeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTopologyKubDeploymentNodeDetailResponseBody getBody() {
        return this.body;
    }

}
