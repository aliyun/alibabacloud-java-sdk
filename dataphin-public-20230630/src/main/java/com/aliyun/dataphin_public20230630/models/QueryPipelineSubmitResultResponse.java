// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class QueryPipelineSubmitResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPipelineSubmitResultResponseBody body;

    public static QueryPipelineSubmitResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineSubmitResultResponse self = new QueryPipelineSubmitResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryPipelineSubmitResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPipelineSubmitResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPipelineSubmitResultResponse setBody(QueryPipelineSubmitResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPipelineSubmitResultResponseBody getBody() {
        return this.body;
    }

}
