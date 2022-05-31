// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachAggregateConfigRuleToCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachAggregateConfigRuleToCompliancePackResponseBody body;

    public static AttachAggregateConfigRuleToCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachAggregateConfigRuleToCompliancePackResponse self = new AttachAggregateConfigRuleToCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public AttachAggregateConfigRuleToCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachAggregateConfigRuleToCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachAggregateConfigRuleToCompliancePackResponse setBody(AttachAggregateConfigRuleToCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachAggregateConfigRuleToCompliancePackResponseBody getBody() {
        return this.body;
    }

}
