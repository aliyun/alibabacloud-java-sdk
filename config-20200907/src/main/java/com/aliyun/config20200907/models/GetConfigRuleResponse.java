// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigRuleResponseBody body;

    public static GetConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleResponse self = new GetConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRuleResponse setBody(GetConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleResponseBody getBody() {
        return this.body;
    }

}
