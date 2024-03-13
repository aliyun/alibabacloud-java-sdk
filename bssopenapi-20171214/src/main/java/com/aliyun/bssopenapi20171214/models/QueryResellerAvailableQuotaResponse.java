// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResellerAvailableQuotaResponseBody body;

    public static QueryResellerAvailableQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaResponse self = new QueryResellerAvailableQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryResellerAvailableQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResellerAvailableQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResellerAvailableQuotaResponse setBody(QueryResellerAvailableQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResellerAvailableQuotaResponseBody getBody() {
        return this.body;
    }

}
