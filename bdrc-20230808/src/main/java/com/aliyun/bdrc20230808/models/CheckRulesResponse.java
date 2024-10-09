// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CheckRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRulesResponseBody body;

    public static CheckRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRulesResponse self = new CheckRulesResponse();
        return TeaModel.build(map, self);
    }

    public CheckRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRulesResponse setBody(CheckRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRulesResponseBody getBody() {
        return this.body;
    }

}
