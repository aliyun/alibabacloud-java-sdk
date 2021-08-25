// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveAggregateConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeactiveAggregateConfigRulesResponseBody body;

    public static DeactiveAggregateConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveAggregateConfigRulesResponse self = new DeactiveAggregateConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveAggregateConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactiveAggregateConfigRulesResponse setBody(DeactiveAggregateConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactiveAggregateConfigRulesResponseBody getBody() {
        return this.body;
    }

}
