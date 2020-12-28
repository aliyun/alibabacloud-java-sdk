// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityGroupEgressRuleResponseBody body;

    public static ModifySecurityGroupEgressRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupEgressRuleResponse self = new ModifySecurityGroupEgressRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupEgressRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupEgressRuleResponse setBody(ModifySecurityGroupEgressRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupEgressRuleResponseBody getBody() {
        return this.body;
    }

}
