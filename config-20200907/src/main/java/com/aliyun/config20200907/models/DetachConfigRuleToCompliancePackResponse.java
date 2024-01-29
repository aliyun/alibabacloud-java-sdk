// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachConfigRuleToCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachConfigRuleToCompliancePackResponseBody body;

    public static DetachConfigRuleToCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachConfigRuleToCompliancePackResponse self = new DetachConfigRuleToCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public DetachConfigRuleToCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachConfigRuleToCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachConfigRuleToCompliancePackResponse setBody(DetachConfigRuleToCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachConfigRuleToCompliancePackResponseBody getBody() {
        return this.body;
    }

}
