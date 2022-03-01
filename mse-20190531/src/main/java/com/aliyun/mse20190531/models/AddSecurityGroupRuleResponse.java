// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSecurityGroupRuleResponseBody body;

    public static AddSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityGroupRuleResponse self = new AddSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSecurityGroupRuleResponse setBody(AddSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
