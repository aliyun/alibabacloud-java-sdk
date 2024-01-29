// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleComplianceByPackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetConfigRuleComplianceByPackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigRuleComplianceByPackResponse setBody(GetConfigRuleComplianceByPackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleComplianceByPackResponseBody getBody() {
        return this.body;
    }

}
