// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMcubeVhostResponseBody body;

    public static QueryMcubeVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeVhostResponse self = new QueryMcubeVhostResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcubeVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcubeVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMcubeVhostResponse setBody(QueryMcubeVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeVhostResponseBody getBody() {
        return this.body;
    }

}
