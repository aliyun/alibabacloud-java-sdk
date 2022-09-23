// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryGroupDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGroupDetailListResponseBody body;

    public static QueryGroupDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupDetailListResponse self = new QueryGroupDetailListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupDetailListResponse setBody(QueryGroupDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupDetailListResponseBody getBody() {
        return this.body;
    }

}
