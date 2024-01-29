// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceComplianceByConfigRuleResponseBody body;

    public static GetAggregateResourceComplianceByConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByConfigRuleResponse self = new GetAggregateResourceComplianceByConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceByConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceComplianceByConfigRuleResponse setBody(GetAggregateResourceComplianceByConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceByConfigRuleResponseBody getBody() {
        return this.body;
    }

}
