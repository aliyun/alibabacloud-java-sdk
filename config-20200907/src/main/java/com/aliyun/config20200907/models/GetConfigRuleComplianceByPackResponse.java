// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigRuleComplianceByPackResponseBody body;

    public static GetConfigRuleComplianceByPackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleComplianceByPackResponse self = new GetConfigRuleComplianceByPackResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleComplianceByPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRuleComplianceByPackResponse setBody(GetConfigRuleComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
