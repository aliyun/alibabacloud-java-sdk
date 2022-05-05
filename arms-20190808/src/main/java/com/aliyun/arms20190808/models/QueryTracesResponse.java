// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryTracesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTracesResponseBody body;

    public static QueryTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTracesResponse self = new QueryTracesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTracesResponse setBody(QueryTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTracesResponseBody getBody() {
        return this.body;
    }

}
