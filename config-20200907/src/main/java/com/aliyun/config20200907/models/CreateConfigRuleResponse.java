// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateConfigRuleResponse setBody(CreateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
