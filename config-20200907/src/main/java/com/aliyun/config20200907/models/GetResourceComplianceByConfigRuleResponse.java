// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByConfigRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetResourceComplianceByConfigRuleResponse setBody(GetResourceComplianceByConfigRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceByConfigRuleResponseBody getBody() {
        return this.body;
    }

}
