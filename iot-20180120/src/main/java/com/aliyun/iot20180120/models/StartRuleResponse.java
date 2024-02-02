// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRuleResponseBody body;

    public static StartRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRuleResponse self = new StartRuleResponse();
        return TeaModel.build(map, self);
    }

    public StartRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRuleResponse setBody(StartRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRuleResponseBody getBody() {
        return this.body;
    }

}
