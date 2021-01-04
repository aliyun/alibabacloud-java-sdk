// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdateCcCustomedRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcCustomedRuleResponseBody body;

    public static UpdateCcCustomedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcCustomedRuleResponse self = new UpdateCcCustomedRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcCustomedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcCustomedRuleResponse setBody(UpdateCcCustomedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcCustomedRuleResponseBody getBody() {
        return this.body;
    }

}
