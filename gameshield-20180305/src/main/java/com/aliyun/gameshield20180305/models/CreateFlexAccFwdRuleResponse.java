// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateFlexAccFwdRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlexAccFwdRuleResponseBody body;

    public static CreateFlexAccFwdRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlexAccFwdRuleResponse self = new CreateFlexAccFwdRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlexAccFwdRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlexAccFwdRuleResponse setBody(CreateFlexAccFwdRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlexAccFwdRuleResponseBody getBody() {
        return this.body;
    }

}
