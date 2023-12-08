// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class QueryNetListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNetListResponseBody body;

    public static QueryNetListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNetListResponse self = new QueryNetListResponse();
        return TeaModel.build(map, self);
    }

    public QueryNetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNetListResponse setBody(QueryNetListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNetListResponseBody getBody() {
        return this.body;
    }

}
