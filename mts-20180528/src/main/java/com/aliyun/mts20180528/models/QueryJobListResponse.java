// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryJobListResponseBody body;

    public static QueryJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryJobListResponse self = new QueryJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryJobListResponse setBody(QueryJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryJobListResponseBody getBody() {
        return this.body;
    }

}
