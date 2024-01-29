// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleSummaryByRiskLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigRuleSummaryByRiskLevelResponseBody body;

    public static GetConfigRuleSummaryByRiskLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleSummaryByRiskLevelResponse self = new GetConfigRuleSummaryByRiskLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleSummaryByRiskLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigRuleSummaryByRiskLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigRuleSummaryByRiskLevelResponse setBody(GetConfigRuleSummaryByRiskLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigRuleSummaryByRiskLevelResponseBody getBody() {
        return this.body;
    }

}
