// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleSummaryByRiskLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody body;

    public static GetAggregateConfigRuleSummaryByRiskLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleSummaryByRiskLevelResponse self = new GetAggregateConfigRuleSummaryByRiskLevelResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponse setBody(GetAggregateConfigRuleSummaryByRiskLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody getBody() {
        return this.body;
    }

}
