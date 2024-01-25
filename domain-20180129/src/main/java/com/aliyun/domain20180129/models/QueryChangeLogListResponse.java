// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryChangeLogListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChangeLogListResponseBody body;

    public static QueryChangeLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChangeLogListResponse self = new QueryChangeLogListResponse();
        return TeaModel.build(map, self);
    }

    public QueryChangeLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChangeLogListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChangeLogListResponse setBody(QueryChangeLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChangeLogListResponseBody getBody() {
        return this.body;
    }

}
