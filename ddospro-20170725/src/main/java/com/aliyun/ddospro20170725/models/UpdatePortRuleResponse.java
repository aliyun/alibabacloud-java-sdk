// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdatePortRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePortRuleResponseBody body;

    public static UpdatePortRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortRuleResponse self = new UpdatePortRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePortRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePortRuleResponse setBody(UpdatePortRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePortRuleResponseBody getBody() {
        return this.body;
    }

}
