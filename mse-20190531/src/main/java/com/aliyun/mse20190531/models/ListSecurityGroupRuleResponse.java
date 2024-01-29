// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityGroupRuleResponseBody body;

    public static ListSecurityGroupRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupRuleResponse self = new ListSecurityGroupRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityGroupRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityGroupRuleResponse setBody(ListSecurityGroupRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

}
