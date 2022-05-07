// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupAuthorizationRuleResponseBody body;

    public static CreateGroupAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupAuthorizationRuleResponse self = new CreateGroupAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupAuthorizationRuleResponse setBody(CreateGroupAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
