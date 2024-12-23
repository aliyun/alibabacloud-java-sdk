// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryQuotaResponseBody body;

    public static QueryQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaResponse self = new QueryQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryQuotaResponse setBody(QueryQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryQuotaResponseBody getBody() {
        return this.body;
    }

}
