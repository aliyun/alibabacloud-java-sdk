// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryGroupCorpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGroupCorpListResponseBody body;

    public static QueryGroupCorpListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupCorpListResponse self = new QueryGroupCorpListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupCorpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupCorpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupCorpListResponse setBody(QueryGroupCorpListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupCorpListResponseBody getBody() {
        return this.body;
    }

}
