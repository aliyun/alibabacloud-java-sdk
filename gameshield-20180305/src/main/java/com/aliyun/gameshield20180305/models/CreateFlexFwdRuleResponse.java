// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexFwdRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlexFwdRuleResponseBody body;

    public static CreateFlexFwdRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexFwdRuleResponse self = new CreateFlexFwdRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlexFwdRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlexFwdRuleResponse setBody(CreateFlexFwdRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlexFwdRuleResponseBody getBody() {
        return this.body;
    }

}
