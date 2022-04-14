// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateDNSAuthorizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDNSAuthorizationRuleResponse setBody(UpdateDNSAuthorizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDNSAuthorizationRuleResponseBody getBody() {
        return this.body;
    }

}
