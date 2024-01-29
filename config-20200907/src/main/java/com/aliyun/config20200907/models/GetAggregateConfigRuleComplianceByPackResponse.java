// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateConfigRuleComplianceByPackResponseBody body;

    public static GetAggregateConfigRuleComplianceByPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleComplianceByPackResponse self = new GetAggregateConfigRuleComplianceByPackResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleComplianceByPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateConfigRuleComplianceByPackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateConfigRuleComplianceByPackResponse setBody(GetAggregateConfigRuleComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRuleComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
