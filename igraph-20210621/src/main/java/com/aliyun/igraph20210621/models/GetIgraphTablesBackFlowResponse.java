// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetIgraphTablesBackFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIgraphTablesBackFlowResponseBody body;

    public static GetIgraphTablesBackFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIgraphTablesBackFlowResponse self = new GetIgraphTablesBackFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetIgraphTablesBackFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIgraphTablesBackFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIgraphTablesBackFlowResponse setBody(GetIgraphTablesBackFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIgraphTablesBackFlowResponseBody getBody() {
        return this.body;
    }

}
