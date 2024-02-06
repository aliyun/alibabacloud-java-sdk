// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryMcubeMiniTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcubeMiniTaskResponse setBody(QueryMcubeMiniTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeMiniTaskResponseBody getBody() {
        return this.body;
    }

}
