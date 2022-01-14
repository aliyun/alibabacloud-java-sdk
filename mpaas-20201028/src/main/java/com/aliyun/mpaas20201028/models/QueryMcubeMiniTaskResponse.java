// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcubeMiniTaskResponseBody body;

    public static QueryMcubeMiniTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniTaskResponse self = new QueryMcubeMiniTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcubeMiniTaskResponse setBody(QueryMcubeMiniTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeMiniTaskResponseBody getBody() {
        return this.body;
    }

}
