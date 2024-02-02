// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceHistoricDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEdgeInstanceHistoricDeploymentResponseBody body;

    public static QueryEdgeInstanceHistoricDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceHistoricDeploymentResponse self = new QueryEdgeInstanceHistoricDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEdgeInstanceHistoricDeploymentResponse setBody(QueryEdgeInstanceHistoricDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceHistoricDeploymentResponseBody getBody() {
        return this.body;
    }

}
