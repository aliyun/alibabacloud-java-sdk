// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityGroupRuleResponseBody body;

    public static ModifySecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupRuleResponse self = new ModifySecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupRuleResponse setBody(ModifySecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
