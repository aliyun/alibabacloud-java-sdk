// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryProductListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductListResponseBody body;

    public static QueryProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListResponse self = new QueryProductListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductListResponse setBody(QueryProductListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductListResponseBody getBody() {
        return this.body;
    }

}
