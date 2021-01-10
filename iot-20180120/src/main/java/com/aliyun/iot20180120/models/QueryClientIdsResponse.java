// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryClientIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryClientIdsResponseBody body;

    public static QueryClientIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClientIdsResponse self = new QueryClientIdsResponse();
        return TeaModel.build(map, self);
    }

    public QueryClientIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryClientIdsResponse setBody(QueryClientIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryClientIdsResponseBody getBody() {
        return this.body;
    }

}
