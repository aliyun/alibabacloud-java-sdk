// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ModifyDegradeRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDegradeRuleResponseBody body;

    public static ModifyDegradeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDegradeRuleResponse self = new ModifyDegradeRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDegradeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDegradeRuleResponse setBody(ModifyDegradeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDegradeRuleResponseBody getBody() {
        return this.body;
    }

}
