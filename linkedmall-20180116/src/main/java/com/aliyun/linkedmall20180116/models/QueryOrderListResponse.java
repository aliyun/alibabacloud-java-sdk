// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderListResponseBody body;

    public static QueryOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListResponse self = new QueryOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderListResponse setBody(QueryOrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderListResponseBody getBody() {
        return this.body;
    }

}
