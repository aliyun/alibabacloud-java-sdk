// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlRulesHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlConcurrencyControlRulesHistoryResponseBody body;

    public static GetSqlConcurrencyControlRulesHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlRulesHistoryResponse self = new GetSqlConcurrencyControlRulesHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlRulesHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlConcurrencyControlRulesHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlConcurrencyControlRulesHistoryResponse setBody(GetSqlConcurrencyControlRulesHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConcurrencyControlRulesHistoryResponseBody getBody() {
        return this.body;
    }

}
