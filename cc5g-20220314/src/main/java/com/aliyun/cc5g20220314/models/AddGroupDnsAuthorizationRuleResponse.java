// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AddGroupDnsAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGroupDnsAuthorizationRuleResponseBody body;

    public static AddGroupDnsAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupDnsAuthorizationRuleResponse self = new AddGroupDnsAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupDnsAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupDnsAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupDnsAuthorizationRuleResponse setBody(AddGroupDnsAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupDnsAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
