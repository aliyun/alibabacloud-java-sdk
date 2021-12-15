// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTraceExtractResponseBody body;

    public static QueryTraceExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceExtractResponse self = new QueryTraceExtractResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceExtractResponse setBody(QueryTraceExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceExtractResponseBody getBody() {
        return this.body;
    }

}
