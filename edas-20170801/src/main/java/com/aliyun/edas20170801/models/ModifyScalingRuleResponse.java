// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ModifyScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyScalingRuleResponseBody body;

    public static ModifyScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingRuleResponse self = new ModifyScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyScalingRuleResponse setBody(ModifyScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyScalingRuleResponseBody getBody() {
        return this.body;
    }

}
