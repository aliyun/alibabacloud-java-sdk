// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRuleResponseBody body;

    public static ModifyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleResponse self = new ModifyRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRuleResponse setBody(ModifyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRuleResponseBody getBody() {
        return this.body;
    }

}
