// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageCommodityListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStorageCommodityListResponseBody body;

    public static QueryStorageCommodityListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageCommodityListResponse self = new QueryStorageCommodityListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStorageCommodityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStorageCommodityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStorageCommodityListResponse setBody(QueryStorageCommodityListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStorageCommodityListResponseBody getBody() {
        return this.body;
    }

}
