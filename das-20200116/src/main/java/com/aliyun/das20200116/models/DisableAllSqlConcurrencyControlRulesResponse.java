// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAllSqlConcurrencyControlRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAllSqlConcurrencyControlRulesResponseBody body;

    public static DisableAllSqlConcurrencyControlRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAllSqlConcurrencyControlRulesResponse self = new DisableAllSqlConcurrencyControlRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableAllSqlConcurrencyControlRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAllSqlConcurrencyControlRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAllSqlConcurrencyControlRulesResponse setBody(DisableAllSqlConcurrencyControlRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAllSqlConcurrencyControlRulesResponseBody getBody() {
        return this.body;
    }

}
