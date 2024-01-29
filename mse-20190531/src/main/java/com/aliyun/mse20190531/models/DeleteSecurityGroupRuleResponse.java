// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityGroupRuleResponseBody body;

    public static DeleteSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRuleResponse self = new DeleteSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityGroupRuleResponse setBody(DeleteSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
