// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryControlListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryControlListResponseBody body;

    public static QueryControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryControlListResponse self = new QueryControlListResponse();
        return TeaModel.build(map, self);
    }

    public QueryControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryControlListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryControlListResponse setBody(QueryControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryControlListResponseBody getBody() {
        return this.body;
    }

}
