// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryFinanceUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFinanceUserInfoResponseBody body;

    public static QueryFinanceUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFinanceUserInfoResponse self = new QueryFinanceUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryFinanceUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFinanceUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFinanceUserInfoResponse setBody(QueryFinanceUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFinanceUserInfoResponseBody getBody() {
        return this.body;
    }

}
