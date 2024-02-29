// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateIsolationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIsolationRuleResponseBody body;

    public static CreateIsolationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIsolationRuleResponse self = new CreateIsolationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateIsolationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIsolationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIsolationRuleResponse setBody(CreateIsolationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIsolationRuleResponseBody getBody() {
        return this.body;
    }

}
