// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceHistoricDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryEdgeInstanceHistoricDeploymentResponse setBody(QueryEdgeInstanceHistoricDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceHistoricDeploymentResponseBody getBody() {
        return this.body;
    }

}
