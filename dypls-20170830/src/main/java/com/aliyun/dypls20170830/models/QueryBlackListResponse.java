// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBlackListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBlackListResponseBody body;

    public static QueryBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlackListResponse self = new QueryBlackListResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBlackListResponse setBody(QueryBlackListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlackListResponseBody getBody() {
        return this.body;
    }

}
