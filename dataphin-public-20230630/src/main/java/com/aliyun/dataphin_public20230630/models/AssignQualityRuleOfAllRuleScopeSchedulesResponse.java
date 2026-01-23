// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AssignQualityRuleOfAllRuleScopeSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignQualityRuleOfAllRuleScopeSchedulesResponseBody body;

    public static AssignQualityRuleOfAllRuleScopeSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignQualityRuleOfAllRuleScopeSchedulesResponse self = new AssignQualityRuleOfAllRuleScopeSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignQualityRuleOfAllRuleScopeSchedulesResponse setBody(AssignQualityRuleOfAllRuleScopeSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignQualityRuleOfAllRuleScopeSchedulesResponseBody getBody() {
        return this.body;
    }

}
