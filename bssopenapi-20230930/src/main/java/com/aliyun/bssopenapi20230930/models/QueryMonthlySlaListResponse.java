// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryMonthlySlaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMonthlySlaListResponseBody body;

    public static QueryMonthlySlaListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlySlaListResponse self = new QueryMonthlySlaListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlySlaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonthlySlaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMonthlySlaListResponse setBody(QueryMonthlySlaListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonthlySlaListResponseBody getBody() {
        return this.body;
    }

}
