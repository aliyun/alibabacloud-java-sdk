// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisCoreIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushAnalysisCoreIndexResponseBody body;

    public static QueryPushAnalysisCoreIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisCoreIndexResponse self = new QueryPushAnalysisCoreIndexResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisCoreIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushAnalysisCoreIndexResponse setBody(QueryPushAnalysisCoreIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushAnalysisCoreIndexResponseBody getBody() {
        return this.body;
    }

}
