// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClusterSecurityGroupRuleResponseBody body;

    public static ModifyClusterSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterSecurityGroupRuleResponse self = new ModifyClusterSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterSecurityGroupRuleResponse setBody(ModifyClusterSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
