// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlKeywordsFromSqlTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body;

    public static GetSqlConcurrencyControlKeywordsFromSqlTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlKeywordsFromSqlTextResponse self = new GetSqlConcurrencyControlKeywordsFromSqlTextResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse setBody(GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody getBody() {
        return this.body;
    }

}
