// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowExecutionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMediaWorkflowExecutionListResponseBody body;

    public static QueryMediaWorkflowExecutionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowExecutionListResponse self = new QueryMediaWorkflowExecutionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowExecutionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaWorkflowExecutionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaWorkflowExecutionListResponse setBody(QueryMediaWorkflowExecutionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaWorkflowExecutionListResponseBody getBody() {
        return this.body;
    }

}
