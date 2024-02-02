// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifySecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupRuleResponse setBody(ModifySecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
