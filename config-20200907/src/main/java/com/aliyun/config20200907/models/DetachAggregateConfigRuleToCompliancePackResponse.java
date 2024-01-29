// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachAggregateConfigRuleToCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachAggregateConfigRuleToCompliancePackResponseBody body;

    public static DetachAggregateConfigRuleToCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAggregateConfigRuleToCompliancePackResponse self = new DetachAggregateConfigRuleToCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public DetachAggregateConfigRuleToCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachAggregateConfigRuleToCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachAggregateConfigRuleToCompliancePackResponse setBody(DetachAggregateConfigRuleToCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAggregateConfigRuleToCompliancePackResponseBody getBody() {
        return this.body;
    }

}
