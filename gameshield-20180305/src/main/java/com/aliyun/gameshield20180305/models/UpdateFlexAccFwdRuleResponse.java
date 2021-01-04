// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccFwdRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexAccFwdRuleResponseBody body;

    public static UpdateFlexAccFwdRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccFwdRuleResponse self = new UpdateFlexAccFwdRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccFwdRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexAccFwdRuleResponse setBody(UpdateFlexAccFwdRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexAccFwdRuleResponseBody getBody() {
        return this.body;
    }

}
