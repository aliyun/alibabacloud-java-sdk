// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifySystemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySystemRuleResponseBody body;

    public static ModifySystemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemRuleResponse self = new ModifySystemRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySystemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySystemRuleResponse setBody(ModifySystemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySystemRuleResponseBody getBody() {
        return this.body;
    }

}
