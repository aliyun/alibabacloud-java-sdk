// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigRuleResponseBody body;

    public static CreateConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRuleResponse self = new CreateConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigRuleResponse setBody(CreateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
