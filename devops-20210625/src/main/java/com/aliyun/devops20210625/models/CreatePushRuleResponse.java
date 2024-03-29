// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePushRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePushRuleResponseBody body;

    public static CreatePushRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePushRuleResponse self = new CreatePushRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreatePushRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePushRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePushRuleResponse setBody(CreatePushRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePushRuleResponseBody getBody() {
        return this.body;
    }

}
