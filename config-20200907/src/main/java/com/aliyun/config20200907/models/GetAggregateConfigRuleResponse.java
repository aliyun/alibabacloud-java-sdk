// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateConfigRuleResponseBody body;

    public static GetAggregateConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleResponse self = new GetAggregateConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateConfigRuleResponse setBody(GetAggregateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
