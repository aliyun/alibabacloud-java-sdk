// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceComplianceByConfigRuleResponseBody body;

    public static GetResourceComplianceByConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByConfigRuleResponse self = new GetResourceComplianceByConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByConfigRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceComplianceByConfigRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceComplianceByConfigRuleResponse setBody(GetResourceComplianceByConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceByConfigRuleResponseBody getBody() {
        return this.body;
    }

}
