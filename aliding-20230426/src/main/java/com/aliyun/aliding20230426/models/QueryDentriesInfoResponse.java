// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentriesInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDentriesInfoResponseBody body;

    public static QueryDentriesInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDentriesInfoResponse self = new QueryDentriesInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDentriesInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDentriesInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDentriesInfoResponse setBody(QueryDentriesInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDentriesInfoResponseBody getBody() {
        return this.body;
    }

}
