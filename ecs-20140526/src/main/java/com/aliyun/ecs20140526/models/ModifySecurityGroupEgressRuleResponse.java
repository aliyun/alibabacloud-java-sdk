// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifySecurityGroupEgressRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupEgressRuleResponse setBody(ModifySecurityGroupEgressRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupEgressRuleResponseBody getBody() {
        return this.body;
    }

}
