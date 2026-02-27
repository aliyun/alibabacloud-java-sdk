// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryVideoAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVideoAuditResultResponseBody body;

    public static QueryVideoAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoAuditResultResponse self = new QueryVideoAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVideoAuditResultResponse setBody(QueryVideoAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoAuditResultResponseBody getBody() {
        return this.body;
    }

}
