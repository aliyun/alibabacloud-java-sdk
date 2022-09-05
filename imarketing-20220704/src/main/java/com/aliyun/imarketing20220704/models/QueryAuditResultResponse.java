// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAuditResultResponseBody body;

    public static QueryAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditResultResponse self = new QueryAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAuditResultResponse setBody(QueryAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAuditResultResponseBody getBody() {
        return this.body;
    }

}
