// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlKeywordsFromSqlTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse setBody(GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponseBody getBody() {
        return this.body;
    }

}
