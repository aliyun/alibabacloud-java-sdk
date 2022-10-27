// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryMallCategoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMallCategoryListResponseBody body;

    public static QueryMallCategoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMallCategoryListResponse self = new QueryMallCategoryListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMallCategoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMallCategoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMallCategoryListResponse setBody(QueryMallCategoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMallCategoryListResponseBody getBody() {
        return this.body;
    }

}
