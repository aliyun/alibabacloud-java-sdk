// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIpcQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIpcQuotaResponseBody body;

    public static QueryIpcQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpcQuotaResponse self = new QueryIpcQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpcQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIpcQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIpcQuotaResponse setBody(QueryIpcQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIpcQuotaResponseBody getBody() {
        return this.body;
    }

}
