// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSecurityGroupRuleResponse setBody(AddSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
