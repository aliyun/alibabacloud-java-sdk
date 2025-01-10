// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdGrantRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpdGrantRuleResponseBody body;

    public static CreateVpdGrantRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdGrantRuleResponse self = new CreateVpdGrantRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpdGrantRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpdGrantRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpdGrantRuleResponse setBody(CreateVpdGrantRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpdGrantRuleResponseBody getBody() {
        return this.body;
    }

}
