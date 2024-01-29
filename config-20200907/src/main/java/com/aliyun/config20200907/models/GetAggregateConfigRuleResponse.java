// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAggregateConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateConfigRuleResponse setBody(GetAggregateConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRuleResponseBody getBody() {
        return this.body;
    }

}
