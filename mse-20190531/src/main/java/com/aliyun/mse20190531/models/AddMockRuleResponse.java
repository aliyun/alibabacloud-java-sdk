// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMockRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddMockRuleResponseBody body;

    public static AddMockRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMockRuleResponse self = new AddMockRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddMockRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMockRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMockRuleResponse setBody(AddMockRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMockRuleResponseBody getBody() {
        return this.body;
    }

}
