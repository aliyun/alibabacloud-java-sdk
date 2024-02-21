// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRunningSqlConcurrencyControlRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRunningSqlConcurrencyControlRulesResponseBody body;

    public static GetRunningSqlConcurrencyControlRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunningSqlConcurrencyControlRulesResponse self = new GetRunningSqlConcurrencyControlRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetRunningSqlConcurrencyControlRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunningSqlConcurrencyControlRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRunningSqlConcurrencyControlRulesResponse setBody(GetRunningSqlConcurrencyControlRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunningSqlConcurrencyControlRulesResponseBody getBody() {
        return this.body;
    }

}
