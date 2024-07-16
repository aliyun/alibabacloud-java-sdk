// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateDNSAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDNSAuthorizationRuleResponseBody body;

    public static UpdateDNSAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSAuthorizationRuleResponse self = new UpdateDNSAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDNSAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDNSAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDNSAuthorizationRuleResponse setBody(UpdateDNSAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDNSAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
