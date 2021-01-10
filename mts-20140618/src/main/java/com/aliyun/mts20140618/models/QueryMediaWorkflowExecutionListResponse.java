// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowExecutionListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMediaWorkflowExecutionListResponse setBody(QueryMediaWorkflowExecutionListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaWorkflowExecutionListResponseBody getBody() {
        return this.body;
    }

}
