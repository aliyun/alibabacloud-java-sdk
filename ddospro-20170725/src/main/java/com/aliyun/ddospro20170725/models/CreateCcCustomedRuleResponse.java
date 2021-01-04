// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateCcCustomedRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCcCustomedRuleResponseBody body;

    public static CreateCcCustomedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCcCustomedRuleResponse self = new CreateCcCustomedRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCcCustomedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCcCustomedRuleResponse setBody(CreateCcCustomedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCcCustomedRuleResponseBody getBody() {
        return this.body;
    }

}
