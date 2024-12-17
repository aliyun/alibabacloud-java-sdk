// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryEmployeeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryEmployeeDetailResponseBody body;

    public static QueryEmployeeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmployeeDetailResponse self = new QueryEmployeeDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmployeeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEmployeeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEmployeeDetailResponse setBody(QueryEmployeeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEmployeeDetailResponseBody getBody() {
        return this.body;
    }

}
