// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetManagedRuleResponseBody body;

    public static GetManagedRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedRuleResponse self = new GetManagedRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedRuleResponse setBody(GetManagedRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedRuleResponseBody getBody() {
        return this.body;
    }

}
