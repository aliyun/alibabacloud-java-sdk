// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceAbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTraceAbResponseBody body;

    public static QueryTraceAbResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbResponse self = new QueryTraceAbResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceAbResponse setBody(QueryTraceAbResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceAbResponseBody getBody() {
        return this.body;
    }

}
