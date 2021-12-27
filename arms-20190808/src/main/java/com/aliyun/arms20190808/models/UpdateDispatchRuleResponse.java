// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateDispatchRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDispatchRuleResponseBody body;

    public static UpdateDispatchRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDispatchRuleResponse self = new UpdateDispatchRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDispatchRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDispatchRuleResponse setBody(UpdateDispatchRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDispatchRuleResponseBody getBody() {
        return this.body;
    }

}
