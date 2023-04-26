// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVccGrantRuleResponseBody body;

    public static CreateVccGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVccGrantRuleResponse self = new CreateVccGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateVccGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVccGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVccGrantRuleResponse setBody(CreateVccGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVccGrantRuleResponseBody getBody() {
        return this.body;
    }

}
