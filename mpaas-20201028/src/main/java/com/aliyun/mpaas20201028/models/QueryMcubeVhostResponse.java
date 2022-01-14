// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeVhostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMcubeVhostResponse setBody(QueryMcubeVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeVhostResponseBody getBody() {
        return this.body;
    }

}
