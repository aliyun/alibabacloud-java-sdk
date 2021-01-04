// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeleteCcCustomedRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCcCustomedRuleResponseBody body;

    public static DeleteCcCustomedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCcCustomedRuleResponse self = new DeleteCcCustomedRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCcCustomedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCcCustomedRuleResponse setBody(DeleteCcCustomedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCcCustomedRuleResponseBody getBody() {
        return this.body;
    }

}
