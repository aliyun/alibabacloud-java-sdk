// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AddDNSAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDNSAuthorizationRuleResponseBody body;

    public static AddDNSAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDNSAuthorizationRuleResponse self = new AddDNSAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddDNSAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDNSAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDNSAuthorizationRuleResponse setBody(AddDNSAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDNSAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
