// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPoolInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPoolInfoListResponseBody body;

    public static QueryPoolInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPoolInfoListResponse self = new QueryPoolInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPoolInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPoolInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPoolInfoListResponse setBody(QueryPoolInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPoolInfoListResponseBody getBody() {
        return this.body;
    }

}
