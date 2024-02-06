// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisCoreIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryPushAnalysisCoreIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushAnalysisCoreIndexResponse setBody(QueryPushAnalysisCoreIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushAnalysisCoreIndexResponseBody getBody() {
        return this.body;
    }

}
