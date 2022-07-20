// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCensorJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCensorJobListResponseBody body;

    public static QueryCensorJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCensorJobListResponse self = new QueryCensorJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCensorJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCensorJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCensorJobListResponse setBody(QueryCensorJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCensorJobListResponseBody getBody() {
        return this.body;
    }

}
