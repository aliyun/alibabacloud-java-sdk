// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackInstanceListResponseBody body;

    public static QueryAttackInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceListResponse self = new QueryAttackInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackInstanceListResponse setBody(QueryAttackInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackInstanceListResponseBody getBody() {
        return this.body;
    }

}
