// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateGroupDnsAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGroupDnsAuthorizationRuleResponseBody body;

    public static UpdateGroupDnsAuthorizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDnsAuthorizationRuleResponse self = new UpdateGroupDnsAuthorizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDnsAuthorizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDnsAuthorizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupDnsAuthorizationRuleResponse setBody(UpdateGroupDnsAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDnsAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
